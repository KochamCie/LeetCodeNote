## LeetCode Note
> 目的是辅助leetcoder刷题时做笔记，用于博客或是代码注释等。
#### 使用场景
首先需要提醒一下的是，刷题时最好在leetcode上直接敲代码做题而不是在IDE上做题。
通常情况下，做题过程中我是不写注释或者是思路这些的。


当做完一题我会新建一个java类进行记录，比如复制题目的Description到类注释上，然后将解题代码复制到类主体中：
``` 
package com.hama.leetcode;

/**
 * @Author: rns
 * @Date: 2019/2/2 下午7:16
 * @Description: _001_Two_Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class _001_Two_Sum {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int temp =target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(i == j){
                    continue;
                }
                if(temp == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
```
根据自身习惯或者情况进行注释编写。开始刷题的时候是想通过一篇篇博客进行记录的，实则是太耗时耗力，所以决定通过使用java类在关键地方进行注释起到提示和记录作用
#### 脚本介绍
按照上述的那种方式做了几十题，逐渐觉得做一题新建个类然后copy paste copy paste比较费事儿，而且mbp的切换应用窗口比较蛋疼要切几次，
所以写了个爬虫来抓取题目信息事先生成这些题目类


1. 脚本中限制了只爬取免费的，俺是个非人民币玩家哈～爬全部的话需充钱
2. 目前脚本不支持增量更新题目，也就是说只会处理problems.py里面获取的题目信息
3. 脚本暂时只支持生成java语言文件，如果需要其他的可以自行改改比如改改文件后缀，主体内容格式等
4. 前150道题蛮经典的，涵盖了满多知识点，（这800多道免费题肝完都要好久好久）

#### 使用方法
- 配置数据库信息，脚本需要使用mysql数据库，数据库配置信息在resource/datasource.py中
    ```python
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
    
    ```
- 初始化题目信息，执行core/problems.py
- 生成java文件，执行timer/enrich2.py，大约需要几分钟吧
- 脚本支持的可配置项在resource/constant中：
    ```python
    # -*- coding: UTF-8 -*-
    # 每次处理的数量
    QUESTION_WITHOUT_CONTENT_LIMIT = 100
    
    QUESTION_LIMIT = 10
    # java文件生成存放的目录
    JAVA_FILE_PATH = '/Users/rns/Documents/workplace/idea/leetcode/src/main/java/com/hama/leetcode/'
    # java文件首行的package信息
    JAVA_FILE_PACKAGE = 'package com.hama.leetcode;'
    # 定时任务的频率，秒为单位
    ENRICH_INTERVAL = 10
    ALL_API = 'https://leetcode.com/api/problems/all/'
    QUESTION_API = 'https://leetcode.com/graphql'
    ```
> 如果你是javaer的话可以直接拿走leetcode文件夹，里头是到1038题序号的
