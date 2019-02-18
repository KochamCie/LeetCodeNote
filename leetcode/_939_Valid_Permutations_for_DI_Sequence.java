package com.hama.leetcode;
/**
We are given S, a length n string of characters from the set {&#39;D&#39;, &#39;I&#39;}. (These letters stand for decreasing and increasing.)

A&nbsp;valid permutation&nbsp;is a permutation P[0], P[1], ..., P[n] of integers&nbsp;{0, 1, ..., n}, such that for all i:


	If S[i] == &#39;D&#39;, then P[i] &gt; P[i+1], and;
	If S[i] == &#39;I&#39;, then P[i] &lt; P[i+1].


How many valid permutations are there?&nbsp; Since the answer may be large, return your answer modulo 10^9 + 7.

&nbsp;

Example 1:


Input: DID
Output: 5
Explanation: 
The 5 valid permutations of (0, 1, 2, 3) are:
(1, 0, 3, 2)
(2, 0, 3, 1)
(2, 1, 3, 0)
(3, 0, 2, 1)
(3, 1, 2, 0)


&nbsp;

Note:


	1 &lt;= S.length &lt;= 200
	S consists only of characters from the set {&#39;D&#39;, &#39;I&#39;}.



&nbsp;

**/
class _939_Valid_Permutations_for_DI_Sequence {
    public int numPermsDISequence(String S) {
        
    }
}