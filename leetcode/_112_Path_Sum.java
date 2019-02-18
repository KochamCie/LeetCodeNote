package com.hama.leetcode;
/**
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note:&nbsp;A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,


      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1


return true, as there exist a root-to-leaf path 5-&gt;4-&gt;11-&gt;2 which sum is 22.
**/
_112_Path_Sum/_112_Path_Sum*_112_Path_Sum*_112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum*_112_Path_Sum _112_Path_SumD_112_Path_Sume_112_Path_Sumf_112_Path_Sumi_112_Path_Sumn_112_Path_Sumi_112_Path_Sumt_112_Path_Sumi_112_Path_Sumo_112_Path_Sumn_112_Path_Sum _112_Path_Sumf_112_Path_Sumo_112_Path_Sumr_112_Path_Sum _112_Path_Suma_112_Path_Sum _112_Path_Sumb_112_Path_Sumi_112_Path_Sumn_112_Path_Suma_112_Path_Sumr_112_Path_Sumy_112_Path_Sum _112_Path_Sumt_112_Path_Sumr_112_Path_Sume_112_Path_Sume_112_Path_Sum _112_Path_Sumn_112_Path_Sumo_112_Path_Sumd_112_Path_Sume_112_Path_Sum._112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum*_112_Path_Sum _112_Path_Sump_112_Path_Sumu_112_Path_Sumb_112_Path_Suml_112_Path_Sumi_112_Path_Sumc_112_Path_Sum _112_Path_Sumc_112_Path_Suml_112_Path_Suma_112_Path_Sums_112_Path_Sums_112_Path_Sum _112_Path_SumT_112_Path_Sumr_112_Path_Sume_112_Path_Sume_112_Path_SumN_112_Path_Sumo_112_Path_Sumd_112_Path_Sume_112_Path_Sum _112_Path_Sum{_112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum*_112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sumi_112_Path_Sumn_112_Path_Sumt_112_Path_Sum _112_Path_Sumv_112_Path_Suma_112_Path_Suml_112_Path_Sum;_112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum*_112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_SumT_112_Path_Sumr_112_Path_Sume_112_Path_Sume_112_Path_SumN_112_Path_Sumo_112_Path_Sumd_112_Path_Sume_112_Path_Sum _112_Path_Suml_112_Path_Sume_112_Path_Sumf_112_Path_Sumt_112_Path_Sum;_112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum*_112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_SumT_112_Path_Sumr_112_Path_Sume_112_Path_Sume_112_Path_SumN_112_Path_Sumo_112_Path_Sumd_112_Path_Sume_112_Path_Sum _112_Path_Sumr_112_Path_Sumi_112_Path_Sumg_112_Path_Sumh_112_Path_Sumt_112_Path_Sum;_112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum*_112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_SumT_112_Path_Sumr_112_Path_Sume_112_Path_Sume_112_Path_SumN_112_Path_Sumo_112_Path_Sumd_112_Path_Sume_112_Path_Sum(_112_Path_Sumi_112_Path_Sumn_112_Path_Sumt_112_Path_Sum _112_Path_Sumx_112_Path_Sum)_112_Path_Sum _112_Path_Sum{_112_Path_Sum _112_Path_Sumv_112_Path_Suma_112_Path_Suml_112_Path_Sum _112_Path_Sum=_112_Path_Sum _112_Path_Sumx_112_Path_Sum;_112_Path_Sum _112_Path_Sum}_112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum*_112_Path_Sum _112_Path_Sum}_112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum*_112_Path_Sum/_112_Path_Sum_112_Path_Sum
_112_Path_Sumc_112_Path_Suml_112_Path_Suma_112_Path_Sums_112_Path_Sums_112_Path_Sum _112_Path_Sum__112_Path_Sum1_112_Path_Sum1_112_Path_Sum2_112_Path_Sum__112_Path_SumP_112_Path_Suma_112_Path_Sumt_112_Path_Sumh_112_Path_Sum__112_Path_SumS_112_Path_Sumu_112_Path_Summ_112_Path_Sum _112_Path_Sum{_112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sump_112_Path_Sumu_112_Path_Sumb_112_Path_Suml_112_Path_Sumi_112_Path_Sumc_112_Path_Sum _112_Path_Sumb_112_Path_Sumo_112_Path_Sumo_112_Path_Suml_112_Path_Sume_112_Path_Suma_112_Path_Sumn_112_Path_Sum _112_Path_Sumh_112_Path_Suma_112_Path_Sums_112_Path_SumP_112_Path_Suma_112_Path_Sumt_112_Path_Sumh_112_Path_SumS_112_Path_Sumu_112_Path_Summ_112_Path_Sum(_112_Path_SumT_112_Path_Sumr_112_Path_Sume_112_Path_Sume_112_Path_SumN_112_Path_Sumo_112_Path_Sumd_112_Path_Sume_112_Path_Sum _112_Path_Sumr_112_Path_Sumo_112_Path_Sumo_112_Path_Sumt_112_Path_Sum,_112_Path_Sum _112_Path_Sumi_112_Path_Sumn_112_Path_Sumt_112_Path_Sum _112_Path_Sums_112_Path_Sumu_112_Path_Summ_112_Path_Sum)_112_Path_Sum _112_Path_Sum{_112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum_112_Path_Sum
_112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum _112_Path_Sum}_112_Path_Sum_112_Path_Sum
_112_Path_Sum}_112_Path_Sum