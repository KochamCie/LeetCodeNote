package com.hama.leetcode;
/**
Your car starts at position 0 and speed +1 on an infinite number line.&nbsp; (Your car can go into negative positions.)

Your car drives automatically according to a sequence of instructions A (accelerate) and R (reverse).

When you get an instruction A, your car does the following:&nbsp;position += speed, speed *= 2.

When you get an instruction R, your car does the following: if your speed is positive then&nbsp;speed = -1&nbsp;, otherwise&nbsp;speed = 1.&nbsp; (Your position stays the same.)

For example, after commands AAR, your car goes to positions 0-&gt;1-&gt;3-&gt;3, and your speed goes to 1-&gt;2-&gt;4-&gt;-1.

Now for some target position, say the length of the shortest sequence of instructions to get there.


Example 1:
Input: 
target = 3
Output: 2
Explanation: 
The shortest instruction sequence is AA.
Your position goes from 0-&gt;1-&gt;3.



Example 2:
Input: 
target = 6
Output: 5
Explanation: 
The shortest instruction sequence is AAARA.
Your position goes from 0-&gt;1-&gt;3-&gt;7-&gt;7-&gt;6.


&nbsp;

Note: 


	1 &lt;= target &lt;= 10000.

**/
class _836_Race_Car {
    public int racecar(int target) {
        
    }
}