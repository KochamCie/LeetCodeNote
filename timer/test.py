# -*- coding: UTF-8 -*-
import creator
import re
import template.question as question_template

question = question_template.question(192)
creator.code(question[0], question[1], question[4], question[5])
# pattern = re.compile(r'(class )(.+)( {)')
# question_snippet = re.sub(pattern, 'class 666666 {', question[5])
matchObj = re.match(r'(class )(.+)( {)', question[5], re.M | re.I)
if matchObj:
    print matchObj.group(2)

