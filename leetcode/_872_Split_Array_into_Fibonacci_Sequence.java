package com.hama.leetcode;
/**
Given a string S&nbsp;of digits, such as S = 123456579, we can split it into a Fibonacci-like sequence&nbsp;[123, 456, 579].

Formally, a Fibonacci-like sequence is a list&nbsp;F of non-negative integers such that:


	0 &lt;= F[i] &lt;= 2^31 - 1, (that is,&nbsp;each integer fits a 32-bit signed integer type);
	F.length &gt;= 3;
	and F[i] + F[i+1] = F[i+2] for all 0 &lt;= i &lt; F.length - 2.


Also, note that when splitting the string into pieces, each piece must not have extra leading zeroes, except if the piece is the number 0 itself.

Return any Fibonacci-like sequence split from S, or return [] if it cannot be done.

Example 1:


Input: 123456579
Output: [123,456,579]


Example 2:


Input: 11235813
Output: [1,1,2,3,5,8,13]


Example 3:


Input: 112358130
Output: []
Explanation: The task is impossible.


Example 4:


Input: 0123
Output: []
Explanation: Leading zeroes are not allowed, so 01, 2, 3 is not valid.


Example 5:


Input: 1101111
Output: [110, 1, 111]
Explanation: The output [11, 0, 11, 11] would also be accepted.


Note: 


	1 &lt;= S.length&nbsp;&lt;= 200
	S contains only digits.

**/
class _872_Split_Array_into_Fibonacci_Sequence {
    public List<Integer> splitIntoFibonacci(String S) {
        
    }
}