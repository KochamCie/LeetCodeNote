# -*- coding: UTF-8 -*-

import template.leetcode as leetcode_template
import template.question as question_template
import resource.table as table_template
import resource.datasource as ddl


def fetch_all_problems():
    table_template.normal(ddl.QUESTION_DROP)
    table_template.normal(ddl.QUESTION_CREATE)
    for data in leetcode_template.question_all():
        question_template.save_problem(data.get('stat').get('question_id'),
                     data.get('difficulty').get('level'),
                     data.get('stat').get('question__title'),
                     data.get('stat').get('question__title_slug'),
                     data.get('paid_only'),
                     )


fetch_all_problems()
