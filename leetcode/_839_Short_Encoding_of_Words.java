package com.hama.leetcode;
/**
Given a list of words, we may encode it by writing a reference string S and a list of indexes A.

For example, if the list of words is [time, me, bell], we can write it as S = time#bell#&nbsp;and indexes = [0, 2, 5].

Then for each index, we will recover the word by reading from the reference string from that index until we reach a # character.

What is the length of the shortest reference string S possible that encodes the given words?

Example:


Input: words = [time, me, bell]
Output: 10
Explanation: S = time#bell# and indexes = [0, 2, 5].


&nbsp;

Note:


	1 &lt;= words.length&nbsp;&lt;= 2000.
	1 &lt;=&nbsp;words[i].length&nbsp;&lt;= 7.
	Each word&nbsp;has only&nbsp;lowercase letters.

**/
class _839_Short_Encoding_of_Words {
    public int minimumLengthEncoding(String[] words) {
        
    }
}