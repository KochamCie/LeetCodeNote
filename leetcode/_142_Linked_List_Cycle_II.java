package com.hama.leetcode;
/**
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed)&nbsp;in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.

&nbsp;

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.




Example 2:


Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.




Example 3:


Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.




&nbsp;

Follow up:
Can you solve it without using extra space?
**/
_142_Linked_List_Cycle_II/_142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IID_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_IIf_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIo_142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIf_142_Linked_List_Cycle_IIo_142_Linked_List_Cycle_IIr_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_IIg_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIy_142_Linked_List_Cycle_II-_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_IIk_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_IId_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_II._142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIc_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIa_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIL_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_IIN_142_Linked_List_Cycle_IIo_142_Linked_List_Cycle_IId_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II{_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIv_142_Linked_List_Cycle_IIa_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_II;_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIL_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_IIN_142_Linked_List_Cycle_IIo_142_Linked_List_Cycle_IId_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_IIx_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_II;_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIL_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_IIN_142_Linked_List_Cycle_IIo_142_Linked_List_Cycle_IId_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_II(_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIx_142_Linked_List_Cycle_II)_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II{_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIv_142_Linked_List_Cycle_IIa_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II=_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIx_142_Linked_List_Cycle_II;_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_IIx_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II=_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_IIu_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_II;_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II}_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II}_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II*_142_Linked_List_Cycle_II/_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_IIp_142_Linked_List_Cycle_IIu_142_Linked_List_Cycle_IIb_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIc_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIc_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIa_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II__142_Linked_List_Cycle_II1_142_Linked_List_Cycle_II4_142_Linked_List_Cycle_II2_142_Linked_List_Cycle_II__142_Linked_List_Cycle_IIL_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIn_142_Linked_List_Cycle_IIk_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_IId_142_Linked_List_Cycle_II__142_Linked_List_Cycle_IIL_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_II__142_Linked_List_Cycle_IIC_142_Linked_List_Cycle_IIy_142_Linked_List_Cycle_IIc_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_II__142_Linked_List_Cycle_III_142_Linked_List_Cycle_III_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II{_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIp_142_Linked_List_Cycle_IIu_142_Linked_List_Cycle_IIb_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIc_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIL_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_IIN_142_Linked_List_Cycle_IIo_142_Linked_List_Cycle_IId_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IId_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_IIc_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_IIC_142_Linked_List_Cycle_IIy_142_Linked_List_Cycle_IIc_142_Linked_List_Cycle_IIl_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_II(_142_Linked_List_Cycle_IIL_142_Linked_List_Cycle_IIi_142_Linked_List_Cycle_IIs_142_Linked_List_Cycle_IIt_142_Linked_List_Cycle_IIN_142_Linked_List_Cycle_IIo_142_Linked_List_Cycle_IId_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_II _142_Linked_List_Cycle_IIh_142_Linked_List_Cycle_IIe_142_Linked_List_Cycle_IIa_142_Linked_List_Cycle_IId_142_Linked_List_Cycle_II)_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II{_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II _142_Linked_List_Cycle_II}_142_Linked_List_Cycle_II_142_Linked_List_Cycle_II
_142_Linked_List_Cycle_II}_142_Linked_List_Cycle_II