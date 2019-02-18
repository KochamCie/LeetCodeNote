package com.hama.leetcode;
/**
You are given the number of rows n_rows&nbsp;and number of columns n_cols&nbsp;of a&nbsp;2D&nbsp;binary matrix&nbsp;where all values are initially 0.&nbsp;Write a function flip&nbsp;which chooses&nbsp;a 0 value&nbsp;uniformly at random,&nbsp;changes it to 1,&nbsp;and then returns the position [row.id, col.id] of that value. Also, write a function reset which sets all values back to 0.&nbsp;Try to minimize the number of calls to system&#39;s Math.random() and optimize the time and&nbsp;space complexity.

Note:


	1 &lt;= n_rows, n_cols&nbsp;&lt;= 10000
	0 &lt;= row.id &lt; n_rows and 0 &lt;= col.id &lt; n_cols
	flip&nbsp;will not be called when the matrix has no&nbsp;0 values left.
	the total number of calls to&nbsp;flip&nbsp;and reset&nbsp;will not exceed&nbsp;1000.


Example 1:


Input: 
[Solution,flip,flip,flip,flip]
[[2,3],[],[],[],[]]
Output: [null,[0,1],[1,2],[1,0],[1,1]]



Example 2:


Input: 
[Solution,flip,flip,reset,flip]
[[1,2],[],[],[],[]]
Output: [null,[0,0],[0,1],null,[0,0]]


Explanation of Input Syntax:

The input is two lists:&nbsp;the subroutines called&nbsp;and their&nbsp;arguments. Solution&#39;s constructor&nbsp;has two arguments, n_rows and n_cols.&nbsp;flip&nbsp;and reset have&nbsp;no&nbsp;arguments.&nbsp;Arguments&nbsp;are&nbsp;always wrapped with a list, even if there aren&#39;t any.
**/
class _913_Random_Flip_Matrix {

    public _913_Random_Flip_Matrix(int n_rows, int n_cols) {
        
    }
    
    public int[] flip() {
        
    }
    
    public void reset() {
        
    }
}

/**
 * Your _913_Random_Flip_Matrix object will be instantiated and called as such:
 * _913_Random_Flip_Matrix obj = new _913_Random_Flip_Matrix(n_rows, n_cols);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */