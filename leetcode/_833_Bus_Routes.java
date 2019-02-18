package com.hama.leetcode;
/**
We have a list of bus routes. Each routes[i] is a bus route that the i-th bus&nbsp;repeats forever. For example if routes[0] = [1, 5, 7], this means that the first&nbsp;bus (0-th indexed) travels in the sequence 1-&gt;5-&gt;7-&gt;1-&gt;5-&gt;7-&gt;1-&gt;... forever.

We start at bus stop S (initially not on a bus), and we want to go to bus stop T. Travelling by buses only, what is the least number of buses we must take to reach our destination? Return -1 if it is not possible.


Example:
Input: 
routes = [[1, 2, 7], [3, 6, 7]]
S = 1
T = 6
Output: 2
Explanation: 
The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.


Note: 


	1 &lt;= routes.length &lt;= 500.
	1 &lt;= routes[i].length &lt;= 500.
	0 &lt;= routes[i][j] &lt; 10 ^ 6.

**/
class _833_Bus_Routes {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        
    }
}