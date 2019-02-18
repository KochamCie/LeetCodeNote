package com.hama.leetcode;
/**
Given a complete binary tree, count the number of nodes.

Note: 

Definition of a complete binary tree from Wikipedia:
In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

Example:


Input: 
    1
   / \
  2   3
 / \  /
4  5 6

Output: 6
**/
_222_Count_Complete_Tree_Nodes/_222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_NodesD_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodesf_222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodesn_222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesn_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesf_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesa_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesb_222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodesn_222_Count_Complete_Tree_Nodesa_222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodesy_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesn_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesd_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodes._222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesp_222_Count_Complete_Tree_Nodesu_222_Count_Complete_Tree_Nodesb_222_Count_Complete_Tree_Nodesl_222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodesc_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesc_222_Count_Complete_Tree_Nodesl_222_Count_Complete_Tree_Nodesa_222_Count_Complete_Tree_Nodess_222_Count_Complete_Tree_Nodess_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_NodesT_222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_NodesN_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesd_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes{_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodesn_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesv_222_Count_Complete_Tree_Nodesa_222_Count_Complete_Tree_Nodesl_222_Count_Complete_Tree_Nodes;_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_NodesT_222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_NodesN_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesd_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesl_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodesf_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodes;_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_NodesT_222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_NodesN_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesd_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodesg_222_Count_Complete_Tree_Nodesh_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodes;_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_NodesT_222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_NodesN_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesd_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodes(_222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodesn_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesx_222_Count_Complete_Tree_Nodes)_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes{_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesv_222_Count_Complete_Tree_Nodesa_222_Count_Complete_Tree_Nodesl_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes=_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesx_222_Count_Complete_Tree_Nodes;_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes}_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes}_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes*_222_Count_Complete_Tree_Nodes/_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodesc_222_Count_Complete_Tree_Nodesl_222_Count_Complete_Tree_Nodesa_222_Count_Complete_Tree_Nodess_222_Count_Complete_Tree_Nodess_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes__222_Count_Complete_Tree_Nodes2_222_Count_Complete_Tree_Nodes2_222_Count_Complete_Tree_Nodes2_222_Count_Complete_Tree_Nodes__222_Count_Complete_Tree_NodesC_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesu_222_Count_Complete_Tree_Nodesn_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodes__222_Count_Complete_Tree_NodesC_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesm_222_Count_Complete_Tree_Nodesp_222_Count_Complete_Tree_Nodesl_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodes__222_Count_Complete_Tree_NodesT_222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodes__222_Count_Complete_Tree_NodesN_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesd_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodess_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes{_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesp_222_Count_Complete_Tree_Nodesu_222_Count_Complete_Tree_Nodesb_222_Count_Complete_Tree_Nodesl_222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodesc_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesi_222_Count_Complete_Tree_Nodesn_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesc_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesu_222_Count_Complete_Tree_Nodesn_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_NodesN_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesd_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodess_222_Count_Complete_Tree_Nodes(_222_Count_Complete_Tree_NodesT_222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_NodesN_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodesd_222_Count_Complete_Tree_Nodese_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodesr_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodeso_222_Count_Complete_Tree_Nodest_222_Count_Complete_Tree_Nodes)_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes{_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes _222_Count_Complete_Tree_Nodes}_222_Count_Complete_Tree_Nodes
_222_Count_Complete_Tree_Nodes}_222_Count_Complete_Tree_Nodes