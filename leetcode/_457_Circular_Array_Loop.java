package com.hama.leetcode;
/**
You are given a circular array nums of positive and negative integers. If a number k at an index is positive, then move forward k steps. Conversely, if it&#39;s negative (-k), move backward k&nbsp;steps. Since the array is circular, you may assume that the last element&#39;s next element is the first element, and the first element&#39;s previous element is the last element.

Determine if there is a loop (or a cycle) in nums. A cycle must start and end at the same index and the cycle&#39;s length &gt; 1. Furthermore, movements in a cycle must all follow a single direction. In other words, a cycle must not consist of both forward and backward movements.

&nbsp;

Example 1:


Input: [2,-1,1,2,2]
Output: true
Explanation: There is a cycle, from index 0 -&gt; 2 -&gt; 3 -&gt; 0. The cycle&#39;s length is 3.


Example 2:


Input: [-1,2]
Output: false
Explanation: The movement from index 1 -&gt; 1 -&gt; 1 ... is not a cycle, because the cycle&#39;s length is 1. By definition the cycle&#39;s length must be greater than 1.


Example 3:


Input: [-2,1,-1,-2,-2]
Output: false
Explanation: The movement from index 1 -&gt; 2 -&gt; 1 -&gt; ... is not a cycle, because movement from index 1 -&gt; 2 is a forward movement, but movement from index 2 -&gt; 1 is a backward movement. All movements in a cycle must follow a single direction.

&nbsp;

Note:


	-1000 &le;&nbsp;nums[i] &le;&nbsp;1000
	nums[i] &ne;&nbsp;0
	1 &le;&nbsp;nums.length &le; 5000


&nbsp;

Follow up:

Could you solve it in O(n) time complexity and&nbsp;O(1) extra space complexity?**/
class _457_Circular_Array_Loop {
    public boolean circularArrayLoop(int[] nums) {
        
    }
}