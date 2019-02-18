package com.hama.leetcode;
/**
There are N workers.&nbsp; The i-th worker has a quality[i] and a minimum wage expectation wage[i].

Now we want to hire exactly K&nbsp;workers to form a paid group.&nbsp; When hiring a group of K workers, we must pay them according to the following rules:


	Every worker in the paid group should be paid in the ratio of their quality compared to other workers in the paid group.
	Every worker in the paid group must be paid at least their minimum wage expectation.


Return the least amount of money needed to form a paid group satisfying the above conditions.

&nbsp;





Example 1:


Input: quality = [10,20,5], wage = [70,50,30], K = 2
Output: 105.00000
Explanation: We pay 70 to 0-th worker and 35 to 2-th worker.



Example 2:


Input: quality = [3,1,10,10,1], wage = [4,8,2,2,7], K = 3
Output: 30.66667
Explanation: We pay 4 to 0-th worker, 13.33333 to 2-th and 3-th workers seperately. 


&nbsp;

Note:


	1 &lt;= K &lt;= N &lt;= 10000, where N = quality.length = wage.length
	1 &lt;= quality[i] &lt;= 10000
	1 &lt;= wage[i] &lt;= 10000
	Answers within 10^-5 of the correct answer will be considered correct.



**/
class _887_Minimum_Cost_to_Hire_K_Workers {
    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        
    }
}