package com.hama.leetcode;
/**
You are given an array A of strings.

Two strings S and T are&nbsp;special-equivalent&nbsp;if after any number of moves, S == T.

A move consists of choosing two indices i and j with i % 2 == j % 2, and swapping S[i] with S[j].

Now, a group of special-equivalent strings from A&nbsp;is a&nbsp;non-empty subset S of A&nbsp;such that any string not in S&nbsp;is not special-equivalent with any string in S.

Return the number of groups of special-equivalent strings from A.

&nbsp;





Example 1:


Input: [a,b,c,a,c,c]
Output: 3
Explanation: 3 groups [a,a], [b], [c,c,c]



Example 2:


Input: [aa,bb,ab,ba]
Output: 4
Explanation: 4 groups [aa], [bb], [ab], [ba]



Example 3:


Input: [abc,acb,bac,bca,cab,cba]
Output: 3
Explanation: 3 groups [abc,cba], [acb,bca], [bac,cab]



Example 4:


Input: [abcd,cdab,adcb,cbad]
Output: 1
Explanation: 1 group [abcd,cdab,adcb,cbad]


&nbsp;

Note:


	1 &lt;= A.length &lt;= 1000
	1 &lt;= A[i].length &lt;= 20
	All A[i] have the same length.
	All A[i] consist of only lowercase letters.





**/
class _929_Groups_of_Special_Equivalent_Strings {
    public int numSpecialEquivGroups(String[] A) {
        
    }
}