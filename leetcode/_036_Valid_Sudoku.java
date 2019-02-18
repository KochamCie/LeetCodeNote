package com.hama.leetcode;
/**
Determine if a&nbsp;9x9 Sudoku board&nbsp;is valid.&nbsp;Only the filled cells need to be validated&nbsp;according to the following rules:


	Each row&nbsp;must contain the&nbsp;digits&nbsp;1-9 without repetition.
	Each column must contain the digits&nbsp;1-9&nbsp;without repetition.
	Each of the 9 3x3 sub-boxes of the grid must contain the digits&nbsp;1-9&nbsp;without repetition.



A partially filled sudoku which is valid.

The Sudoku board could be partially filled, where empty cells are filled with the character &#39;.&#39;.

Example 1:


Input:
[
  [5,3,.,.,7,.,.,.,.],
  [6,.,.,1,9,5,.,.,.],
  [.,9,8,.,.,.,.,6,.],
  [8,.,.,.,6,.,.,.,3],
  [4,.,.,8,.,3,.,.,1],
  [7,.,.,.,2,.,.,.,6],
  [.,6,.,.,.,.,2,8,.],
  [.,.,.,4,1,9,.,.,5],
  [.,.,.,.,8,.,.,7,9]
]
Output: true


Example 2:


Input:
[
&nbsp; [8,3,.,.,7,.,.,.,.],
&nbsp; [6,.,.,1,9,5,.,.,.],
&nbsp; [.,9,8,.,.,.,.,6,.],
&nbsp; [8,.,.,.,6,.,.,.,3],
&nbsp; [4,.,.,8,.,3,.,.,1],
&nbsp; [7,.,.,.,2,.,.,.,6],
&nbsp; [.,6,.,.,.,.,2,8,.],
&nbsp; [.,.,.,4,1,9,.,.,5],
&nbsp; [.,.,.,.,8,.,.,7,9]
]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being 
    modified to 8. Since there are two 8&#39;s in the top left 3x3 sub-box, it is invalid.


Note:


	A Sudoku board (partially filled) could be valid but is not necessarily solvable.
	Only the filled cells need to be validated according to the mentioned&nbsp;rules.
	The given board&nbsp;contain only digits 1-9 and the character &#39;.&#39;.
	The given board size is always 9x9.

**/
class _036_Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        
    }
}