package com.hama.leetcode;
/**
Given a blacklist&nbsp;B containing unique integers&nbsp;from [0, N), write a function to return a uniform random integer from [0, N) which is NOT&nbsp;in B.

Optimize it such that it minimizes the call to system&rsquo;s Math.random().

Note:


	1 &lt;= N &lt;= 1000000000
	0 &lt;= B.length &lt; min(100000, N)
	[0, N)&nbsp;does NOT include N. See interval notation.


Example 1:


Input: 
[Solution,pick,pick,pick]
[[1,[]],[],[],[]]
Output: [null,0,0,0]


Example 2:


Input: 
[Solution,pick,pick,pick]
[[2,[]],[],[],[]]
Output: [null,1,1,1]


Example 3:


Input: 
[Solution,pick,pick,pick]
[[3,[1]],[],[],[]]
Output: [null,0,0,2]


Example 4:


Input: 
[Solution,pick,pick,pick]
[[4,[2]],[],[],[]]
Output: [null,1,3,1]


Explanation of Input Syntax:

The input is two lists:&nbsp;the subroutines called&nbsp;and their&nbsp;arguments.&nbsp;Solution&#39;s&nbsp;constructor has two arguments,&nbsp;N and the blacklist B. pick has no arguments.&nbsp;Arguments&nbsp;are&nbsp;always wrapped with a list, even if there aren&#39;t any.
**/
class _894_Random_Pick_with_Blacklist {

    public _894_Random_Pick_with_Blacklist(int N, int[] blacklist) {
        
    }
    
    public int pick() {
        
    }
}

/**
 * Your _894_Random_Pick_with_Blacklist object will be instantiated and called as such:
 * _894_Random_Pick_with_Blacklist obj = new _894_Random_Pick_with_Blacklist(N, blacklist);
 * int param_1 = obj.pick();
 */