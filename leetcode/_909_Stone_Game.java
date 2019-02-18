package com.hama.leetcode;
/**
Alex and Lee play a game with piles of stones.&nbsp; There are an even number of&nbsp;piles arranged in a row, and each pile has a positive integer number of stones piles[i].

The objective of the game is to end with the most&nbsp;stones.&nbsp; The total number of stones is odd, so there are no ties.

Alex and Lee take turns, with Alex starting first.&nbsp; Each turn, a player&nbsp;takes the entire pile of stones from either the beginning or the end of the row.&nbsp; This continues until there are no more piles left, at which point the person with the most stones wins.

Assuming Alex and Lee play optimally, return True&nbsp;if and only if Alex wins the game.

&nbsp;

Example 1:


Input: [5,3,4,5]
Output: true
Explanation: 
Alex starts first, and can only take the first 5 or the last 5.
Say he takes the first 5, so that the row becomes [3, 4, 5].
If Lee takes 3, then the board is [4, 5], and Alex takes 5 to win with 10 points.
If Lee takes the last 5, then the board is [3, 4], and Alex takes 4 to win with 9 points.
This demonstrated that taking the first 5 was a winning move for Alex, so we return true.


&nbsp;

Note:


	2 &lt;= piles.length &lt;= 500
	piles.length is even.
	1 &lt;= piles[i] &lt;= 500
	sum(piles) is odd.

**/
class _909_Stone_Game {
    public boolean stoneGame(int[] piles) {
        
    }
}