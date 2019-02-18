package com.hama.leetcode;
/**
There are G people in a gang, and a list of various crimes they could commit.

The i-th crime generates a profit[i] and requires group[i] gang members to participate.

If a gang member participates in one crime, that member can&#39;t participate in another crime.

Let&#39;s call a profitable&nbsp;scheme&nbsp;any subset of these crimes that generates at least P profit, and the total number of gang members participating in that subset of crimes is at most G.

How many schemes can be chosen?&nbsp; Since the answer may be very&nbsp;large, return it modulo 10^9 + 7.

&nbsp;

Example 1:


Input: G = 5, P = 3, group = [2,2], profit = [2,3]
Output: 2
Explanation: 
To make a profit of at least 3, the gang could either commit crimes 0 and 1, or just crime 1.
In total, there are 2 schemes.



Example 2:


Input: G = 10, P = 5, group = [2,3,5], profit = [6,7,8]
Output: 7
Explanation: 
To make a profit of at least 5, the gang could commit any crimes, as long as they commit one.
There are 7 possible schemes: (0), (1), (2), (0,1), (0,2), (1,2), and (0,1,2).


&nbsp;


Note:


	1 &lt;= G &lt;= 100
	0 &lt;= P &lt;= 100
	1 &lt;= group[i] &lt;= 100
	0 &lt;= profit[i] &lt;= 100
	1 &lt;= group.length = profit.length &lt;= 100



&nbsp;

**/
class _911_Profitable_Schemes {
    public int profitableSchemes(int G, int P, int[] group, int[] profit) {
        
    }
}