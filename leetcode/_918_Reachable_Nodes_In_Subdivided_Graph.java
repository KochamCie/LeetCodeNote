package com.hama.leetcode;
/**
Starting with an&nbsp;undirected graph (the original graph) with nodes from 0 to N-1, subdivisions are made to some of the edges.

The graph is given as follows: edges[k] is a list of integer pairs (i, j, n) such that (i, j) is an edge of the original graph,

and n is the total number of new nodes on that edge.&nbsp;

Then, the edge (i, j) is deleted from the original graph,&nbsp;n&nbsp;new nodes (x_1, x_2, ..., x_n) are added to the original graph,

and n+1 new&nbsp;edges (i, x_1), (x_1, x_2), (x_2, x_3), ..., (x_{n-1}, x_n), (x_n, j)&nbsp;are added to the original&nbsp;graph.

Now, you start at node 0&nbsp;from the original graph, and in each move, you travel along one&nbsp;edge.&nbsp;

Return how many nodes you can reach in at most M moves.

&nbsp;

Example 1:


Input: edges = [[0,1,10],[0,2,1],[1,2,2]], M = 6, N = 3
Output: 13
Explanation: 
The nodes that are reachable in the final graph after M = 6 moves are indicated below.




Example 2:


Input: edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], M = 10, N = 4
Output: 23

&nbsp;


Note:


	0 &lt;= edges.length &lt;= 10000
	0 &lt;= edges[i][0] &lt;&nbsp;edges[i][1] &lt; N
	There does not exist any&nbsp;i != j for which edges[i][0] == edges[j][0] and edges[i][1] == edges[j][1].
	The original graph&nbsp;has no parallel edges.
	0 &lt;= edges[i][2] &lt;= 10000
	0 &lt;= M &lt;= 10^9
	1 &lt;= N &lt;= 3000
	A reachable node is a node that can be travelled to&nbsp;using at most&nbsp;M moves starting from&nbsp;node 0.



&nbsp;

**/
class _918_Reachable_Nodes_In_Subdivided_Graph {
    public int reachableNodes(int[][] edges, int M, int N) {
        
    }
}