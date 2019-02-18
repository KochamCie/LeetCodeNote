package com.hama.leetcode;
/**
In an array A containing only 0s and 1s, a K-bit flip&nbsp;consists of choosing a (contiguous) subarray of length K and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0.

Return the minimum number of K-bit flips required so that there is no 0 in the array.&nbsp; If it is not possible, return -1.

&nbsp;

Example 1:


Input: A = [0,1,0], K = 1
Output: 2
Explanation: Flip A[0], then flip A[2].



Example 2:


Input: A = [1,1,0], K = 2
Output: -1
Explanation:&nbsp;No matter how we flip subarrays of size 2, we can&#39;t make the array become [1,1,1].



Example 3:


Input: A = [0,0,0,1,0,1,1,0], K = 3
Output: 3
Explanation:
Flip A[0],A[1],A[2]:&nbsp;A becomes [1,1,1,1,0,1,1,0]
Flip A[4],A[5],A[6]:&nbsp;A becomes [1,1,1,1,1,0,0,0]
Flip A[5],A[6],A[7]:&nbsp;A becomes [1,1,1,1,1,1,1,1]


&nbsp;



Note:


	1 &lt;= A.length &lt;=&nbsp;30000
	1 &lt;= K &lt;= A.length

**/
class _1037_Minimum_Number_of_K_Consecutive_Bit_Flips {
    public int minKBitFlips(int[] A, int K) {
        
    }
}