package com.hama.leetcode;
/**
There are&nbsp;N dominoes in a line, and we place each domino vertically upright.

In the beginning, we simultaneously push&nbsp;some of the dominoes either to the left or to the right.



After each second, each domino that is falling to the left pushes the adjacent domino on the left.

Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.

When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.

For the purposes of this question, we will consider that a falling domino&nbsp;expends no additional force to a falling or already fallen domino.

Given a string S representing the initial state.&nbsp;S[i] = &#39;L&#39;, if the i-th domino has been pushed to the left; S[i] = &#39;R&#39;, if the i-th domino has been pushed to the right; S[i] = &#39;.&#39;,&nbsp;if the i-th domino has not been pushed.

Return a string representing the final state.&nbsp;

Example 1:


Input: .L.R...LR..L..
Output: LL.RR.LLRRLL..


Example 2:


Input: RR.L
Output: RR.L
Explanation: The first domino expends no additional force on the second domino.


Note:


	0 &lt;= N&nbsp;&lt;= 10^5
	String&nbsp;dominoes contains only&nbsp;&#39;L&#39;, &#39;R&#39; and &#39;.&#39;

**/
class _868_Push_Dominoes {
    public String pushDominoes(String dominoes) {
        
    }
}