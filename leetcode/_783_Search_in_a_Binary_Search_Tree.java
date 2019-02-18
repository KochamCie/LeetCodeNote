package com.hama.leetcode;
/**
Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node&#39;s value equals the given value. Return the subtree rooted with that node. If such node doesn&#39;t exist, you should return NULL.

For example,&nbsp;


Given the tree:
        4
       / \
      2   7
     / \
    1   3

And the value to search: 2


You should return this subtree:


      2     
     / \   
    1   3


In the example above, if we want to search the value 5, since there is no node with value 5, we should return NULL.

Note that an empty tree is represented by NULL, therefore you would see the expected output (serialized tree format) as&nbsp;[], not null.
**/
_783_Search_in_a_Binary_Search_Tree/_783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_TreeD_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treef_783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treen_783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treet_783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treen_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treef_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treeb_783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treen_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treey_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treet_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treen_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treed_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Tree._783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treep_783_Search_in_a_Binary_Search_Treeu_783_Search_in_a_Binary_Search_Treeb_783_Search_in_a_Binary_Search_Treel_783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treec_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treec_783_Search_in_a_Binary_Search_Treel_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Trees_783_Search_in_a_Binary_Search_Trees_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_TreeT_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_TreeN_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treed_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree{_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treen_783_Search_in_a_Binary_Search_Treet_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treev_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Treel_783_Search_in_a_Binary_Search_Tree;_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_TreeT_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_TreeN_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treed_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treel_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treef_783_Search_in_a_Binary_Search_Treet_783_Search_in_a_Binary_Search_Tree;_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_TreeT_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_TreeN_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treed_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treeg_783_Search_in_a_Binary_Search_Treeh_783_Search_in_a_Binary_Search_Treet_783_Search_in_a_Binary_Search_Tree;_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_TreeT_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_TreeN_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treed_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Tree(_783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treen_783_Search_in_a_Binary_Search_Treet_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treex_783_Search_in_a_Binary_Search_Tree)_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree{_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treev_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Treel_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree=_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treex_783_Search_in_a_Binary_Search_Tree;_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree}_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree}_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree*_783_Search_in_a_Binary_Search_Tree/_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Treec_783_Search_in_a_Binary_Search_Treel_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Trees_783_Search_in_a_Binary_Search_Trees_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree__783_Search_in_a_Binary_Search_Tree7_783_Search_in_a_Binary_Search_Tree8_783_Search_in_a_Binary_Search_Tree3_783_Search_in_a_Binary_Search_Tree__783_Search_in_a_Binary_Search_TreeS_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treec_783_Search_in_a_Binary_Search_Treeh_783_Search_in_a_Binary_Search_Tree__783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treen_783_Search_in_a_Binary_Search_Tree__783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Tree__783_Search_in_a_Binary_Search_TreeB_783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treen_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treey_783_Search_in_a_Binary_Search_Tree__783_Search_in_a_Binary_Search_TreeS_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treec_783_Search_in_a_Binary_Search_Treeh_783_Search_in_a_Binary_Search_Tree__783_Search_in_a_Binary_Search_TreeT_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree{_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treep_783_Search_in_a_Binary_Search_Treeu_783_Search_in_a_Binary_Search_Treeb_783_Search_in_a_Binary_Search_Treel_783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treec_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_TreeT_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_TreeN_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treed_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Trees_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treec_783_Search_in_a_Binary_Search_Treeh_783_Search_in_a_Binary_Search_TreeB_783_Search_in_a_Binary_Search_TreeS_783_Search_in_a_Binary_Search_TreeT_783_Search_in_a_Binary_Search_Tree(_783_Search_in_a_Binary_Search_TreeT_783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_TreeN_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treed_783_Search_in_a_Binary_Search_Treee_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treer_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treeo_783_Search_in_a_Binary_Search_Treet_783_Search_in_a_Binary_Search_Tree,_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treei_783_Search_in_a_Binary_Search_Treen_783_Search_in_a_Binary_Search_Treet_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Treev_783_Search_in_a_Binary_Search_Treea_783_Search_in_a_Binary_Search_Treel_783_Search_in_a_Binary_Search_Tree)_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree{_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree _783_Search_in_a_Binary_Search_Tree}_783_Search_in_a_Binary_Search_Tree
_783_Search_in_a_Binary_Search_Tree}_783_Search_in_a_Binary_Search_Tree