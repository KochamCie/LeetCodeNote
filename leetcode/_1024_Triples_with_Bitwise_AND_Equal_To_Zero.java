package com.hama.leetcode;
/**
Given an array of integers A, find the number of&nbsp;triples of indices (i, j, k)&nbsp;such that:


	0 &lt;= i &lt; A.length
	0 &lt;= j &lt; A.length
	0 &lt;= k &lt; A.length
	A[i]&nbsp;&amp; A[j]&nbsp;&amp; A[k] == 0, where &amp;&nbsp;represents the bitwise-AND operator.


&nbsp;

Example 1:


Input: [2,1,3]
Output: 12
Explanation: We could choose the following i, j, k triples:
(i=0, j=0, k=1) : 2 &amp; 2 &amp; 1
(i=0, j=1, k=0) : 2 &amp; 1 &amp; 2
(i=0, j=1, k=1) : 2 &amp; 1 &amp; 1
(i=0, j=1, k=2) : 2 &amp; 1 &amp; 3
(i=0, j=2, k=1) : 2 &amp; 3 &amp; 1
(i=1, j=0, k=0) : 1 &amp; 2 &amp; 2
(i=1, j=0, k=1) : 1 &amp; 2 &amp; 1
(i=1, j=0, k=2) : 1 &amp; 2 &amp; 3
(i=1, j=1, k=0) : 1 &amp; 1 &amp; 2
(i=1, j=2, k=0) : 1 &amp; 3 &amp; 2
(i=2, j=0, k=1) : 3 &amp; 2 &amp; 1
(i=2, j=1, k=0) : 3 &amp; 1 &amp; 2


&nbsp;

Note:


	1 &lt;= A.length &lt;= 1000
	0 &lt;= A[i] &lt; 2^16

**/
class _1024_Triples_with_Bitwise_AND_Equal_To_Zero {
    public int countTriplets(int[] A) {
        
    }
}