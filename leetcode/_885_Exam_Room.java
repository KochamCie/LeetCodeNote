package com.hama.leetcode;
/**
In an exam room, there are N seats in a single row, numbered 0, 1, 2, ..., N-1.

When a student enters the room, they must sit in the seat that maximizes the distance to the closest person.&nbsp; If there are multiple such seats, they sit in the seat with the lowest number.&nbsp; (Also, if no one is in the room, then the student sits at seat number 0.)

Return a class ExamRoom(int N)&nbsp;that exposes two functions: ExamRoom.seat()&nbsp;returning an int&nbsp;representing what seat the student sat in, and ExamRoom.leave(int p)&nbsp;representing that the student in seat number p&nbsp;now leaves the room.&nbsp; It is guaranteed that any calls to ExamRoom.leave(p) have a student sitting in seat p.

&nbsp;

Example 1:


Input: [ExamRoom,seat,seat,seat,seat,leave,seat], [[10],[],[],[],[],[4],[]]
Output: [null,0,9,4,2,null,5]
Explanation:
ExamRoom(10) -&gt; null
seat() -&gt; 0, no one is in the room, then the student sits at seat number 0.
seat() -&gt; 9, the student sits at the last seat number 9.
seat() -&gt; 4, the student sits at the last seat number 4.
seat() -&gt; 2, the student sits at the last seat number 2.
leave(4) -&gt; null
seat() -&gt; 5, the student sits at the last seat number 5.


​​​​​​​

Note:


	1 &lt;= N &lt;= 10^9
	ExamRoom.seat() and ExamRoom.leave() will be called at most 10^4 times across all test cases.
	Calls to ExamRoom.leave(p) are guaranteed to have a student currently sitting in seat number p.

**/
class _885_Exam_Room {

    public _885_Exam_Room(int N) {
        
    }
    
    public int seat() {
        
    }
    
    public void leave(int p) {
        
    }
}

/**
 * Your _885_Exam_Room object will be instantiated and called as such:
 * _885_Exam_Room obj = new _885_Exam_Room(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */