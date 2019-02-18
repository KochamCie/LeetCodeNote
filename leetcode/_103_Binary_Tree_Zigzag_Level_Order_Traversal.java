package com.hama.leetcode;
/**
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).


For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7



return its zigzag level order traversal as:

[
  [3],
  [20,9],
  [15,7]
]

**/
_103_Binary_Tree_Zigzag_Level_Order_Traversal/_103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_TraversalD_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversalf_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversaln_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversaln_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalf_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalb_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversaln_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversaly_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversaln_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversald_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversal._103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalp_103_Binary_Tree_Zigzag_Level_Order_Traversalu_103_Binary_Tree_Zigzag_Level_Order_Traversalb_103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversalc_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalc_103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversals_103_Binary_Tree_Zigzag_Level_Order_Traversals_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_TraversalT_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_TraversalN_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversald_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal{_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversaln_103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalv_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_Traversal;_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_TraversalT_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_TraversalN_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversald_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversalf_103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversal;_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_TraversalT_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_TraversalN_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversald_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversalg_103_Binary_Tree_Zigzag_Level_Order_Traversalh_103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversal;_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_TraversalT_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_TraversalN_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversald_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversal(_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversaln_103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalx_103_Binary_Tree_Zigzag_Level_Order_Traversal)_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal{_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalv_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal=_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalx_103_Binary_Tree_Zigzag_Level_Order_Traversal;_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal}_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal}_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal*_103_Binary_Tree_Zigzag_Level_Order_Traversal/_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversalc_103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversals_103_Binary_Tree_Zigzag_Level_Order_Traversals_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal__103_Binary_Tree_Zigzag_Level_Order_Traversal1_103_Binary_Tree_Zigzag_Level_Order_Traversal0_103_Binary_Tree_Zigzag_Level_Order_Traversal3_103_Binary_Tree_Zigzag_Level_Order_Traversal__103_Binary_Tree_Zigzag_Level_Order_TraversalB_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversaln_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversaly_103_Binary_Tree_Zigzag_Level_Order_Traversal__103_Binary_Tree_Zigzag_Level_Order_TraversalT_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversal__103_Binary_Tree_Zigzag_Level_Order_TraversalZ_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversalg_103_Binary_Tree_Zigzag_Level_Order_Traversalz_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversalg_103_Binary_Tree_Zigzag_Level_Order_Traversal__103_Binary_Tree_Zigzag_Level_Order_TraversalL_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversalv_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_Traversal__103_Binary_Tree_Zigzag_Level_Order_TraversalO_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversald_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversal__103_Binary_Tree_Zigzag_Level_Order_TraversalT_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversalv_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversals_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal{_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalp_103_Binary_Tree_Zigzag_Level_Order_Traversalu_103_Binary_Tree_Zigzag_Level_Order_Traversalb_103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversalc_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_TraversalL_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversals_103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversal<_103_Binary_Tree_Zigzag_Level_Order_TraversalL_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversals_103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversal<_103_Binary_Tree_Zigzag_Level_Order_TraversalI_103_Binary_Tree_Zigzag_Level_Order_Traversaln_103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversalg_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversal>_103_Binary_Tree_Zigzag_Level_Order_Traversal>_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalz_103_Binary_Tree_Zigzag_Level_Order_Traversali_103_Binary_Tree_Zigzag_Level_Order_Traversalg_103_Binary_Tree_Zigzag_Level_Order_Traversalz_103_Binary_Tree_Zigzag_Level_Order_Traversala_103_Binary_Tree_Zigzag_Level_Order_Traversalg_103_Binary_Tree_Zigzag_Level_Order_TraversalL_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversalv_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversall_103_Binary_Tree_Zigzag_Level_Order_TraversalO_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversald_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversal(_103_Binary_Tree_Zigzag_Level_Order_TraversalT_103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_TraversalN_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversald_103_Binary_Tree_Zigzag_Level_Order_Traversale_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversalr_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversalo_103_Binary_Tree_Zigzag_Level_Order_Traversalt_103_Binary_Tree_Zigzag_Level_Order_Traversal)_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal{_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal _103_Binary_Tree_Zigzag_Level_Order_Traversal}_103_Binary_Tree_Zigzag_Level_Order_Traversal
_103_Binary_Tree_Zigzag_Level_Order_Traversal}_103_Binary_Tree_Zigzag_Level_Order_Traversal