package com.hama.leetcode;
/**
We have a grid of 1s and 0s; the 1s in a cell represent bricks.&nbsp; A brick will not drop if and only if it is directly connected to the top of the grid, or at least one of its (4-way) adjacent bricks will not drop.

We will do some erasures&nbsp;sequentially. Each time we want to do the erasure at the location (i, j), the brick (if it exists) on that location will disappear, and then some other bricks may&nbsp;drop because of that&nbsp;erasure.

Return an array representing the number of bricks that will drop after each erasure in sequence.


Example 1:
Input: 
grid = [[1,0,0,0],[1,1,1,0]]
hits = [[1,0]]
Output: [2]
Explanation: 
If we erase the brick at (1, 0), the brick at (1, 1) and (1, 2) will drop. So we should return 2.


Example 2:
Input: 
grid = [[1,0,0,0],[1,1,0,0]]
hits = [[1,1],[1,0]]
Output: [0,0]
Explanation: 
When we erase the brick at (1, 0), the brick at (1, 1) has already disappeared due to the last move. So each erasure will cause no bricks dropping.  Note that the erased brick (1, 0) will not be counted as a dropped brick.

&nbsp;

Note:


	The number of rows and columns in the grid will be in the range&nbsp;[1, 200].
	The number of erasures will not exceed the area of the grid.
	It is guaranteed that each erasure will be different from any other erasure, and located inside the grid.
	An erasure may refer to a location with no brick - if it does, no bricks drop.

**/
class _821_Bricks_Falling_When_Hit {
    public int[] hitBricks(int[][] grid, int[][] hits) {
        
    }
}