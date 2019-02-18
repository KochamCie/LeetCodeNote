# -*- coding: UTF-8 -*-
import os
import template.question as question_template
from UserString import MutableString
import re
import resource.constant as constant
import schedule


def rename(question_id, question_title):
    if question_id < 10:
        question_id = '00'+str(question_id)
    if question_id < 100:
        question_id = '0'+str(question_id)
    title = question_title.replace(' ', '_').replace('-', '_').replace('(', '_').replace(')', '_').replace(',', '_').replace('，', '_').replace('\'', '_').replace('?', '').replace('`', '')
    result = '_'+str(question_id)+'_' + title
    return result


def file_exist(file_path, file_name):
    files = os.listdir(file_path)
    if file_name in files:
        return True
    return False


def code(question_id, question_title, question_content, question_snippet):
    dr = re.compile(r'<[^>]+>', re.S)
    question_content = dr.sub('', question_content)
    file_name = rename(question_id, question_title.encode('utf-8'))
    sb = MutableString()
    sb.append(constant.JAVA_FILE_PACKAGE)
    sb.append("\n")
    sb.append("/**\n")
    sb.append(question_content
              .replace('&quot;', '')
              .replace('*/', '')
              )
    sb.append("**/\n")
    # pattern = re.compile(r'(class )(.+)( {)')
    # question_snippet = re.sub(pattern, 'class '+file_name+' {', question_snippet)
    match_obj = re.match(r'(class )(.+)( {)', question_snippet, re.M | re.I)
    class_name = ''
    if match_obj:
        class_name = match_obj.group(2)
    if question_snippet.find('class') < 0:
        sb.append('class ')
        sb.append(str(file_name))
        sb.append(' {\n')
        sb.append('//')
        sb.append(question_snippet)
        sb.append('\n')
        sb.append('}')
    else:
        sb.append(question_snippet
                  .replace('Solution', str(file_name))
                  .replace(class_name, str(file_name)))
    file_path = constant.JAVA_FILE_PATH
    if not os.path.exists(file_path):
        print 'folder ', file_path, 'not exist, makedir~'
        os.makedirs(file_path)
    temp = str(file_name+'.java')
    if file_exist(file_path, temp):
        print(file_name, 'already exist')
        return
    with open(file_path + temp, 'wb') as file:
        file.write(str(sb))


# def creator():
#     questions = question_template.questions(constant.QUESTION_LIMIT)
#     for question in questions:
#         code(question[0], question[1], question[4], question[5])


#
# schedule.every(10).second.do(creator())
#
# while True:
#     schedule.run_pending()