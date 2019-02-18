# -*- coding: UTF-8 -*-

import mysql.connector
import resource.datasource as datasource


def question(question_id):
    conn = mysql.connector.connect(user=datasource.USER, password=datasource.PASSWORD, database=datasource.DATABASE, use_unicode=True)
    cursor = conn.cursor()
    cursor.execute('select question_id, question_title, question_title_slug, question_level, question_content, question_snippet, question_paid_only from question where question_id = %s', [question_id])
    result = cursor.fetchone()
    conn.commit()
    cursor.close()
    return result


def questions(limit):
    conn = mysql.connector.connect(user=datasource.USER, password=datasource.PASSWORD, database=datasource.DATABASE, use_unicode=True)
    cursor = conn.cursor()
    cursor.execute('select question_id, question_title, question_title_slug, question_level, question_content, question_snippet, question_paid_only from question limit %s', [limit])
    result = cursor.fetchall()
    conn.commit()
    cursor.close()
    return result


def questions_without_content(limit):
    conn = mysql.connector.connect(user=datasource.USER, password=datasource.PASSWORD, database=datasource.DATABASE, use_unicode=True)
    cursor = conn.cursor()
    cursor.execute('select question_id, question_title, question_title_slug, question_level, question_content, question_snippet, question_paid_only from question where question_content is null and question_paid_only=0 limit %s', [limit])
    questions = cursor.fetchall()
    conn.commit()
    cursor.close()
    return questions


def count():
    conn = mysql.connector.connect(user=datasource.USER, password=datasource.PASSWORD, database=datasource.DATABASE, use_unicode=True)
    cursor = conn.cursor()
    cursor.execute('select count(question_id) as total from question')
    count = cursor.fetchone()
    conn.commit()
    cursor.close()
    return count[0]


def save_problem(question_id, question_level, question_title, question_title_slug, question_paid_only):
    print('save_problem start ======>', question_id, question_level, question_title, question_title_slug)
    conn = mysql.connector.connect(user=datasource.USER, password=datasource.PASSWORD, database=datasource.DATABASE, use_unicode=True)
    cursor = conn.cursor()
    cursor.execute(
        'insert into question(question_id, question_level, question_title, question_title_slug, question_paid_only) values (%s, %s, %s, %s, %s)',
        [question_id, question_level, question_title, question_title_slug, question_paid_only])
    conn.commit()
    cursor.close()


def save_content(question_id, question_content, question_snippet):
    conn = mysql.connector.connect(user=datasource.USER, password=datasource.PASSWORD, database=datasource.DATABASE, use_unicode=True)
    cursor = conn.cursor()
    cursor.execute('update question set question_content=%s, question_snippet=%s where question_id = %s', (question_content, question_snippet, question_id))
    conn.commit()
    cursor.close()
    print("save question content, ", question_id)


#
#
# {
#     u'status': None,
#     u'stat': {
#         u'total_acs': 4404,
#         u'question__title': u'Time Based Key-Value Store',
#         u'is_new_question': False,
#         u'question__article__slug': u'time-based-key-value-store',
#         u'total_submitted': 9070,
#         u'frontend_question_id': 981,
#         u'question__title_slug': u'time-based-key-value-store',
#         u'question__article__live': True,
#         u'question__hide': False,
#         u'question_id': 1023
#     },
#     u'is_favor': False,
#     u'paid_only': False,
#     u'difficulty':
#         {
#             u'level': 2
#         },
#     u'frequency': 0,
#     u'progress': 0
# }



