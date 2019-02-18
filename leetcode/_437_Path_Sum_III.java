package com.hama.leetcode;
/**
You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards
(traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

Example:

root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11

**/
_437_Path_Sum_III/_437_Path_Sum_III*_437_Path_Sum_III*_437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III*_437_Path_Sum_III _437_Path_Sum_IIID_437_Path_Sum_IIIe_437_Path_Sum_IIIf_437_Path_Sum_IIIi_437_Path_Sum_IIIn_437_Path_Sum_IIIi_437_Path_Sum_IIIt_437_Path_Sum_IIIi_437_Path_Sum_IIIo_437_Path_Sum_IIIn_437_Path_Sum_III _437_Path_Sum_IIIf_437_Path_Sum_IIIo_437_Path_Sum_IIIr_437_Path_Sum_III _437_Path_Sum_IIIa_437_Path_Sum_III _437_Path_Sum_IIIb_437_Path_Sum_IIIi_437_Path_Sum_IIIn_437_Path_Sum_IIIa_437_Path_Sum_IIIr_437_Path_Sum_IIIy_437_Path_Sum_III _437_Path_Sum_IIIt_437_Path_Sum_IIIr_437_Path_Sum_IIIe_437_Path_Sum_IIIe_437_Path_Sum_III _437_Path_Sum_IIIn_437_Path_Sum_IIIo_437_Path_Sum_IIId_437_Path_Sum_IIIe_437_Path_Sum_III._437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III*_437_Path_Sum_III _437_Path_Sum_IIIp_437_Path_Sum_IIIu_437_Path_Sum_IIIb_437_Path_Sum_IIIl_437_Path_Sum_IIIi_437_Path_Sum_IIIc_437_Path_Sum_III _437_Path_Sum_IIIc_437_Path_Sum_IIIl_437_Path_Sum_IIIa_437_Path_Sum_IIIs_437_Path_Sum_IIIs_437_Path_Sum_III _437_Path_Sum_IIIT_437_Path_Sum_IIIr_437_Path_Sum_IIIe_437_Path_Sum_IIIe_437_Path_Sum_IIIN_437_Path_Sum_IIIo_437_Path_Sum_IIId_437_Path_Sum_IIIe_437_Path_Sum_III _437_Path_Sum_III{_437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III*_437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_IIIi_437_Path_Sum_IIIn_437_Path_Sum_IIIt_437_Path_Sum_III _437_Path_Sum_IIIv_437_Path_Sum_IIIa_437_Path_Sum_IIIl_437_Path_Sum_III;_437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III*_437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_IIIT_437_Path_Sum_IIIr_437_Path_Sum_IIIe_437_Path_Sum_IIIe_437_Path_Sum_IIIN_437_Path_Sum_IIIo_437_Path_Sum_IIId_437_Path_Sum_IIIe_437_Path_Sum_III _437_Path_Sum_IIIl_437_Path_Sum_IIIe_437_Path_Sum_IIIf_437_Path_Sum_IIIt_437_Path_Sum_III;_437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III*_437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_IIIT_437_Path_Sum_IIIr_437_Path_Sum_IIIe_437_Path_Sum_IIIe_437_Path_Sum_IIIN_437_Path_Sum_IIIo_437_Path_Sum_IIId_437_Path_Sum_IIIe_437_Path_Sum_III _437_Path_Sum_IIIr_437_Path_Sum_IIIi_437_Path_Sum_IIIg_437_Path_Sum_IIIh_437_Path_Sum_IIIt_437_Path_Sum_III;_437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III*_437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_IIIT_437_Path_Sum_IIIr_437_Path_Sum_IIIe_437_Path_Sum_IIIe_437_Path_Sum_IIIN_437_Path_Sum_IIIo_437_Path_Sum_IIId_437_Path_Sum_IIIe_437_Path_Sum_III(_437_Path_Sum_IIIi_437_Path_Sum_IIIn_437_Path_Sum_IIIt_437_Path_Sum_III _437_Path_Sum_IIIx_437_Path_Sum_III)_437_Path_Sum_III _437_Path_Sum_III{_437_Path_Sum_III _437_Path_Sum_IIIv_437_Path_Sum_IIIa_437_Path_Sum_IIIl_437_Path_Sum_III _437_Path_Sum_III=_437_Path_Sum_III _437_Path_Sum_IIIx_437_Path_Sum_III;_437_Path_Sum_III _437_Path_Sum_III}_437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III*_437_Path_Sum_III _437_Path_Sum_III}_437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III*_437_Path_Sum_III/_437_Path_Sum_III
_437_Path_Sum_IIIc_437_Path_Sum_IIIl_437_Path_Sum_IIIa_437_Path_Sum_IIIs_437_Path_Sum_IIIs_437_Path_Sum_III _437_Path_Sum_III__437_Path_Sum_III4_437_Path_Sum_III3_437_Path_Sum_III7_437_Path_Sum_III__437_Path_Sum_IIIP_437_Path_Sum_IIIa_437_Path_Sum_IIIt_437_Path_Sum_IIIh_437_Path_Sum_III__437_Path_Sum_IIIS_437_Path_Sum_IIIu_437_Path_Sum_IIIm_437_Path_Sum_III__437_Path_Sum_IIII_437_Path_Sum_IIII_437_Path_Sum_IIII_437_Path_Sum_III _437_Path_Sum_III{_437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_IIIp_437_Path_Sum_IIIu_437_Path_Sum_IIIb_437_Path_Sum_IIIl_437_Path_Sum_IIIi_437_Path_Sum_IIIc_437_Path_Sum_III _437_Path_Sum_IIIi_437_Path_Sum_IIIn_437_Path_Sum_IIIt_437_Path_Sum_III _437_Path_Sum_IIIp_437_Path_Sum_IIIa_437_Path_Sum_IIIt_437_Path_Sum_IIIh_437_Path_Sum_IIIS_437_Path_Sum_IIIu_437_Path_Sum_IIIm_437_Path_Sum_III(_437_Path_Sum_IIIT_437_Path_Sum_IIIr_437_Path_Sum_IIIe_437_Path_Sum_IIIe_437_Path_Sum_IIIN_437_Path_Sum_IIIo_437_Path_Sum_IIId_437_Path_Sum_IIIe_437_Path_Sum_III _437_Path_Sum_IIIr_437_Path_Sum_IIIo_437_Path_Sum_IIIo_437_Path_Sum_IIIt_437_Path_Sum_III,_437_Path_Sum_III _437_Path_Sum_IIIi_437_Path_Sum_IIIn_437_Path_Sum_IIIt_437_Path_Sum_III _437_Path_Sum_IIIs_437_Path_Sum_IIIu_437_Path_Sum_IIIm_437_Path_Sum_III)_437_Path_Sum_III _437_Path_Sum_III{_437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III
_437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III _437_Path_Sum_III}_437_Path_Sum_III
_437_Path_Sum_III}_437_Path_Sum_III