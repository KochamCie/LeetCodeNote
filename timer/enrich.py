# -*- coding: UTF-8 -*-
import schedule
import template.question as question_template
import template.leetcode as leetcode_template
import timer.creator as creator_template
import resource.constant as constant

payloadHeader = {
    'Content-Type': 'application/json'
}


def job():
    target_questions = question_template.questions_without_content(constant.QUESTION_WITHOUT_CONTENT_LIMIT)
    for question in target_questions:
        detail = leetcode_template.question_detail(question)
        question_template.save_content(question[0], detail.get('content'), detail.get('codeSnippets')[1].get('code'))
        creator_template.code(question[0], question[1],  detail.get('content'), detail.get('codeSnippets')[1].get('code'))
        print(question[1], 'finished')


schedule.every(constant.ENRICH_INTERVAL).seconds.do(job)


while True:
    schedule.run_pending()