#
# {
#     u'data': {
#         u'question': {
#             u'companyTagStats': None,
#             u'sampleTestCase': u'[2,7,11,15]\n9',
#             u'questionFrontendId': u'1',
#             u'contributors': [],
#             u'isPaidOnly': False,
#             u'dislikes': 315,
#             u'likes': 9754,
#             u'metaData': u'{\r\n  "name": "twoSum",\r\n  "params": [\r\n    {\r\n      "name": "nums",\r\n      "type": "integer[]"\r\n    },\r\n    {\r\n      "name": "target",\r\n      "type": "integer"\r\n    }\r\n  ],\r\n  "return": {\r\n    "type": "integer[]",\r\n    "size": 2\r\n  }\r\n}',
#             u'stats': u'{"totalAccepted": "1.4M", "totalSubmission": "3.5M", "totalAcceptedRaw": 1410142, "totalSubmissionRaw": 3502222, "acRate": "40.3%"}',
#             u'title': u'Two Sum', u'isLiked': None, u'__typename': u'QuestionNode', u'topicTags': [{u'translatedName': None, u'__typename': u'TopicTagNode', u'name': u'Array', u'slug': u'array'}, {u'translatedName': None, u'__typename': u'TopicTagNode', u'name': u'Hash Table', u'slug': u'hash-table'}], u'content': u'<p>Given an array of integers, return <strong>indices</strong> of the two numbers such that they add up to a specific target.</p>\r\n\r\n<p>You may assume that each input would have <strong><em>exactly</em></strong> one solution, and you may not use the <em>same</em> element twice.</p>\r\n\r\n<p><strong>Example:</strong></p>\r\n\r\n<pre>\r\nGiven nums = [2, 7, 11, 15], target = 9,\r\n\r\nBecause nums[<strong>0</strong>] + nums[<strong>1</strong>] = 2 + 7 = 9,\r\nreturn [<strong>0</strong>, <strong>1</strong>].\r\n</pre>\r\n\r\n<p>&nbsp;</p>\r\n', u'enableTestMode': False, u'langToValidPlayground': u'{"cpp": true, "java": true, "python": true, "python3": true, "mysql": false, "mssql": false, "oraclesql": false, "c": false, "csharp": false, "javascript": false, "ruby": false, "bash": false, "swift": false, "golang": false, "scala": false, "html": false, "pythonml": false, "kotlin": false, "rust": false, "php": false}', u'status': None, u'questionId': u'1', u'boundTopicId': None, u'judgeType': u'small', u'translatedContent': None, u'envInfo': u'{"cpp": ["C++", "<p>Compiled with <code>g++ 8.2</code> using the latest C++ 17 standard.</p>\\r\\n\\r\\n<p>Your code is compiled with level one optimization (<code>-O1</code>). <a href=\\"https://github.com/google/sanitizers/wiki/AddressSanitizer\\" target=\\"_blank\\">AddressSanitizer</a> is also enabled to help detect out-of-bounds and use-after-free bugs.</p>\\r\\n\\r\\n<p>Most standard library headers are already included automatically for your convenience.</p>"], "java": ["Java", "<p>Compiled with <code>java 1.8.0</code> taking advantage of the latest Java 8 features such as lambda expressions and stream API.</p>\\n\\n<p>Most standard library headers are already included automatically for your convenience.</p>"], "python": ["Python", "<p>Compiled with <code>python 2.7.12</code>.</p>\\n\\n<p>Most libraries are already imported automatically for your convenience, such as <a href=\\"https://docs.python.org/2/library/array.html\\" target=\\"_blank\\">array</a>, <a href=\\"https://docs.python.org/2/library/bisect.html\\" target=\\"_blank\\">bisect</a>, <a href=\\"https://docs.python.org/2/library/collections.html\\" target=\\"_blank\\">collections</a>. If you need more libraries, you can import it yourself.</p>\\n\\n<p>Note that Python 2.7 <a href=\\"https://www.python.org/dev/peps/pep-0373/\\" target=\\"_blank\\">will not be maintained past 2020</a>. For the latest Python, please choose Python3 instead.</p>"], "c": ["C", "<p>Compiled with <code>gcc 8.2</code> using the gnu99 standard.</p>\\r\\n\\r\\n<p>Your code is compiled with level one optimization (<code>-O1</code>). <a href=\\"https://github.com/google/sanitizers/wiki/AddressSanitizer\\" target=\\"_blank\\">AddressSanitizer</a> is also enabled to help detect out-of-bounds and use-after-free bugs.</p>\\r\\n\\r\\n<p>Most standard library headers are already included automatically for your convenience.</p>\\r\\n\\r\\n<p>For hash table operations, you may use <a href=\\"https://troydhanson.github.io/uthash/\\" target=\\"_blank\\">uthash</a>. \\"uthash.h\\" is included by default. Below are some examples:</p>\\r\\n\\r\\n<p><b>1. Adding an item to a hash.</b>\\r\\n<pre>\\r\\nstruct hash_entry {\\r\\n    int id;            /* we\'ll use this field as the key */\\r\\n    char name[10];\\r\\n    UT_hash_handle hh; /* makes this structure hashable */\\r\\n};\\r\\n\\r\\nstruct hash_entry *users = NULL;\\r\\n\\r\\nvoid add_user(struct hash_entry *s) {\\r\\n    HASH_ADD_INT(users, id, s);\\r\\n}\\r\\n</pre>\\r\\n</p>\\r\\n\\r\\n<p><b>2. Looking up an item in a hash:</b>\\r\\n<pre>\\r\\nstruct hash_entry *find_user(int user_id) {\\r\\n    struct hash_entry *s;\\r\\n    HASH_FIND_INT(users, &user_id, s);\\r\\n    return s;\\r\\n}\\r\\n</pre>\\r\\n</p>\\r\\n\\r\\n<p><b>3. Deleting an item in a hash:</b>\\r\\n<pre>\\r\\nvoid delete_user(struct hash_entry *user) {\\r\\n    HASH_DEL(users, user);  \\r\\n}\\r\\n</pre>\\r\\n</p>"], "csharp": ["C#", "<p>Compiled with <code>mono 5.18.0</code> providing <a href=\\"https://docs.microsoft.com/en-us/dotnet/csharp/whats-new/csharp-7\\" target=\\"_blank\\">full support for C# 7</a>.</p>\\r\\n\\r\\n<p>Your code is compiled with debug flag enabled (<code>/debug</code>).</p>"], "javascript": ["JavaScript", "<p>Run with <code>nodejs 10.15.0</code>.</p>\\r\\n\\r\\n<p>Your code is run with <code>--harmony</code> flag, enabling <a href=\\"http://node.green/\\" target=\\"_blank\\">new ES6 features</a>.</p>\\r\\n\\r\\n<p><a href=\\"https://lodash.com\\" target=\\"_blank\\">lodash.js</a> library is included by default.</p>"], "ruby": ["Ruby", "<p>Run with <code>ruby 2.4.5</code>.</p>"], "swift": ["Swift", "<p>Compiled with <code>swift 4.2</code>.</p>\\r\\n\\r\\n<p>We usually keep up with the <a href=\\"https://swift.org/download/\\" target=\\"_blank\\">latest Swift released by Apple</a>, if not please let us know and we will update it as soon as possible!</p>"], "golang": ["Go", "<p>Compiled with <code>go 1.11.4</code>.</p>"], "python3": ["Python3", "<p>Run with <code>python 3.6</code>.</p>\\n\\n<p>Most libraries are already imported automatically for your convenience, such as <a href=\\"https://docs.python.org/3/library/array.html\\" target=\\"_blank\\">array</a>, <a href=\\"https://docs.python.org/3/library/bisect.html\\" target=\\"_blank\\">bisect</a>, <a href=\\"https://docs.python.org/3/library/collections.html\\" target=\\"_blank\\">collections</a>. If you need more libraries, you can import it yourself.</p>"], "scala": ["Scala", "<p>Compiled with <code>scala 2.11.6</code>.</p>"], "kotlin": ["Kotlin", "<p>Compiled with <code>kotlin 1.2.50</code>.</p>"], "rust": ["Rust", "<p>Compiled with <code>rust 1.31.0 (edition = 2018)</code></p>\\r\\n\\r\\n<p>Supports <a href=\\"https://crates.io/crates/rand\\" target=\\"_blank\\">rand</a>\\u00a0from crates.io</p>"], "php": ["PHP", "<p>Run with <code>PHP 7.2</code>.</p>"]}', u'difficulty': u'Easy', u'hints': [], u'codeSnippets': [{u'lang': u'C++', u'code': u'class Solution {\r\npublic:\r\n    vector<int> twoSum(vector<int>& nums, int target) {\r\n        \r\n    }\r\n};', u'langSlug': u'cpp', u'__typename': u'CodeSnippetNode'}, {u'lang': u'Java', u'code': u'class Solution {\r\n    public int[] twoSum(int[] nums, int target) {\r\n        \r\n    }\r\n}', u'langSlug': u'java', u'__typename': u'CodeSnippetNode'}, {u'lang': u'Python', u'code': u'class Solution(object):\r\n    def twoSum(self, nums, target):\r\n        """\r\n        :type nums: List[int]\r\n        :type target: int\r\n        :rtype: List[int]\r\n        """\r\n        ', u'langSlug': u'python', u'__typename': u'CodeSnippetNode'}, {u'lang': u'Python3', u'code': u"class Solution:\n    def twoSum(self, nums: 'List[int]', target: 'int') -> 'List[int]':\n        ", u'langSlug': u'python3', u'__typename': u'CodeSnippetNode'}, {u'lang': u'C', u'code': u'/**\r\n * Note: The returned array must be malloced, assume caller calls free().\r\n */\r\nint* twoSum(int* nums, int numsSize, int target) {\r\n    \r\n}', u'langSlug': u'c', u'__typename': u'CodeSnippetNode'}, {u'lang': u'C#', u'code': u'public class Solution {\r\n    public int[] TwoSum(int[] nums, int target) {\r\n        \r\n    }\r\n}', u'langSlug': u'csharp', u'__typename': u'CodeSnippetNode'}, {u'lang': u'JavaScript', u'code': u'/**\n * @param {number[]} nums\n * @param {number} target\n * @return {number[]}\n */\nvar twoSum = function(nums, target) {\n    \n};', u'langSlug': u'javascript', u'__typename': u'CodeSnippetNode'}, {u'lang': u'Ruby', u'code': u'# @param {Integer[]} nums\r\n# @param {Integer} target\r\n# @return {Integer[]}\r\ndef two_sum(nums, target)\r\n    \r\nend', u'langSlug': u'ruby', u'__typename': u'CodeSnippetNode'}, {u'lang': u'Swift', u'code': u'class Solution {\r\n    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {\r\n        \r\n    }\r\n}', u'langSlug': u'swift', u'__typename': u'CodeSnippetNode'}, {u'lang': u'Go', u'code': u'func twoSum(nums []int, target int) []int {\r\n    \r\n}', u'langSlug': u'golang', u'__typename': u'CodeSnippetNode'}, {u'lang': u'Scala', u'code': u'object Solution {\r\n    def twoSum(nums: Array[Int], target: Int): Array[Int] = {\r\n        \r\n    }\r\n}', u'langSlug': u'scala', u'__typename': u'CodeSnippetNode'}, {u'lang': u'Kotlin', u'code': u'class Solution {\r\n    fun twoSum(nums: IntArray, target: Int): IntArray {\r\n        \r\n    }\r\n}', u'langSlug': u'kotlin', u'__typename': u'CodeSnippetNode'}, {u'lang': u'Rust', u'code': u'impl Solution {\r\n    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {\r\n        \r\n    }\r\n}', u'langSlug': u'rust', u'__typename': u'CodeSnippetNode'}, {u'lang': u'PHP', u'code': u'class Solution {\r\n\r\n    /**\r\n     * @param Integer[] $nums\r\n     * @param Integer $target\r\n     * @return Integer[]\r\n     */\r\n    function twoSum($nums, $target) {\r\n        \r\n    }\r\n}', u'langSlug': u'php', u'__typename': u'CodeSnippetNode'}], u'judgerAvailable': True, u'titleSlug': u'two-sum', u'solution': {u'canSeeDetail': True, u'id': u'7', u'__typename': u'ArticleNode'}, u'enableRunCode': True, u'similarQuestions': u'[{"title": "3Sum", "titleSlug": "3sum", "difficulty": "Medium", "translatedTitle": null}, {"title": "4Sum", "titleSlug": "4sum", "difficulty": "Medium", "translatedTitle": null}, {"title": "Two Sum II - Input array is sorted", "titleSlug": "two-sum-ii-input-array-is-sorted", "difficulty": "Easy", "translatedTitle": null}, {"title": "Two Sum III - Data structure design", "titleSlug": "two-sum-iii-data-structure-design", "difficulty": "Easy", "translatedTitle": null}, {"title": "Subarray Sum Equals K", "titleSlug": "subarray-sum-equals-k", "difficulty": "Medium", "translatedTitle": null}, {"title": "Two Sum IV - Input is a BST", "titleSlug": "two-sum-iv-input-is-a-bst", "difficulty": "Easy", "translatedTitle": null}]', u'mysqlSchemas': [], u'translatedTitle': None}
#     }
# }

