package com.hama.leetcode;
/**
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example:


Input:&nbsp;[1,2,3,null,5,null,4]
Output:&nbsp;[1, 3, 4]
Explanation:

   1            &lt;---
 /   \
2     3         &lt;---
 \     \
  5     4       &lt;---
**/
_199_Binary_Tree_Right_Side_View/_199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_ViewD_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewf_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewn_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewn_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewf_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewa_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewb_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewn_199_Binary_Tree_Right_Side_Viewa_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewy_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewn_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewd_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_View._199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewp_199_Binary_Tree_Right_Side_Viewu_199_Binary_Tree_Right_Side_Viewb_199_Binary_Tree_Right_Side_Viewl_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewc_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewc_199_Binary_Tree_Right_Side_Viewl_199_Binary_Tree_Right_Side_Viewa_199_Binary_Tree_Right_Side_Views_199_Binary_Tree_Right_Side_Views_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_ViewT_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_ViewN_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewd_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View{_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewn_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewv_199_Binary_Tree_Right_Side_Viewa_199_Binary_Tree_Right_Side_Viewl_199_Binary_Tree_Right_Side_View;_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_ViewT_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_ViewN_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewd_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewl_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewf_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_View;_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_ViewT_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_ViewN_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewd_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewg_199_Binary_Tree_Right_Side_Viewh_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_View;_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_ViewT_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_ViewN_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewd_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_View(_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewn_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewx_199_Binary_Tree_Right_Side_View)_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View{_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewv_199_Binary_Tree_Right_Side_Viewa_199_Binary_Tree_Right_Side_Viewl_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View=_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewx_199_Binary_Tree_Right_Side_View;_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View}_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View}_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View*_199_Binary_Tree_Right_Side_View/_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_Viewc_199_Binary_Tree_Right_Side_Viewl_199_Binary_Tree_Right_Side_Viewa_199_Binary_Tree_Right_Side_Views_199_Binary_Tree_Right_Side_Views_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View__199_Binary_Tree_Right_Side_View1_199_Binary_Tree_Right_Side_View9_199_Binary_Tree_Right_Side_View9_199_Binary_Tree_Right_Side_View__199_Binary_Tree_Right_Side_ViewB_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewn_199_Binary_Tree_Right_Side_Viewa_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewy_199_Binary_Tree_Right_Side_View__199_Binary_Tree_Right_Side_ViewT_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_View__199_Binary_Tree_Right_Side_ViewR_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewg_199_Binary_Tree_Right_Side_Viewh_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_View__199_Binary_Tree_Right_Side_ViewS_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewd_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_View__199_Binary_Tree_Right_Side_ViewV_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Vieww_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View{_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewp_199_Binary_Tree_Right_Side_Viewu_199_Binary_Tree_Right_Side_Viewb_199_Binary_Tree_Right_Side_Viewl_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewc_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_ViewL_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Views_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_View<_199_Binary_Tree_Right_Side_ViewI_199_Binary_Tree_Right_Side_Viewn_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewg_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_View>_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewg_199_Binary_Tree_Right_Side_Viewh_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_ViewS_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewd_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_ViewV_199_Binary_Tree_Right_Side_Viewi_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Vieww_199_Binary_Tree_Right_Side_View(_199_Binary_Tree_Right_Side_ViewT_199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_ViewN_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewd_199_Binary_Tree_Right_Side_Viewe_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_Viewr_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewo_199_Binary_Tree_Right_Side_Viewt_199_Binary_Tree_Right_Side_View)_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View{_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View _199_Binary_Tree_Right_Side_View}_199_Binary_Tree_Right_Side_View_199_Binary_Tree_Right_Side_View
_199_Binary_Tree_Right_Side_View}_199_Binary_Tree_Right_Side_View