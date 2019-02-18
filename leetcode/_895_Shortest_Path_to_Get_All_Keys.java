package com.hama.leetcode;
/**
We are given a 2-dimensional&nbsp;grid.&nbsp;. is an empty cell, # is&nbsp;a wall, @ is the starting point, (a, b, ...) are keys, and (A,&nbsp;B, ...) are locks.

We start at the starting point, and one move consists of walking one space in one of the 4 cardinal directions.&nbsp; We cannot walk outside the grid, or walk into a wall.&nbsp; If we walk over a key, we pick it up.&nbsp; We can&#39;t walk over a lock unless we have the corresponding key.

For some 1 &lt;= K &lt;= 6, there is exactly one lowercase and one uppercase letter of the first K letters of the English alphabet in the grid.&nbsp; This means that there is exactly one key for each lock, and one lock for each key; and also that the letters used to represent the keys and locks were&nbsp;chosen in the same order as the English alphabet.

Return the lowest number of moves to acquire all keys.&nbsp; If&nbsp;it&#39;s impossible, return -1.

&nbsp;


Example 1:


Input: [@.a.#,###.#,b.A.B]
Output: 8



Example 2:


Input: [@..aA,..B#.,....b]
Output: 6



&nbsp;

Note:


	1 &lt;= grid.length&nbsp;&lt;= 30
	1 &lt;= grid[0].length&nbsp;&lt;= 30
	grid[i][j] contains only &#39;.&#39;, &#39;#&#39;, &#39;@&#39;,&nbsp;&#39;a&#39;-&#39;f&#39; and &#39;A&#39;-&#39;F&#39;
	The number of keys is in [1, 6].&nbsp; Each key has a different letter and opens exactly one lock.


**/
class _895_Shortest_Path_to_Get_All_Keys {
    public int shortestPathAllKeys(String[] grid) {
        
    }
}