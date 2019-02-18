package com.hama.leetcode;
/**
Given a paragraph&nbsp;and a list of banned words, return the most frequent word that is not in the list of banned words.&nbsp; It is guaranteed there is at least one word that isn&#39;t banned, and that the answer is unique.

Words in the list of banned words are given in lowercase, and free of punctuation.&nbsp; Words in the paragraph are not case sensitive.&nbsp; The answer is in lowercase.

&nbsp;

Example:


Input: 
paragraph = Bob hit a ball, the hit BALL flew far after it was hit.
banned = [hit]
Output: ball
Explanation: 
hit occurs 3 times, but it is a banned word.
ball occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as ball,), 
and that hit isn&#39;t the answer even though it occurs more because it is banned.


&nbsp;

Note: 


	1 &lt;= paragraph.length &lt;= 1000.
	1 &lt;= banned.length &lt;= 100.
	1 &lt;= banned[i].length &lt;= 10.
	The answer is unique, and written in lowercase (even if its occurrences in paragraph&nbsp;may have&nbsp;uppercase symbols, and even if it is a proper noun.)
	paragraph only consists of letters, spaces, or the punctuation symbols !?&#39;,;.
	There are no hyphens or hyphenated words.
	Words only consist of letters, never apostrophes or other punctuation symbols.

**/
class _837_Most_Common_Word {
    public String mostCommonWord(String paragraph, String[] banned) {
        
    }
}