package com.hama.leetcode;
/**

Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.


Example 1:

Given tree s:

     3
    / \
   4   5
  / \
 1   2

Given tree t:

   4 
  / \
 1   2

Return true, because t has the same structure and node values with a subtree of s.


Example 2:

Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0

Given tree t:

   4
  / \
 1   2

Return false.
**/
_572_Subtree_of_Another_Tree/_572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree _572_Subtree_of_Another_TreeD_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treef_572_Subtree_of_Another_Treei_572_Subtree_of_Another_Treen_572_Subtree_of_Another_Treei_572_Subtree_of_Another_Treet_572_Subtree_of_Another_Treei_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treen_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treef_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treea_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treeb_572_Subtree_of_Another_Treei_572_Subtree_of_Another_Treen_572_Subtree_of_Another_Treea_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treey_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treet_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treen_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treed_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree._572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treep_572_Subtree_of_Another_Treeu_572_Subtree_of_Another_Treeb_572_Subtree_of_Another_Treel_572_Subtree_of_Another_Treei_572_Subtree_of_Another_Treec_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treec_572_Subtree_of_Another_Treel_572_Subtree_of_Another_Treea_572_Subtree_of_Another_Trees_572_Subtree_of_Another_Trees_572_Subtree_of_Another_Tree _572_Subtree_of_Another_TreeT_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_TreeN_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treed_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree{_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treei_572_Subtree_of_Another_Treen_572_Subtree_of_Another_Treet_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treev_572_Subtree_of_Another_Treea_572_Subtree_of_Another_Treel_572_Subtree_of_Another_Tree;_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_TreeT_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_TreeN_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treed_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treel_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treef_572_Subtree_of_Another_Treet_572_Subtree_of_Another_Tree;_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_TreeT_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_TreeN_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treed_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treei_572_Subtree_of_Another_Treeg_572_Subtree_of_Another_Treeh_572_Subtree_of_Another_Treet_572_Subtree_of_Another_Tree;_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_TreeT_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_TreeN_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treed_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree(_572_Subtree_of_Another_Treei_572_Subtree_of_Another_Treen_572_Subtree_of_Another_Treet_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treex_572_Subtree_of_Another_Tree)_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree{_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treev_572_Subtree_of_Another_Treea_572_Subtree_of_Another_Treel_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree=_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treex_572_Subtree_of_Another_Tree;_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree}_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree}_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree*_572_Subtree_of_Another_Tree/_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Treec_572_Subtree_of_Another_Treel_572_Subtree_of_Another_Treea_572_Subtree_of_Another_Trees_572_Subtree_of_Another_Trees_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree__572_Subtree_of_Another_Tree5_572_Subtree_of_Another_Tree7_572_Subtree_of_Another_Tree2_572_Subtree_of_Another_Tree__572_Subtree_of_Another_TreeS_572_Subtree_of_Another_Treeu_572_Subtree_of_Another_Treeb_572_Subtree_of_Another_Treet_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree__572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treef_572_Subtree_of_Another_Tree__572_Subtree_of_Another_TreeA_572_Subtree_of_Another_Treen_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treet_572_Subtree_of_Another_Treeh_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Tree__572_Subtree_of_Another_TreeT_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree{_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treep_572_Subtree_of_Another_Treeu_572_Subtree_of_Another_Treeb_572_Subtree_of_Another_Treel_572_Subtree_of_Another_Treei_572_Subtree_of_Another_Treec_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treeb_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treel_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treea_572_Subtree_of_Another_Treen_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treei_572_Subtree_of_Another_Trees_572_Subtree_of_Another_TreeS_572_Subtree_of_Another_Treeu_572_Subtree_of_Another_Treeb_572_Subtree_of_Another_Treet_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree(_572_Subtree_of_Another_TreeT_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_TreeN_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treed_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Trees_572_Subtree_of_Another_Tree,_572_Subtree_of_Another_Tree _572_Subtree_of_Another_TreeT_572_Subtree_of_Another_Treer_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Treee_572_Subtree_of_Another_TreeN_572_Subtree_of_Another_Treeo_572_Subtree_of_Another_Treed_572_Subtree_of_Another_Treee_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Treet_572_Subtree_of_Another_Tree)_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree{_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree _572_Subtree_of_Another_Tree}_572_Subtree_of_Another_Tree
_572_Subtree_of_Another_Tree}_572_Subtree_of_Another_Tree