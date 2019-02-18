package com.hama.leetcode;
/**
We are given non-negative integers nums[i] which are written on a chalkboard.&nbsp; Alice and Bob take turns erasing exactly one number from the chalkboard, with Alice starting first.&nbsp; If erasing a number causes&nbsp;the bitwise XOR of all the elements of the chalkboard to become&nbsp;0, then that player loses.&nbsp; (Also, we&#39;ll say the bitwise XOR of one element is that element itself, and the bitwise XOR of no elements is 0.)

Also, if any player starts their turn with the bitwise XOR of all the elements of the chalkboard equal to 0, then that player wins.

Return True if and only if Alice wins the game, assuming both players play optimally.


Example:
Input: nums = [1, 1, 2]
Output: false
Explanation: 
Alice has two choices: erase 1 or erase 2. 
If she erases 1, the nums array becomes [1, 2]. The bitwise XOR of all the elements of the chalkboard is 1 XOR 2 = 3. Now Bob can remove any element he wants, because Alice will be the one to erase the last element and she will lose. 
If Alice erases 2 first, now nums becomes [1, 1]. The bitwise XOR of all the elements of the chalkboard is 1 XOR 1 = 0. Alice will lose.



Notes: 


	1 &lt;= N &lt;= 1000.&nbsp;
	0 &lt;= nums[i] &lt;= 2^16.


&nbsp;
**/
class _828_Chalkboard_XOR_Game {
    public boolean xorGame(int[] nums) {
        
    }
}