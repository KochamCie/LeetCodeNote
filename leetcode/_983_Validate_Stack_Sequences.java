package com.hama.leetcode;
/**
Given two sequences pushed and popped&nbsp;with distinct values,&nbsp;return true if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.

&nbsp;


Example 1:


Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4), pop() -&gt; 4,
push(5), pop() -&gt; 5, pop() -&gt; 3, pop() -&gt; 2, pop() -&gt; 1



Example 2:


Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.


&nbsp;

Note:


	0 &lt;= pushed.length == popped.length &lt;= 1000
	0 &lt;= pushed[i], popped[i] &lt; 1000
	pushed is a permutation of popped.
	pushed and popped have distinct values.


**/
class _983_Validate_Stack_Sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
    }
}