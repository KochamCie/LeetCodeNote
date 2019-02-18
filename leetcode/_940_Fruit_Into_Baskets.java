package com.hama.leetcode;
/**
In a row of trees, the i-th tree&nbsp;produces&nbsp;fruit with type&nbsp;tree[i].

You start at any tree&nbsp;of your choice, then repeatedly perform the following steps:


	Add one piece of fruit from this tree to your baskets.&nbsp; If you cannot, stop.
	Move to the next tree to the right of the current tree.&nbsp; If there is no tree to the right, stop.


Note that you do not have any choice after the initial choice of starting tree:&nbsp;you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.

You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.

What is the total amount of fruit you can collect with this procedure?

&nbsp;

Example 1:


Input: [1,2,1]
Output: 3
Explanation: We can collect [1,2,1].



Example 2:


Input: [0,1,2,2]
Output: 3
Explanation: We can collect [1,2,2].
If we started at the first tree, we would only collect [0, 1].



Example 3:


Input: [1,2,3,2,2]
Output: 4
Explanation: We can collect [2,3,2,2].
If we started at the first tree, we would only collect [1, 2].



Example 4:


Input: [3,3,3,1,2,1,1,2,3,3,4]
Output: 5
Explanation: We can collect [1,2,1,1,2].
If we started at the first tree or the eighth tree, we would only collect 4 fruits.


&nbsp;




Note:


	1 &lt;= tree.length &lt;= 40000
	0 &lt;= tree[i] &lt; tree.length

**/
class _940_Fruit_Into_Baskets {
    public int totalFruit(int[] tree) {
        
    }
}