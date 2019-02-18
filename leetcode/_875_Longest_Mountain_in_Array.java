package com.hama.leetcode;
/**
Let&#39;s call any (contiguous) subarray B (of A)&nbsp;a mountain if the following properties hold:


	B.length &gt;= 3
	There exists some 0 &lt; i&nbsp;&lt; B.length - 1 such that B[0] &lt; B[1] &lt; ... B[i-1] &lt; B[i] &gt; B[i+1] &gt; ... &gt; B[B.length - 1]


(Note that B could be any subarray of A, including the entire array A.)

Given an array A&nbsp;of integers,&nbsp;return the length of the longest&nbsp;mountain.&nbsp;

Return 0 if there is no mountain.

Example 1:


Input: [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.


Example 2:


Input: [2,2,2]
Output: 0
Explanation: There is no mountain.


Note:


	0 &lt;= A.length &lt;= 10000
	0 &lt;= A[i] &lt;= 10000


Follow up:


	Can you solve it using only one pass?
	Can you solve it in O(1) space?

**/
class _875_Longest_Mountain_in_Array {
    public int longestMountain(int[] A) {
        
    }
}