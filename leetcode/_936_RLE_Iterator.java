package com.hama.leetcode;
/**
Write an iterator that iterates through a run-length encoded sequence.

The iterator is initialized by RLEIterator(int[] A), where A is a run-length encoding of some&nbsp;sequence.&nbsp; More specifically,&nbsp;for all even i,&nbsp;A[i] tells us the number of times that the non-negative integer value A[i+1] is repeated in the sequence.

The iterator supports one function:&nbsp;next(int n), which exhausts the next n elements&nbsp;(n &gt;= 1) and returns the last element exhausted in this way.&nbsp; If there is no element left to exhaust, next&nbsp;returns -1 instead.

For example, we start with A = [3,8,0,9,2,5], which is a run-length encoding of the sequence [8,8,8,5,5].&nbsp; This is because the sequence can be read as&nbsp;three eights, zero nines, two fives.

&nbsp;

Example 1:


Input: [RLEIterator,next,next,next,next], [[[3,8,0,9,2,5]],[2],[1],[1],[2]]
Output: [null,8,8,5,-1]
Explanation: 
RLEIterator is initialized with RLEIterator([3,8,0,9,2,5]).
This maps to the sequence [8,8,8,5,5].
RLEIterator.next is then called 4 times:

.next(2) exhausts 2 terms of the sequence, returning 8.  The remaining sequence is now [8, 5, 5].

.next(1) exhausts 1 term of the sequence, returning 8.  The remaining sequence is now [5, 5].

.next(1) exhausts 1 term of the sequence, returning 5.  The remaining sequence is now [5].

.next(2) exhausts 2 terms, returning -1.  This is because the first term exhausted was 5,
but the second term did not exist.  Since the last term exhausted does not exist, we return -1.



Note:


	0 &lt;= A.length &lt;= 1000
	A.length&nbsp;is an even integer.
	0 &lt;= A[i] &lt;= 10^9
	There are at most 1000 calls to RLEIterator.next(int n) per test case.
	Each call to&nbsp;RLEIterator.next(int n)&nbsp;will have 1 &lt;= n &lt;= 10^9.

**/
class _936_RLE_Iterator {

    public _936_RLE_Iterator(int[] A) {
        
    }
    
    public int next(int n) {
        
    }
}

/**
 * Your _936_RLE_Iterator object will be instantiated and called as such:
 * _936_RLE_Iterator obj = new _936_RLE_Iterator(A);
 * int param_1 = obj.next(n);
 */