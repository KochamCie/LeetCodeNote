package com.hama.leetcode;
/**
To some string S, we will perform some&nbsp;replacement&nbsp;operations that replace groups of letters with new ones (not necessarily the same size).

Each replacement operation has 3 parameters: a starting index i, a source word&nbsp;x&nbsp;and a target word&nbsp;y.&nbsp; The rule is that if x&nbsp;starts at position i&nbsp;in the original string S, then we will replace that occurrence of&nbsp;x&nbsp;with&nbsp;y.&nbsp; If not, we do nothing.

For example, if we have&nbsp;S = abcd&nbsp;and we have some replacement operation&nbsp;i = 2, x = cd, y = ffff, then because&nbsp;cd&nbsp;starts at position 2&nbsp;in the original string S, we will replace it with ffff.

Using another example on S = abcd, if we have both the replacement operation i = 0, x = ab, y = eee, as well as another replacement operation&nbsp;i = 2, x = ec, y = ffff, this second operation does nothing because in the original string&nbsp;S[2] = &#39;c&#39;, which doesn&#39;t match&nbsp;x[0] = &#39;e&#39;.

All these operations occur simultaneously.&nbsp; It&#39;s guaranteed that there won&#39;t be any overlap in replacement: for example,&nbsp;S = abc, indexes = [0, 1],&nbsp;sources = [ab,bc] is not a valid test case.

Example 1:


Input: S = abcd, indexes = [0,2], sources = [a,cd], targets = [eee,ffff]
Output: eeebffff
Explanation: a starts at index 0 in S, so it&#39;s replaced by eee.
cd starts at index 2 in S, so it&#39;s replaced by ffff.


Example 2:


Input: S = abcd, indexes = [0,2], sources = [ab,ec], targets = [eee,ffff]
Output: eeecd
Explanation: ab starts at index 0 in S, so it&#39;s replaced by eee. 
ec doesn&#39;t starts at index 2 in the original S, so we do nothing.


Notes:


	0 &lt;=&nbsp;indexes.length =&nbsp;sources.length =&nbsp;targets.length &lt;= 100
	0&nbsp;&lt;&nbsp;indexes[i]&nbsp;&lt; S.length &lt;= 1000
	All characters in given inputs are lowercase letters.


&nbsp;
**/
class _862_Find_And_Replace_in_String {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        
    }
}