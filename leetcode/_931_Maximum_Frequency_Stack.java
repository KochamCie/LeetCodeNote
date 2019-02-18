package com.hama.leetcode;
/**
Implement FreqStack, a class which simulates the operation of a stack-like data structure.

FreqStack&nbsp;has two functions:


	push(int x), which pushes an integer x onto the stack.
	pop(), which removes and returns the most frequent element in the stack.
	
		If there is a tie for most frequent element, the element closest to the top of the stack is removed and returned.
	
	


&nbsp;

Example 1:


Input: 
[FreqStack,push,push,push,push,push,push,pop,pop,pop,pop],
[[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
Output: [null,null,null,null,null,null,null,5,7,5,4]
Explanation:
After making six .push operations, the stack is [5,7,5,7,4,5] from bottom to top.  Then:

pop() -&gt; returns 5, as 5 is the most frequent.
The stack becomes [5,7,5,7,4].

pop() -&gt; returns 7, as 5 and 7 is the most frequent, but 7 is closest to the top.
The stack becomes [5,7,5,4].

pop() -&gt; returns 5.
The stack becomes [5,7,4].

pop() -&gt; returns 4.
The stack becomes [5,7].


&nbsp;

Note:


	Calls to FreqStack.push(int x)&nbsp;will be such that 0 &lt;= x &lt;= 10^9.
	It is guaranteed that FreqStack.pop() won&#39;t be called if the stack has zero elements.
	The total number of FreqStack.push calls will not exceed 10000 in a single test case.
	The total number of FreqStack.pop&nbsp;calls will not exceed 10000 in a single test case.
	The total number of FreqStack.push and FreqStack.pop calls will not exceed 150000 across all test cases.



&nbsp;

**/
class _931_Maximum_Frequency_Stack {

    public _931_Maximum_Frequency_Stack() {
        
    }
    
    public void push(int x) {
        
    }
    
    public int pop() {
        
    }
}

/**
 * Your _931_Maximum_Frequency_Stack object will be instantiated and called as such:
 * _931_Maximum_Frequency_Stack obj = new _931_Maximum_Frequency_Stack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */