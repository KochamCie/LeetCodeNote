package com.hama.leetcode;
/**
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for &#39;?&#39; and &#39;*&#39;.


&#39;?&#39; Matches any single character.
&#39;*&#39; Matches any sequence of characters (including the empty sequence).


The matching should cover the entire input string (not partial).

Note:


	s&nbsp;could be empty and contains only lowercase letters a-z.
	p could be empty and contains only lowercase letters a-z, and characters like ?&nbsp;or&nbsp;*.


Example 1:


Input:
s = aa
p = a
Output: false
Explanation: a does not match the entire string aa.


Example 2:


Input:
s = aa
p = *
Output: true
Explanation:&nbsp;&#39;*&#39; matches any sequence.


Example 3:


Input:
s = cb
p = ?a
Output: false
Explanation:&nbsp;&#39;?&#39; matches &#39;c&#39;, but the second letter is &#39;a&#39;, which does not match &#39;b&#39;.


Example 4:


Input:
s = adceb
p = *a*b
Output: true
Explanation:&nbsp;The first &#39;*&#39; matches the empty sequence, while the second &#39;*&#39; matches the substring dce.


Example 5:


Input:
s = acdcb
p = a*c?b
Output: false

**/
class _044_Wildcard_Matching {
    public boolean isMatch(String s, String p) {
        
    }
}