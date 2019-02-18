package com.hama.leetcode;
/**
Implement atoi which&nbsp;converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:


	Only the space character &#39; &#39; is considered as whitespace character.
	Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [&minus;231,&nbsp; 231&nbsp;&minus; 1]. If the numerical value is out of the range of representable values, INT_MAX (231&nbsp;&minus; 1) or INT_MIN (&minus;231) is returned.


Example 1:


Input: 42
Output: 42


Example 2:


Input:    -42
Output: -42
Explanation: The first non-whitespace character is &#39;-&#39;, which is the minus sign.
&nbsp;            Then take as many numerical digits as possible, which gets 42.


Example 3:


Input: 4193 with words
Output: 4193
Explanation: Conversion stops at digit &#39;3&#39; as the next character is not a numerical digit.


Example 4:


Input: words and 987
Output: 0
Explanation: The first non-whitespace character is &#39;w&#39;, which is not a numerical 
&nbsp;            digit or a +/- sign. Therefore no valid conversion could be performed.

Example 5:


Input: -91283472332
Output: -2147483648
Explanation: The number -91283472332 is out of the range of a 32-bit signed integer.
&nbsp;            Thefore INT_MIN (&minus;231) is returned.
**/
class _008_String_to_Integer__atoi_ {
    public int myAtoi(String str) {
        
    }
}