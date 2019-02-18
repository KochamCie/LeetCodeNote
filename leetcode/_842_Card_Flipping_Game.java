package com.hama.leetcode;
/**
On a table are N cards, with a positive integer printed on the front and back of each card (possibly different).

We flip any number of cards, and after we choose one&nbsp;card.&nbsp;

If the number X on the back of the chosen&nbsp;card is not on the front of any card, then this number X is good.

What is the smallest number that is good?&nbsp; If no number is good, output 0.

Here, fronts[i] and backs[i] represent the number on the front and back of card i.&nbsp;

A&nbsp;flip swaps the front and back numbers, so the value on the front is now on the back and vice versa.

Example:


Input: fronts = [1,2,4,4,7], backs = [1,3,4,1,3]
Output: 2
Explanation: If we flip the second card, the fronts are [1,3,4,4,7] and the backs are [1,2,4,1,3].
We choose the second card, which has number 2 on the back, and it isn&#39;t on the front of any card, so 2 is good.

&nbsp;

Note:


	1 &lt;= fronts.length == backs.length&nbsp;&lt;=&nbsp;1000.
	1 &lt;=&nbsp;fronts[i]&nbsp;&lt;= 2000.
	1 &lt;= backs[i]&nbsp;&lt;= 2000.

**/
class _842_Card_Flipping_Game {
    public int flipgame(int[] fronts, int[] backs) {
        
    }
}