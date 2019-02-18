package com.hama.leetcode;
/**
Write a class RecentCounter to count recent requests.

It has only one method:&nbsp;ping(int t), where t represents some time in milliseconds.

Return the number of pings that have been made from 3000 milliseconds ago until now.

Any ping with time in [t - 3000, t] will count, including the current ping.

It is guaranteed that every call to ping uses a strictly larger value of&nbsp;t than before.

&nbsp;

Example 1:


Input: inputs = [RecentCounter,ping,ping,ping,ping], inputs = [[],[1],[100],[3001],[3002]]
Output: [null,1,2,3,3]

&nbsp;

Note:


	Each test case will have at most 10000 calls to ping.
	Each test case will call&nbsp;ping with strictly increasing values of t.
	Each call to ping will have 1 &lt;= t &lt;= 10^9.



&nbsp;
**/
class _969_Number_of_Recent_Calls {

    public _969_Number_of_Recent_Calls() {
        
    }
    
    public int ping(int t) {
        
    }
}

/**
 * Your _969_Number_of_Recent_Calls object will be instantiated and called as such:
 * _969_Number_of_Recent_Calls obj = new _969_Number_of_Recent_Calls();
 * int param_1 = obj.ping(t);
 */