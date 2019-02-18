package com.hama.leetcode;
/**
An undirected, connected&nbsp;tree with N nodes labelled 0...N-1 and N-1 edges&nbsp;are&nbsp;given.

The ith edge connects nodes&nbsp;edges[i][0] and&nbsp;edges[i][1]&nbsp;together.

Return a list ans, where ans[i] is the sum of the distances between node i and all other nodes.

Example 1:


Input: N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
Output: [8,12,6,10,10,10]
Explanation: 
Here is a diagram of the given tree:
  0
 / \
1   2
   /|\
  3 4 5
We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
equals 1 + 1 + 2 + 2 + 2 = 8.  Hence, answer[0] = 8, and so on.


Note:&nbsp;1 &lt;= N &lt;= 10000
**/
class _863_Sum_of_Distances_in_Tree {
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        
    }
}