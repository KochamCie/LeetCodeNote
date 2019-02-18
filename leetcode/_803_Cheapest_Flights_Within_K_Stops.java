package com.hama.leetcode;
/**
There are n cities connected by&nbsp;m flights. Each fight starts from city&nbsp;u and arrives at&nbsp;v with a price w.

Now given all the cities and flights, together with starting city src and the destination&nbsp;dst, your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.


Example 1:
Input: 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 1
Output: 200
Explanation: 
The graph looks like this:


The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.


Example 2:
Input: 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 0
Output: 500
Explanation: 
The graph looks like this:


The cheapest price from city 0 to city 2 with at most 0 stop costs 500, as marked blue in the picture.

Note:


	The number of&nbsp;nodes&nbsp;n will be&nbsp;in range [1, 100], with nodes labeled from 0 to n - 1.
	The&nbsp;size of flights will be&nbsp;in range [0, n * (n - 1) / 2].
	The format of each flight will be (src, dst, price).
	The price of each flight will be in the range [1, 10000].
	k is in the range of [0, n - 1].
	There&nbsp;will&nbsp;not&nbsp;be&nbsp;any&nbsp;duplicated&nbsp;flights or&nbsp;self&nbsp;cycles.

**/
class _803_Cheapest_Flights_Within_K_Stops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        
    }
}