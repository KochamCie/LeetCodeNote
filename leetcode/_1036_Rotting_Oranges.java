package com.hama.leetcode;
/**
In a given grid, each cell can have one of three&nbsp;values:


	the value 0 representing an empty cell;
	the value 1 representing a fresh orange;
	the value 2 representing a rotten orange.


Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange.&nbsp; If this is impossible, return -1 instead.

&nbsp;


Example 1:




Input: [[2,1,1],[1,1,0],[0,1,1]]
Output: 4



Example 2:


Input: [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.



Example 3:


Input: [[0,2]]
Output: 0
Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.


&nbsp;

Note:


	1 &lt;= grid.length &lt;= 10
	1 &lt;= grid[0].length &lt;= 10
	grid[i][j] is only 0, 1, or 2.




**/
class _1036_Rotting_Oranges {
    public int orangesRotting(int[][] grid) {
        
    }
}