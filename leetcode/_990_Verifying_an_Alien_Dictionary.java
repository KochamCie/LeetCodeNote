package com.hama.leetcode;
/**
In an alien language, surprisingly they also use english lowercase letters, but possibly&nbsp;in a different order. The&nbsp;order of the alphabet&nbsp;is some permutation&nbsp;of lowercase letters.

Given a sequence of words&nbsp;written in the alien language,&nbsp;and the order of the alphabet,&nbsp;return true if and only if the given words&nbsp;are sorted lexicographicaly in this alien language.

&nbsp;


Example 1:


Input: words = [hello,leetcode], order = hlabcdefgijkmnopqrstuvwxyz
Output: true
Explanation: As &#39;h&#39; comes before &#39;l&#39; in this language, then the sequence is sorted.



Example 2:


Input: words = [word,world,row], order = worldabcefghijkmnpqstuvxyz
Output: false
Explanation: As &#39;d&#39; comes after &#39;l&#39; in this language, then words[0] &gt; words[1], hence the sequence is unsorted.



Example 3:


Input: words = [apple,app], order = abcdefghijklmnopqrstuvwxyz
Output: false
Explanation: The first three characters app match, and the second string is shorter (in size.) According to lexicographical rules apple &gt; app, because &#39;l&#39; &gt; &#39;&empty;&#39;, where &#39;&empty;&#39; is defined as the blank character which is less than any other character (More info).


&nbsp;

Note:


	1 &lt;= words.length &lt;= 100
	1 &lt;= words[i].length &lt;= 20
	order.length == 26
	All characters in words[i] and order are english lowercase letters.




**/
class _990_Verifying_an_Alien_Dictionary {
    public boolean isAlienSorted(String[] words, String order) {
        
    }
}