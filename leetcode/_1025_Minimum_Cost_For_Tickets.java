package com.hama.leetcode;
/**
In a country popular for train travel, you&nbsp;have planned some train travelling one year in advance.&nbsp; The days of the year that you will travel is given as an array days.&nbsp; Each day is an integer from 1 to 365.

Train tickets are sold in 3 different ways:


	a 1-day pass is sold for costs[0] dollars;
	a 7-day pass is sold for costs[1] dollars;
	a 30-day pass is sold for costs[2] dollars.


The passes allow that many days of consecutive travel.&nbsp; For example, if we get a 7-day pass on day 2, then we can travel for 7 days: day 2, 3, 4, 5, 6, 7, and 8.

Return the minimum number of dollars you need to travel every day in the given list of days.

&nbsp;

Example 1:


Input: days = [1,4,6,7,8,20], costs = [2,7,15]
Output: 11
Explanation: 
For example, here is one way to buy passes that lets you travel your travel plan:
On day 1, you bought a 1-day pass for costs[0] = $2, which covered day 1.
On day 3, you bought a 7-day pass for costs[1] = $7, which covered days 3, 4, ..., 9.
On day 20, you bought a 1-day pass for costs[0] = $2, which covered day 20.
In total you spent $11 and covered all the days of your travel.



Example 2:


Input: days = [1,2,3,4,5,6,7,8,9,10,30,31], costs = [2,7,15]
Output: 17
Explanation: 
For example, here is one way to buy passes that lets you travel your travel plan:
On day 1, you bought a 30-day pass for costs[2] = $15 which covered days 1, 2, ..., 30.
On day 31, you bought a 1-day pass for costs[0] = $2 which covered day 31.
In total you spent $17 and covered all the days of your travel.


&nbsp;


Note:


	1 &lt;= days.length &lt;= 365
	1 &lt;= days[i] &lt;= 365
	days is in strictly increasing order.
	costs.length == 3
	1 &lt;= costs[i] &lt;= 1000

**/
class _1025_Minimum_Cost_For_Tickets {
    public int mincostTickets(int[] days, int[] costs) {
        
    }
}