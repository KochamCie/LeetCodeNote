package com.hama.leetcode;
/**
A subarray A[i], A[i+1], ..., A[j]&nbsp;of A is said to be turbulent if and only if:


	For i &lt;= k &lt; j, A[k] &gt; A[k+1] when k is odd, and A[k] &lt; A[k+1] when k is even;
	OR, for i &lt;= k &lt; j, A[k] &gt; A[k+1] when k is even, and A[k] &lt; A[k+1] when k is odd.


That is, the subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.

Return the length of a&nbsp;maximum size turbulent subarray of A.

&nbsp;


Example 1:


Input: [9,4,2,10,7,8,8,1,9]
Output: 5
Explanation: (A[1] &gt; A[2] &lt; A[3] &gt; A[4] &lt; A[5])



Example 2:


Input: [4,8,12,16]
Output: 2



Example 3:


Input: [100]
Output: 1





&nbsp;

Note:


	1 &lt;= A.length &lt;= 40000
	0 &lt;= A[i] &lt;= 10^9

**/
class _1020_Longest_Turbulent_Subarray {
    public int maxTurbulenceSize(int[] A) {
        
    }
}