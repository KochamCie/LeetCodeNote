package com.hama.leetcode;
/**
Given an input string (s) and a pattern (p), implement regular expression matching with support for &#39;.&#39; and &#39;*&#39;.


&#39;.&#39; Matches any single character.
&#39;*&#39; Matches zero or more of the preceding element.


The matching should cover the entire input string (not partial).

Note:


	s&nbsp;could be empty and contains only lowercase letters a-z.
	p could be empty and contains only lowercase letters a-z, and characters like&nbsp;.&nbsp;or&nbsp;*.


Example 1:


Input:
s = aa
p = a
Output: false
Explanation: a does not match the entire string aa.


Example 2:


Input:
s = aa
p = a*
Output: true
Explanation:&nbsp;&#39;*&#39; means zero or more of the precedeng&nbsp;element, &#39;a&#39;. Therefore, by repeating &#39;a&#39; once, it becomes aa.


Example 3:


Input:
s = ab
p = .*
Output: true
Explanation:&nbsp;.* means zero or more (*) of any character (.).


Example 4:


Input:
s = aab
p = c*a*b
Output: true
Explanation:&nbsp;c can be repeated 0 times, a can be repeated 1 time. Therefore it matches aab.


Example 5:


Input:
s = mississippi
p = mis*is*p*.
Output: false

**/
class _010_Regular_Expression_Matching {
    public boolean isMatch(String s, String p) {
        
    }
}