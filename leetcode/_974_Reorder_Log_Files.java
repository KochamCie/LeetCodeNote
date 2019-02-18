package com.hama.leetcode;
/**
You have an array of logs.&nbsp; Each log is a space delimited string of words.

For each log, the first word in each log is an alphanumeric identifier.&nbsp; Then, either:


	Each word after the identifier will consist only of lowercase letters, or;
	Each word after the identifier will consist only of digits.


We will call these two varieties of logs letter-logs and digit-logs.&nbsp; It is guaranteed that each log has at least one word after its identifier.

Reorder the logs so that all of the letter-logs come before any digit-log.&nbsp; The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.&nbsp; The digit-logs should be put in their original order.

Return the final order of the logs.

&nbsp;


Example 1:


Input: [a1 9 2 3 1,g1 act car,zo4 4 7,ab1 off key dog,a8 act zoo]
Output: [g1 act car,a8 act zoo,ab1 off key dog,a1 9 2 3 1,zo4 4 7]


&nbsp;

Note:


	0 &lt;= logs.length &lt;= 100
	3 &lt;= logs[i].length &lt;= 100
	logs[i] is guaranteed to have an identifier, and a word after the identifier.

**/
class _974_Reorder_Log_Files {
    public String[] reorderLogFiles(String[] logs) {
        
    }
}