# -*- coding: UTF-8 -*-
import schedule
import template.question as question_template
import template.leetcode as leetcode_template
import timer.creator as creator_template
import resource.constant as constant

import Queue
import threading
import time
import logging

logging.basicConfig(level=logging.INFO)


def generate(question):
    logging.info('begin %s \n', question)
    if question[6]:
        logging.info('%s not free', question[0])
        return
    detail = leetcode_template.question_detail(question)
    content = detail.get('content') if detail.get('content') is not None else None
    logging.info('snippet is  %s \n', detail.get('codeSnippets'))


    if detail.get('codeSnippets') is None:
        return
    if len(detail.get('codeSnippets')) > 1:
        code = detail.get('codeSnippets')[1].get('code')
    else:
        code = detail.get('codeSnippets')[0].get('code')
    question_template.save_content(question[0], content, code)
    creator_template.code(question[0], question[1], content.encode('utf-8'), code.encode('utf-8'))
    logging.info('%s finished', question[1])
    time.sleep(1)


class ThreadPool(object):
    def __init__(self, max_num=15):
        self.queue = Queue.Queue(max_num)
        for i in range(max_num):
            self.queue.put(threadUpdateHandler())

    def get_thread(self):
        return self.queue.get()

    def add_thread(self):
        self.queue.put(threadUpdateHandler())


class threadUpdateHandler(threading.Thread):
    def __init__(self):
        super(threadUpdateHandler, self).__init__()
        self.result = 0

    def parepare_args(self, name, question, pool=None):
        self.name = name
        self.question = question
        self.pool = pool

    def run(self):
        generate(self.question)

        # try:
        #     generate(self.question)
        # except Exception as e:
        #     logging.error('%s Exception %s \n', e, self.question)
        #     self.result = 1
        if self.pool is not None:
            self.pool.add_thread()

    def get_result(self):
        return self.result


def target_questions():
    return question_template.questions_without_content(constant.QUESTION_WITHOUT_CONTENT_LIMIT)


def option_group_list():
    pool = ThreadPool(10)
    groups = target_questions()

    thread_list = []
    for question in groups:
        t = pool.get_thread()
        t.parepare_args('group', question, pool)
        t.start()
        thread_list.append(t)
    for thread in thread_list:
        thread.join()
    for index, thread in enumerate(thread_list):
        if thread.get_result():
            logging.error('[%s] failed', groups[index])


schedule.every(constant.ENRICH_INTERVAL).seconds.do(option_group_list)


while True:
    schedule.run_pending()
