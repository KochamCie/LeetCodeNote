package com.hama.leetcode;
/**
Print a binary tree in an m*n 2D string array following these rules: 


The row number m should be equal to the height of the given binary tree.
The column number n should always be an odd number.
The root node's value (in string format) should be put in the exactly middle of the first row it can be put. The column and the row where the root node belongs will separate the rest space into two parts (left-bottom part and right-bottom part). You should print the left subtree in the left-bottom part and print the right subtree in the right-bottom part. The left-bottom part and the right-bottom part should have the same size. Even if one subtree is none while the other is not, you don't need to print anything for the none subtree but still need to leave the space as large as that for the other subtree. However, if two subtrees are none, then you don't need to leave space for both of them. 
Each unused space should contain an empty string "".
Print the subtrees following the same rules.


Example 1:

Input:
     1
    /
   2
Output:
[["", "1", ""],
 ["2", "", ""]]




Example 2:

Input:
     1
    / \
   2   3
    \
     4
Output:
[["", "", "", "1", "", "", ""],
 ["", "2", "", "", "", "3", ""],
 ["", "", "4", "", "", "", ""]]



Example 3:

Input:
      1
     / \
    2   5
   / 
  3 
 / 
4 
Output:

[["",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""]
 ["",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""]
 ["",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]
 ["4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]]



Note:
The height of binary tree is in the range of [1, 10].
**/
_655_Print_Binary_Tree/_655_Print_Binary_Tree*_655_Print_Binary_Tree*_655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree*_655_Print_Binary_Tree _655_Print_Binary_TreeD_655_Print_Binary_Treee_655_Print_Binary_Treef_655_Print_Binary_Treei_655_Print_Binary_Treen_655_Print_Binary_Treei_655_Print_Binary_Treet_655_Print_Binary_Treei_655_Print_Binary_Treeo_655_Print_Binary_Treen_655_Print_Binary_Tree _655_Print_Binary_Treef_655_Print_Binary_Treeo_655_Print_Binary_Treer_655_Print_Binary_Tree _655_Print_Binary_Treea_655_Print_Binary_Tree _655_Print_Binary_Treeb_655_Print_Binary_Treei_655_Print_Binary_Treen_655_Print_Binary_Treea_655_Print_Binary_Treer_655_Print_Binary_Treey_655_Print_Binary_Tree _655_Print_Binary_Treet_655_Print_Binary_Treer_655_Print_Binary_Treee_655_Print_Binary_Treee_655_Print_Binary_Tree _655_Print_Binary_Treen_655_Print_Binary_Treeo_655_Print_Binary_Treed_655_Print_Binary_Treee_655_Print_Binary_Tree._655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree*_655_Print_Binary_Tree _655_Print_Binary_Treep_655_Print_Binary_Treeu_655_Print_Binary_Treeb_655_Print_Binary_Treel_655_Print_Binary_Treei_655_Print_Binary_Treec_655_Print_Binary_Tree _655_Print_Binary_Treec_655_Print_Binary_Treel_655_Print_Binary_Treea_655_Print_Binary_Trees_655_Print_Binary_Trees_655_Print_Binary_Tree _655_Print_Binary_TreeT_655_Print_Binary_Treer_655_Print_Binary_Treee_655_Print_Binary_Treee_655_Print_Binary_TreeN_655_Print_Binary_Treeo_655_Print_Binary_Treed_655_Print_Binary_Treee_655_Print_Binary_Tree _655_Print_Binary_Tree{_655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree*_655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Treei_655_Print_Binary_Treen_655_Print_Binary_Treet_655_Print_Binary_Tree _655_Print_Binary_Treev_655_Print_Binary_Treea_655_Print_Binary_Treel_655_Print_Binary_Tree;_655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree*_655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_TreeT_655_Print_Binary_Treer_655_Print_Binary_Treee_655_Print_Binary_Treee_655_Print_Binary_TreeN_655_Print_Binary_Treeo_655_Print_Binary_Treed_655_Print_Binary_Treee_655_Print_Binary_Tree _655_Print_Binary_Treel_655_Print_Binary_Treee_655_Print_Binary_Treef_655_Print_Binary_Treet_655_Print_Binary_Tree;_655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree*_655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_TreeT_655_Print_Binary_Treer_655_Print_Binary_Treee_655_Print_Binary_Treee_655_Print_Binary_TreeN_655_Print_Binary_Treeo_655_Print_Binary_Treed_655_Print_Binary_Treee_655_Print_Binary_Tree _655_Print_Binary_Treer_655_Print_Binary_Treei_655_Print_Binary_Treeg_655_Print_Binary_Treeh_655_Print_Binary_Treet_655_Print_Binary_Tree;_655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree*_655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_TreeT_655_Print_Binary_Treer_655_Print_Binary_Treee_655_Print_Binary_Treee_655_Print_Binary_TreeN_655_Print_Binary_Treeo_655_Print_Binary_Treed_655_Print_Binary_Treee_655_Print_Binary_Tree(_655_Print_Binary_Treei_655_Print_Binary_Treen_655_Print_Binary_Treet_655_Print_Binary_Tree _655_Print_Binary_Treex_655_Print_Binary_Tree)_655_Print_Binary_Tree _655_Print_Binary_Tree{_655_Print_Binary_Tree _655_Print_Binary_Treev_655_Print_Binary_Treea_655_Print_Binary_Treel_655_Print_Binary_Tree _655_Print_Binary_Tree=_655_Print_Binary_Tree _655_Print_Binary_Treex_655_Print_Binary_Tree;_655_Print_Binary_Tree _655_Print_Binary_Tree}_655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree*_655_Print_Binary_Tree _655_Print_Binary_Tree}_655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree*_655_Print_Binary_Tree/_655_Print_Binary_Tree
_655_Print_Binary_Treec_655_Print_Binary_Treel_655_Print_Binary_Treea_655_Print_Binary_Trees_655_Print_Binary_Trees_655_Print_Binary_Tree _655_Print_Binary_Tree__655_Print_Binary_Tree6_655_Print_Binary_Tree5_655_Print_Binary_Tree5_655_Print_Binary_Tree__655_Print_Binary_TreeP_655_Print_Binary_Treer_655_Print_Binary_Treei_655_Print_Binary_Treen_655_Print_Binary_Treet_655_Print_Binary_Tree__655_Print_Binary_TreeB_655_Print_Binary_Treei_655_Print_Binary_Treen_655_Print_Binary_Treea_655_Print_Binary_Treer_655_Print_Binary_Treey_655_Print_Binary_Tree__655_Print_Binary_TreeT_655_Print_Binary_Treer_655_Print_Binary_Treee_655_Print_Binary_Treee_655_Print_Binary_Tree _655_Print_Binary_Tree{_655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Treep_655_Print_Binary_Treeu_655_Print_Binary_Treeb_655_Print_Binary_Treel_655_Print_Binary_Treei_655_Print_Binary_Treec_655_Print_Binary_Tree _655_Print_Binary_TreeL_655_Print_Binary_Treei_655_Print_Binary_Trees_655_Print_Binary_Treet_655_Print_Binary_Tree<_655_Print_Binary_TreeL_655_Print_Binary_Treei_655_Print_Binary_Trees_655_Print_Binary_Treet_655_Print_Binary_Tree<_655_Print_Binary_TreeS_655_Print_Binary_Treet_655_Print_Binary_Treer_655_Print_Binary_Treei_655_Print_Binary_Treen_655_Print_Binary_Treeg_655_Print_Binary_Tree>_655_Print_Binary_Tree>_655_Print_Binary_Tree _655_Print_Binary_Treep_655_Print_Binary_Treer_655_Print_Binary_Treei_655_Print_Binary_Treen_655_Print_Binary_Treet_655_Print_Binary_TreeT_655_Print_Binary_Treer_655_Print_Binary_Treee_655_Print_Binary_Treee_655_Print_Binary_Tree(_655_Print_Binary_TreeT_655_Print_Binary_Treer_655_Print_Binary_Treee_655_Print_Binary_Treee_655_Print_Binary_TreeN_655_Print_Binary_Treeo_655_Print_Binary_Treed_655_Print_Binary_Treee_655_Print_Binary_Tree _655_Print_Binary_Treer_655_Print_Binary_Treeo_655_Print_Binary_Treeo_655_Print_Binary_Treet_655_Print_Binary_Tree)_655_Print_Binary_Tree _655_Print_Binary_Tree{_655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree
_655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree _655_Print_Binary_Tree}_655_Print_Binary_Tree
_655_Print_Binary_Tree}_655_Print_Binary_Tree