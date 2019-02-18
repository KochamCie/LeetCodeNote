package com.hama.leetcode;
/**
In an election, the i-th&nbsp;vote was cast for persons[i] at time times[i].

Now, we would like to implement the following query function: TopVotedCandidate.q(int t) will return the number of the person that was leading the election at time t.&nbsp;&nbsp;

Votes cast at time t will count towards our query.&nbsp; In the case of a tie, the most recent vote (among tied candidates) wins.

&nbsp;


Example 1:


Input: [TopVotedCandidate,q,q,q,q,q,q], [[[0,1,1,0,0,1,0],[0,5,10,15,20,25,30]],[3],[12],[25],[15],[24],[8]]
Output: [null,0,1,1,0,0,1]
Explanation: 
At time 3, the votes are [0], and 0 is leading.
At time 12, the votes are [0,1,1], and 1 is leading.
At time 25, the votes are [0,1,1,0,0,1], and 1 is leading (as ties go to the most recent vote.)
This continues for 3 more queries at time 15, 24, and 8.


&nbsp;

Note:


	1 &lt;= persons.length = times.length &lt;= 5000
	0 &lt;= persons[i] &lt;= persons.length
	times&nbsp;is a strictly increasing array with all elements in [0, 10^9].
	TopVotedCandidate.q is called at most 10000 times per test case.
	TopVotedCandidate.q(int t) is always called with t &gt;= times[0].


**/
class _947_Online_Election {

    public _947_Online_Election(int[] persons, int[] times) {
        
    }
    
    public int q(int t) {
        
    }
}

/**
 * Your _947_Online_Election object will be instantiated and called as such:
 * _947_Online_Election obj = new _947_Online_Election(persons, times);
 * int param_1 = obj.q(t);
 */