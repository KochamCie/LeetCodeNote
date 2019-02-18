package com.hama.leetcode;
/**
There is a room with n lights which are turned on initially and 4 buttons on the wall. After performing exactly m unknown operations towards buttons, you need to return how many different kinds of status of the n lights could be.

Suppose n lights are labeled as number [1, 2, 3 ..., n], function of these 4 buttons are given below:


	Flip all the lights.
	Flip lights with even numbers.
	Flip lights with odd numbers.
	Flip lights with (3k + 1) numbers, k = 0, 1, 2, ...


&nbsp;

Example 1:


Input: n = 1, m = 1.
Output: 2
Explanation: Status can be: [on], [off]


&nbsp;

Example 2:


Input: n = 2, m = 1.
Output: 3
Explanation: Status can be: [on, off], [off, on], [off, off]


&nbsp;

Example 3:


Input: n = 3, m = 1.
Output: 4
Explanation: Status can be: [off, on, off], [on, off, on], [off, off, off], [off, on, on].


&nbsp;

Note: n and m both fit in range [0, 1000].
**/
class _672_Bulb_Switcher_II {
    public int flipLights(int n, int m) {
        
    }
}