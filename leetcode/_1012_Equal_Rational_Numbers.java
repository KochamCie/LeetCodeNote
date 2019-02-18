package com.hama.leetcode;
/**
Given two strings S and T, each of which represents a non-negative rational number, return True if and only if they represent the same number. The strings may use parentheses to denote the repeating part of the rational number.

In general a rational number can be represented using up to&nbsp;three parts: an&nbsp;integer part, a&nbsp;non-repeating part, and a&nbsp;repeating part. The number will be represented&nbsp;in one of the following three ways:


	&lt;IntegerPart&gt; (e.g. 0, 12, 123)
	&lt;IntegerPart&gt;&lt;.&gt;&lt;NonRepeatingPart&gt; &nbsp;(e.g. 0.5, 1., 2.12, 2.0001)
	&lt;IntegerPart&gt;&lt;.&gt;&lt;NonRepeatingPart&gt;&lt;(&gt;&lt;RepeatingPart&gt;&lt;)&gt; (e.g. 0.1(6), 0.9(9), 0.00(1212))


The repeating portion of a decimal expansion is conventionally denoted within a pair of round brackets.&nbsp; For example:

1 / 6 = 0.16666666... = 0.1(6) = 0.1666(6) = 0.166(66)

Both 0.1(6) or 0.1666(6) or 0.166(66) are correct representations of 1 / 6.

&nbsp;

Example 1:


Input: S = 0.(52), T = 0.5(25)
Output: true
Explanation:
Because 0.(52) represents 0.52525252..., and 0.5(25) represents 0.52525252525..... , the strings represent the same number.



Example 2:


Input: S = 0.1666(6), T = 0.166(66)
Output: true



Example 3:


Input: S = 0.9(9), T = 1.
Output: true
Explanation: 
0.9(9) represents 0.999999999... repeated forever, which equals 1.  [See this link for an explanation.]
1. represents the number 1, which is formed correctly: (IntegerPart) = 1 and (NonRepeatingPart) = .

&nbsp;



Note:


	Each part consists only of digits.
	The &lt;IntegerPart&gt;&nbsp;will&nbsp;not begin with 2 or more zeros.&nbsp; (There is no other restriction on the digits of each part.)
	1 &lt;= &lt;IntegerPart&gt;.length &lt;= 4 
	0 &lt;= &lt;NonRepeatingPart&gt;.length &lt;= 4 
	1 &lt;= &lt;RepeatingPart&gt;.length &lt;= 4

**/
class _1012_Equal_Rational_Numbers {
    public boolean isRationalEqual(String S, String T) {
        
    }
}