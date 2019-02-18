package com.hama.leetcode;
/**
Invert a binary tree.

Example:

Input:


     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:


     4
   /   \
  7     2
 / \   / \
9   6 3   1

Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can&rsquo;t invert a binary tree on a whiteboard so f*** off.
**/
_226_Invert_Binary_Tree/_226_Invert_Binary_Tree*_226_Invert_Binary_Tree*_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree*_226_Invert_Binary_Tree _226_Invert_Binary_TreeD_226_Invert_Binary_Treee_226_Invert_Binary_Treef_226_Invert_Binary_Treei_226_Invert_Binary_Treen_226_Invert_Binary_Treei_226_Invert_Binary_Treet_226_Invert_Binary_Treei_226_Invert_Binary_Treeo_226_Invert_Binary_Treen_226_Invert_Binary_Tree _226_Invert_Binary_Treef_226_Invert_Binary_Treeo_226_Invert_Binary_Treer_226_Invert_Binary_Tree _226_Invert_Binary_Treea_226_Invert_Binary_Tree _226_Invert_Binary_Treeb_226_Invert_Binary_Treei_226_Invert_Binary_Treen_226_Invert_Binary_Treea_226_Invert_Binary_Treer_226_Invert_Binary_Treey_226_Invert_Binary_Tree _226_Invert_Binary_Treet_226_Invert_Binary_Treer_226_Invert_Binary_Treee_226_Invert_Binary_Treee_226_Invert_Binary_Tree _226_Invert_Binary_Treen_226_Invert_Binary_Treeo_226_Invert_Binary_Treed_226_Invert_Binary_Treee_226_Invert_Binary_Tree._226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree*_226_Invert_Binary_Tree _226_Invert_Binary_Treep_226_Invert_Binary_Treeu_226_Invert_Binary_Treeb_226_Invert_Binary_Treel_226_Invert_Binary_Treei_226_Invert_Binary_Treec_226_Invert_Binary_Tree _226_Invert_Binary_Treec_226_Invert_Binary_Treel_226_Invert_Binary_Treea_226_Invert_Binary_Trees_226_Invert_Binary_Trees_226_Invert_Binary_Tree _226_Invert_Binary_TreeT_226_Invert_Binary_Treer_226_Invert_Binary_Treee_226_Invert_Binary_Treee_226_Invert_Binary_TreeN_226_Invert_Binary_Treeo_226_Invert_Binary_Treed_226_Invert_Binary_Treee_226_Invert_Binary_Tree _226_Invert_Binary_Tree{_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree*_226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Treei_226_Invert_Binary_Treen_226_Invert_Binary_Treet_226_Invert_Binary_Tree _226_Invert_Binary_Treev_226_Invert_Binary_Treea_226_Invert_Binary_Treel_226_Invert_Binary_Tree;_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree*_226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_TreeT_226_Invert_Binary_Treer_226_Invert_Binary_Treee_226_Invert_Binary_Treee_226_Invert_Binary_TreeN_226_Invert_Binary_Treeo_226_Invert_Binary_Treed_226_Invert_Binary_Treee_226_Invert_Binary_Tree _226_Invert_Binary_Treel_226_Invert_Binary_Treee_226_Invert_Binary_Treef_226_Invert_Binary_Treet_226_Invert_Binary_Tree;_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree*_226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_TreeT_226_Invert_Binary_Treer_226_Invert_Binary_Treee_226_Invert_Binary_Treee_226_Invert_Binary_TreeN_226_Invert_Binary_Treeo_226_Invert_Binary_Treed_226_Invert_Binary_Treee_226_Invert_Binary_Tree _226_Invert_Binary_Treer_226_Invert_Binary_Treei_226_Invert_Binary_Treeg_226_Invert_Binary_Treeh_226_Invert_Binary_Treet_226_Invert_Binary_Tree;_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree*_226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_TreeT_226_Invert_Binary_Treer_226_Invert_Binary_Treee_226_Invert_Binary_Treee_226_Invert_Binary_TreeN_226_Invert_Binary_Treeo_226_Invert_Binary_Treed_226_Invert_Binary_Treee_226_Invert_Binary_Tree(_226_Invert_Binary_Treei_226_Invert_Binary_Treen_226_Invert_Binary_Treet_226_Invert_Binary_Tree _226_Invert_Binary_Treex_226_Invert_Binary_Tree)_226_Invert_Binary_Tree _226_Invert_Binary_Tree{_226_Invert_Binary_Tree _226_Invert_Binary_Treev_226_Invert_Binary_Treea_226_Invert_Binary_Treel_226_Invert_Binary_Tree _226_Invert_Binary_Tree=_226_Invert_Binary_Tree _226_Invert_Binary_Treex_226_Invert_Binary_Tree;_226_Invert_Binary_Tree _226_Invert_Binary_Tree}_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree*_226_Invert_Binary_Tree _226_Invert_Binary_Tree}_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree*_226_Invert_Binary_Tree/_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Treec_226_Invert_Binary_Treel_226_Invert_Binary_Treea_226_Invert_Binary_Trees_226_Invert_Binary_Trees_226_Invert_Binary_Tree _226_Invert_Binary_Tree__226_Invert_Binary_Tree2_226_Invert_Binary_Tree2_226_Invert_Binary_Tree6_226_Invert_Binary_Tree__226_Invert_Binary_TreeI_226_Invert_Binary_Treen_226_Invert_Binary_Treev_226_Invert_Binary_Treee_226_Invert_Binary_Treer_226_Invert_Binary_Treet_226_Invert_Binary_Tree__226_Invert_Binary_TreeB_226_Invert_Binary_Treei_226_Invert_Binary_Treen_226_Invert_Binary_Treea_226_Invert_Binary_Treer_226_Invert_Binary_Treey_226_Invert_Binary_Tree__226_Invert_Binary_TreeT_226_Invert_Binary_Treer_226_Invert_Binary_Treee_226_Invert_Binary_Treee_226_Invert_Binary_Tree _226_Invert_Binary_Tree{_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Treep_226_Invert_Binary_Treeu_226_Invert_Binary_Treeb_226_Invert_Binary_Treel_226_Invert_Binary_Treei_226_Invert_Binary_Treec_226_Invert_Binary_Tree _226_Invert_Binary_TreeT_226_Invert_Binary_Treer_226_Invert_Binary_Treee_226_Invert_Binary_Treee_226_Invert_Binary_TreeN_226_Invert_Binary_Treeo_226_Invert_Binary_Treed_226_Invert_Binary_Treee_226_Invert_Binary_Tree _226_Invert_Binary_Treei_226_Invert_Binary_Treen_226_Invert_Binary_Treev_226_Invert_Binary_Treee_226_Invert_Binary_Treer_226_Invert_Binary_Treet_226_Invert_Binary_TreeT_226_Invert_Binary_Treer_226_Invert_Binary_Treee_226_Invert_Binary_Treee_226_Invert_Binary_Tree(_226_Invert_Binary_TreeT_226_Invert_Binary_Treer_226_Invert_Binary_Treee_226_Invert_Binary_Treee_226_Invert_Binary_TreeN_226_Invert_Binary_Treeo_226_Invert_Binary_Treed_226_Invert_Binary_Treee_226_Invert_Binary_Tree _226_Invert_Binary_Treer_226_Invert_Binary_Treeo_226_Invert_Binary_Treeo_226_Invert_Binary_Treet_226_Invert_Binary_Tree)_226_Invert_Binary_Tree _226_Invert_Binary_Tree{_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree _226_Invert_Binary_Tree}_226_Invert_Binary_Tree_226_Invert_Binary_Tree
_226_Invert_Binary_Tree}_226_Invert_Binary_Tree