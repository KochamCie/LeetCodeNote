package com.hama.leetcode;
/**
We are given an array&nbsp;A of N lowercase letter strings, all of the same length.

Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.

For example, if we have an array A = [abcdef,uvwxyz] and deletion indices {0, 2, 3}, then the final array after deletions is [bef,vyz].

Suppose we chose a set of deletion indices D such that after deletions, the final array has its elements in lexicographic order (A[0] &lt;= A[1] &lt;= A[2] ... &lt;= A[A.length - 1]).

Return the minimum possible value of D.length.

&nbsp;









Example 1:


Input: [ca,bb,ac]
Output: 1
Explanation: 
After deleting the first column, A = [a, b, c].
Now A is in lexicographic order (ie. A[0] &lt;= A[1] &lt;= A[2]).
We require at least 1 deletion since initially A was not in lexicographic order, so the answer is 1.



Example 2:


Input: [xc,yb,za]
Output: 0
Explanation: 
A is already in lexicographic order, so we don&#39;t need to delete anything.
Note that the rows of A are not necessarily in lexicographic order:
ie. it is NOT necessarily true that (A[0][0] &lt;= A[0][1] &lt;= ...)



Example 3:


Input: [zyx,wvu,tsr]
Output: 3
Explanation: 
We have to delete every column.


&nbsp;



Note:


	1 &lt;= A.length &lt;= 100
	1 &lt;= A[i].length &lt;= 100






**/
class _992_Delete_Columns_to_Make_Sorted_II {
    public int minDeletionSize(String[] A) {
        
    }
}