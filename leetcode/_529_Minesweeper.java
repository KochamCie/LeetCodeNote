package com.hama.leetcode;
/**
Let&#39;s play the minesweeper game (Wikipedia, online game)!

You are given a 2D char matrix representing the game board. &#39;M&#39; represents an unrevealed mine, &#39;E&#39; represents an unrevealed empty square, &#39;B&#39; represents a revealed blank square that has no adjacent (above, below, left, right, and all 4 diagonals) mines, digit (&#39;1&#39; to &#39;8&#39;) represents how many mines are adjacent to this revealed square, and finally &#39;X&#39; represents a revealed mine.

Now given the next click position (row and column indices) among all the unrevealed squares (&#39;M&#39; or &#39;E&#39;), return the board after revealing this position according to the following rules:


	If a mine (&#39;M&#39;) is revealed, then the game is over - change it to &#39;X&#39;.
	If an empty square (&#39;E&#39;) with no adjacent mines is revealed, then change it to revealed blank (&#39;B&#39;) and all of its adjacent unrevealed squares should be revealed recursively.
	If an empty square (&#39;E&#39;) with at least one adjacent mine is revealed, then change it to a digit (&#39;1&#39; to &#39;8&#39;) representing the number of adjacent mines.
	Return the board when no more squares will be revealed.


&nbsp;

Example 1:


Input: 

[[&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;],
 [&#39;E&#39;, &#39;E&#39;, &#39;M&#39;, &#39;E&#39;, &#39;E&#39;],
 [&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;],
 [&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;]]

Click : [3,0]

Output: 

[[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;M&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]

Explanation:



Example 2:


Input: 

[[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;M&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]

Click : [1,2]

Output: 

[[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;X&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]

Explanation:



&nbsp;

Note:


	The range of the input matrix&#39;s height and width is [1,50].
	The click position will only be an unrevealed square (&#39;M&#39; or &#39;E&#39;), which also means the input board contains at least one clickable square.
	The input board won&#39;t be a stage when game is over (some mines have been revealed).
	For simplicity, not mentioned rules should be ignored in this problem. For example, you don&#39;t need to reveal all the unrevealed mines when the game is over, consider any cases that you will win the game or flag any squares.

**/
class _529_Minesweeper {
    public char[][] updateBoard(char[][] board, int[] click) {
        
    }
}