package com.hama.leetcode;
/**
Given an array equations&nbsp;of strings that represent relationships between variables, each string equations[i]&nbsp;has length 4 and takes one of two different forms: a==b or a!=b.&nbsp; Here, a and b are lowercase letters (not necessarily different) that represent one-letter variable names.

Return true&nbsp;if and only if it is possible to assign integers to variable names&nbsp;so as to satisfy all the given equations.

&nbsp;





Example 1:


Input: [a==b,b!=a]
Output: false
Explanation: If we assign say, a = 1 and b = 1, then the first equation is satisfied, but not the second.  There is no way to assign the variables to satisfy both equations.



Example 2:


Input: [b==a,a==b]
Output: true
Explanation: We could assign a = 1 and b = 1 to satisfy both equations.



Example 3:


Input: [a==b,b==c,a==c]
Output: true



Example 4:


Input: [a==b,b!=c,c==a]
Output: false



Example 5:


Input: [c==c,b==d,x!=z]
Output: true


&nbsp;

Note:


	1 &lt;= equations.length &lt;= 500
	equations[i].length == 4
	equations[i][0] and equations[i][3] are lowercase letters
	equations[i][1] is either &#39;=&#39; or &#39;!&#39;
	equations[i][2] is&nbsp;&#39;=&#39;






**/
class _1032_Satisfiability_of_Equality_Equations {
    public boolean equationsPossible(String[] equations) {
        
    }
}