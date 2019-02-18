# -*- coding:utf-8 -*-
USER = 'root'
PASSWORD = '123456'
DATABASE = 'leetcode'
QUESTION_DROP = 'DROP TABLE IF EXISTS `question`;'
QUESTION_CREATE = 'CREATE TABLE `question` ( ' \
                  '`question_id` int(11) NOT NULL,' \
                  '`question_title` varchar(300) COLLATE utf8_bin DEFAULT NULL,' \
                  '`question_title_slug` varchar(500) COLLATE utf8_bin DEFAULT NULL,' \
                  '`question_level` tinyint(1) DEFAULT NULL,' \
                  '`question_content` text COLLATE utf8_bin,' \
                  '`question_snippet` text COLLATE utf8_bin,' \
                  '`question_paid_only` tinyint(1) DEFAULT NULL,' \
                  'PRIMARY KEY (`question_id`)' \
                  ') ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;'
