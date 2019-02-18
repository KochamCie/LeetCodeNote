package com.hama.leetcode;
/**
A sequence X_1, X_2, ..., X_n&nbsp;is fibonacci-like if:


	n &gt;= 3
	X_i + X_{i+1} = X_{i+2}&nbsp;for all&nbsp;i + 2 &lt;= n


Given a strictly increasing&nbsp;array&nbsp;A of positive integers forming a sequence, find the length of the longest fibonacci-like subsequence of A.&nbsp; If one does not exist, return 0.

(Recall that a subsequence is derived from another sequence A by&nbsp;deleting any number of&nbsp;elements (including none)&nbsp;from A, without changing the order of the remaining elements.&nbsp; For example, [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].)

&nbsp;




Example 1:


Input: [1,2,3,4,5,6,7,8]
Output: 5
Explanation:
The longest subsequence that is fibonacci-like: [1,2,3,5,8].


Example 2:


Input: [1,3,7,11,12,14,18]
Output: 3
Explanation:
The longest subsequence that is fibonacci-like:
[1,11,12], [3,11,14] or [7,11,18].


&nbsp;

Note:


	3 &lt;= A.length &lt;= 1000
	1 &lt;= A[0] &lt; A[1] &lt; ... &lt; A[A.length - 1] &lt;= 10^9
	(The time limit has been reduced by 50% for submissions in Java, C, and C++.)

**/
class _905_Length_of_Longest_Fibonacci_Subsequence {
    public int lenLongestFibSubseq(int[] A) {
        
    }
}