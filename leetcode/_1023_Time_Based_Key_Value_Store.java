package com.hama.leetcode;
/**
Create a timebased key-value store class&nbsp;TimeMap, that supports two operations.

1. set(string key, string value, int timestamp)


	Stores the key and value, along with the given timestamp.


2. get(string key, int timestamp)


	Returns a value such that set(key, value, timestamp_prev) was called previously, with timestamp_prev &lt;= timestamp.
	If there are multiple such values, it returns the one with the largest timestamp_prev.
	If there are no values, it returns the empty string ().


&nbsp;


Example 1:


Input: inputs = [TimeMap,set,get,get,set,get,get], inputs = [[],[foo,bar,1],[foo,1],[foo,3],[foo,bar2,4],[foo,4],[foo,5]]
Output: [null,null,bar,bar,null,bar2,bar2]
Explanation: &nbsp; 
TimeMap kv; &nbsp; 
kv.set(foo, bar, 1); // store the key foo and value bar along with timestamp = 1 &nbsp; 
kv.get(foo, 1);  // output bar &nbsp; 
kv.get(foo, 3); // output bar since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 ie bar &nbsp; 
kv.set(foo, bar2, 4); &nbsp; 
kv.get(foo, 4); // output bar2 &nbsp; 
kv.get(foo, 5); //output bar2 &nbsp; 




Example 2:


Input: inputs = [TimeMap,set,set,get,get,get,get,get], inputs = [[],[love,high,10],[love,low,20],[love,5],[love,10],[love,15],[love,20],[love,25]]
Output: [null,null,null,,high,high,low,low]




&nbsp;

Note:


	All key/value strings are lowercase.
	All key/value strings have&nbsp;length in the range&nbsp;[1, 100]
	The timestamps for all TimeMap.set operations are strictly increasing.
	1 &lt;= timestamp &lt;= 10^7
	TimeMap.set and TimeMap.get&nbsp;functions will be called a total of 120000 times (combined) per test case.

**/
class _1023_Time_Based_Key_Value_Store {

    /** Initialize your data structure here. */
    public _1023_Time_Based_Key_Value_Store() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        
    }
    
    public String get(String key, int timestamp) {
        
    }
}

/**
 * Your _1023_Time_Based_Key_Value_Store object will be instantiated and called as such:
 * _1023_Time_Based_Key_Value_Store obj = new _1023_Time_Based_Key_Value_Store();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */