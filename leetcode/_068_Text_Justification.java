package com.hama.leetcode;
/**
Given an array of words and a width&nbsp;maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.

You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces &#39; &#39; when necessary so that each line has exactly maxWidth characters.

Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

For the last line of text, it should be left justified and no extra space is inserted between words.

Note:


	A word is defined as a character sequence consisting&nbsp;of non-space characters only.
	Each word&#39;s length is&nbsp;guaranteed to be greater than 0 and not exceed maxWidth.
	The input array words&nbsp;contains at least one word.


Example 1:


Input:
words = [This, is, an, example, of, text, justification.]
maxWidth = 16
Output:
[
&nbsp; &nbsp;This &nbsp; &nbsp;is &nbsp; &nbsp;an,
&nbsp; &nbsp;example &nbsp;of text,
&nbsp; &nbsp;justification. &nbsp;
]


Example 2:


Input:
words = [What,must,be,acknowledgment,shall,be]
maxWidth = 16
Output:
[
&nbsp; What &nbsp; must &nbsp; be,
&nbsp; acknowledgment &nbsp;,
&nbsp; shall be &nbsp; &nbsp; &nbsp; &nbsp;
]
Explanation: Note that the last line is shall be     instead of shall     be,
&nbsp;            because the last line must be left-justified instead of fully-justified.
             Note that the second line is also left-justified becase it contains only one word.


Example 3:


Input:
words = [Science,is,what,we,understand,well,enough,to,explain,
&nbsp;        to,a,computer.,Art,is,everything,else,we,do]
maxWidth = 20
Output:
[
&nbsp; Science &nbsp;is &nbsp;what we,
  understand &nbsp; &nbsp; &nbsp;well,
&nbsp; enough to explain to,
&nbsp; a &nbsp;computer. &nbsp;Art is,
&nbsp; everything &nbsp;else &nbsp;we,
&nbsp; do &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
]

**/
class _068_Text_Justification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        
    }
}