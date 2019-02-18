package com.hama.leetcode;
/**
There are two types of soup: type A and type B. Initially we have N ml of each type of soup. There are four kinds of operations:


	Serve&nbsp;100 ml of soup A and 0 ml of soup B
	Serve&nbsp;75 ml of soup A and 25&nbsp;ml of soup B
	Serve 50 ml of soup A and 50 ml of soup B
	Serve 25&nbsp;ml of soup A and 75&nbsp;ml of soup B


When we serve some soup, we give it to someone and we no longer have it.&nbsp; Each turn,&nbsp;we will choose from the four operations with equal probability 0.25. If the remaining volume of soup is not enough to complete the operation, we will serve&nbsp;as much as we can.&nbsp; We stop once we no longer have some quantity of both types of soup.

Note that we do not have the operation where all 100 ml&#39;s of soup B are used first.&nbsp;&nbsp;

Return the probability that soup A will be empty&nbsp;first, plus half the probability that A and B become empty at the same time.

&nbsp;


Example:
Input: N = 50
Output: 0.625
Explanation: 
If we choose the first two operations, A will become empty first. For the third operation, A and B will become empty at the same time. For the fourth operation, B will become empty first. So the total probability of A becoming empty first plus half the probability that A and B become empty at the same time, is 0.25 * (1 + 1 + 0.5 + 0) = 0.625.



Notes: 


	0 &lt;= N &lt;= 10^9.&nbsp;
	Answers within&nbsp;10^-6&nbsp;of the true value will be accepted as correct.

**/
class _826_Soup_Servings {
    public double soupServings(int N) {
        
    }
}