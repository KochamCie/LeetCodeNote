# -*- coding: UTF-8 -*-
import requests
import resource.constant as constant
import json

payloadHeader = {
    'Content-Type': 'application/json'
}


def question_all():
    r = requests.get(constant.ALL_API)
    j = r.json()
    return j.get('stat_status_pairs')


def question_detail(question):
    title_slug = question[2].decode('utf-8')
    payload_data = {
        "operationName": "questionData",
        "variables": {
            "titleSlug": title_slug
        },
        "query": "query questionData($titleSlug: String!) {\n  question(titleSlug: $titleSlug) {\n    questionId\n    questionFrontendId\n    boundTopicId\n    title\n    titleSlug\n    content\n    translatedTitle\n    translatedContent\n    isPaidOnly\n    difficulty\n    likes\n    dislikes\n    isLiked\n    similarQuestions\n    contributors {\n      username\n      profileUrl\n      avatarUrl\n      __typename\n    }\n    langToValidPlayground\n    topicTags {\n      name\n      slug\n      translatedName\n      __typename\n    }\n    companyTagStats\n    codeSnippets {\n      lang\n      langSlug\n      code\n      __typename\n    }\n    stats\n    hints\n    solution {\n      id\n      canSeeDetail\n      __typename\n    }\n    status\n    sampleTestCase\n    metaData\n    judgerAvailable\n    judgeType\n    mysqlSchemas\n    enableRunCode\n    enableTestMode\n    envInfo\n    __typename\n  }\n}\n"
    }

    r = requests.post(constant.QUESTION_API, data=json.dumps(payload_data), headers=payloadHeader)
    return r.json().get('data').get('question')
