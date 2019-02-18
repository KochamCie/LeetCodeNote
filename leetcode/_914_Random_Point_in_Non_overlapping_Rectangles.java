package com.hama.leetcode;
/**
Given a list of non-overlapping&nbsp;axis-aligned rectangles rects, write a function pick which randomly and uniformily picks an integer point in the space&nbsp;covered by the rectangles.

Note:


	An integer point&nbsp;is a point that has integer coordinates.&nbsp;
	A point&nbsp;on the perimeter&nbsp;of a rectangle is&nbsp;included in the space covered by the rectangles.&nbsp;
	ith rectangle = rects[i] =&nbsp;[x1,y1,x2,y2], where [x1, y1]&nbsp;are the integer coordinates of the bottom-left corner, and [x2, y2]&nbsp;are the integer coordinates of the top-right corner.
	length and width of each rectangle does not exceed 2000.
	1 &lt;= rects.length&nbsp;&lt;= 100
	pick return a point as an array of integer coordinates&nbsp;[p_x, p_y]
	pick is called at most 10000&nbsp;times.



Example 1:


Input: 
[Solution,pick,pick,pick]
[[[[1,1,5,5]]],[],[],[]]
Output: 
[null,[4,1],[4,1],[3,3]]



Example 2:


Input: 
[Solution,pick,pick,pick,pick,pick]
[[[[-2,-2,-1,-1],[1,0,3,0]]],[],[],[],[],[]]
Output: 
[null,[-1,-2],[2,0],[-2,-1],[3,0],[-2,-2]]



Explanation of Input Syntax:

The input is two lists:&nbsp;the subroutines called&nbsp;and their&nbsp;arguments.&nbsp;Solution&#39;s&nbsp;constructor has one argument, the array of rectangles rects. pick&nbsp;has no arguments.&nbsp;Arguments&nbsp;are&nbsp;always wrapped with a list, even if there aren&#39;t any.




&nbsp;

**/
class _914_Random_Point_in_Non_overlapping_Rectangles {

    public _914_Random_Point_in_Non_overlapping_Rectangles(int[][] rects) {
        
    }
    
    public int[] pick() {
        
    }
}

/**
 * Your _914_Random_Point_in_Non_overlapping_Rectangles object will be instantiated and called as such:
 * _914_Random_Point_in_Non_overlapping_Rectangles obj = new _914_Random_Point_in_Non_overlapping_Rectangles(rects);
 * int[] param_1 = obj.pick();
 */