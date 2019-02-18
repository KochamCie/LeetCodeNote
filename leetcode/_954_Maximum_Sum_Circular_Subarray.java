package com.hama.leetcode;
/**
Given a circular&nbsp;array&nbsp;C of integers represented by&nbsp;A, find the maximum possible sum of a non-empty subarray of C.

Here, a&nbsp;circular&nbsp;array means the end of the array connects to the beginning of the array.&nbsp; (Formally, C[i] = A[i] when 0 &lt;= i &lt; A.length, and C[i+A.length] = C[i]&nbsp;when&nbsp;i &gt;= 0.)

Also, a subarray may only include each element of the fixed buffer A at most once.&nbsp; (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i &lt;= k1, k2 &lt;= j with k1 % A.length&nbsp;= k2 % A.length.)

&nbsp;


Example 1:


Input: [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3



Example 2:


Input: [5,-3,5]
Output: 10
Explanation:&nbsp;Subarray [5,5] has maximum sum 5 + 5 = 10



Example 3:


Input: [3,-1,2,-1]
Output: 4
Explanation:&nbsp;Subarray [2,-1,3] has maximum sum 2 + (-1) + 3 = 4



Example 4:


Input: [3,-2,2,-3]
Output: 3
Explanation:&nbsp;Subarray [3] and [3,-2,2] both have maximum sum 3


Example 5:


Input: [-2,-3,-1]
Output: -1
Explanation:&nbsp;Subarray [-1] has maximum sum -1


&nbsp;

Note: 


	-30000 &lt;= A[i] &lt;= 30000
	1 &lt;= A.length &lt;= 30000





**/
class _954_Maximum_Sum_Circular_Subarray {
    public int maxSubarraySumCircular(int[] A) {
        
    }
}