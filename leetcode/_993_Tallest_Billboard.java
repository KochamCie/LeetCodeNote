package com.hama.leetcode;
/**
You are installing a billboard and want it to have the largest height.&nbsp; The billboard will have two steel supports, one on each side.&nbsp; Each steel support must be an equal height.

You have a collection of rods which can be welded together.&nbsp; For example, if you have rods of lengths 1, 2, and 3, you can weld them together to make a support of length 6.

Return the largest possible height of your billboard installation.&nbsp; If you cannot support the billboard, return 0.

&nbsp;

Example 1:


Input: [1,2,3,6]
Output: 6
Explanation: We have two disjoint subsets {1,2,3} and {6}, which have the same sum = 6.



Example 2:


Input: [1,2,3,4,5,6]
Output: 10
Explanation: We have two disjoint subsets {2,3,5} and {4,6}, which have the same sum = 10.




Example 3:


Input: [1,2]
Output: 0
Explanation: The billboard cannot be supported, so we return 0.



&nbsp;

Note:


	0 &lt;= rods.length &lt;= 20
	1 &lt;= rods[i] &lt;= 1000
	The sum of rods is at most 5000.

**/
class _993_Tallest_Billboard {
    public int tallestBillboard(int[] rods) {
        
    }
}