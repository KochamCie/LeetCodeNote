package com.hama.leetcode;
/**
You have a list of&nbsp;words and a pattern, and you want to know which words in words matches the pattern.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)

Return a list of the words in words&nbsp;that match the given pattern.&nbsp;

You may return the answer in any order.

&nbsp;


Example 1:


Input: words = [abc,deq,mee,aqq,dkd,ccc], pattern = abb
Output: [mee,aqq]
Explanation: mee matches the pattern because there is a permutation {a -&gt; m, b -&gt; e, ...}. 
ccc does not match the pattern because {a -&gt; c, b -&gt; c, ...} is not a permutation,
since a and b map to the same letter.

&nbsp;

Note:


	1 &lt;= words.length &lt;= 50
	1 &lt;= pattern.length = words[i].length&nbsp;&lt;= 20


**/
class _926_Find_and_Replace_Pattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
    }
}