package com.hama.leetcode;
/**
We have a string S of lowercase letters, and an integer array shifts.

Call the shift of a letter, the next letter in the alphabet, (wrapping around so that &#39;z&#39; becomes &#39;a&#39;).&nbsp;

For example, shift(&#39;a&#39;) = &#39;b&#39;, shift(&#39;t&#39;) = &#39;u&#39;, and shift(&#39;z&#39;) = &#39;a&#39;.

Now for each shifts[i] = x, we want to shift the first i+1&nbsp;letters of S, x times.

Return the final string&nbsp;after all such shifts to S are applied.

Example 1:


Input: S = abc, shifts = [3,5,9]
Output: rpl
Explanation: 
We start with abc.
After shifting the first 1 letters of S by 3, we have dbc.
After shifting the first 2 letters of S by 5, we have igc.
After shifting the first 3 letters of S by 9, we have rpl, the answer.


Note:


	1 &lt;= S.length = shifts.length &lt;= 20000
	0 &lt;= shifts[i] &lt;= 10 ^ 9

**/
class _878_Shifting_Letters {
    public String shiftingLetters(String S, int[] shifts) {
        
    }
}