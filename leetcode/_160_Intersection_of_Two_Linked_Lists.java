package com.hama.leetcode;
/**
Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:


begin to intersect at node c1.

&nbsp;

Example 1:



Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node&#39;s value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.

&nbsp;

Example 2:



Input: intersectVal&nbsp;= 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Reference of the node with value = 2
Input Explanation:&nbsp;The intersected node&#39;s value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [0,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.


&nbsp;

Example 3:



Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: null
Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.


&nbsp;

Notes:


	If the two linked lists have no intersection at all, return null.
	The linked lists must retain their original structure after the function returns.
	You may assume there are no cycles anywhere in the entire linked structure.
	Your code should preferably run in O(n) time and use only O(1) memory.

**/
_160_Intersection_of_Two_Linked_Lists/_160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_ListsD_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsf_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsf_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsr_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listsg_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Listsy_160_Intersection_of_Two_Linked_Lists-_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listsk_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Lists._160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsp_160_Intersection_of_Two_Linked_Listsu_160_Intersection_of_Two_Linked_Listsb_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listsc_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsc_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Listsa_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_ListsL_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_ListsN_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists{_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsv_160_Intersection_of_Two_Linked_Listsa_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Lists;_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_ListsL_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_ListsN_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsx_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Lists;_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_ListsL_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_ListsN_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Lists(_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsx_160_Intersection_of_Two_Linked_Lists)_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists{_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsv_160_Intersection_of_Two_Linked_Listsa_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists=_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsx_160_Intersection_of_Two_Linked_Lists;_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsx_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists=_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listsu_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Lists;_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists}_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists}_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists*_160_Intersection_of_Two_Linked_Lists/_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Listsp_160_Intersection_of_Two_Linked_Listsu_160_Intersection_of_Two_Linked_Listsb_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listsc_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsc_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Listsa_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists__160_Intersection_of_Two_Linked_Lists1_160_Intersection_of_Two_Linked_Lists6_160_Intersection_of_Two_Linked_Lists0_160_Intersection_of_Two_Linked_Lists__160_Intersection_of_Two_Linked_ListsI_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsr_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsc_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Lists__160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsf_160_Intersection_of_Two_Linked_Lists__160_Intersection_of_Two_Linked_ListsT_160_Intersection_of_Two_Linked_Listsw_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Lists__160_Intersection_of_Two_Linked_ListsL_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listsk_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_Lists__160_Intersection_of_Two_Linked_ListsL_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists{_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsp_160_Intersection_of_Two_Linked_Listsu_160_Intersection_of_Two_Linked_Listsb_160_Intersection_of_Two_Linked_Listsl_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listsc_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_ListsL_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_ListsN_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsg_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_ListsI_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsr_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsc_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsn_160_Intersection_of_Two_Linked_ListsN_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Lists(_160_Intersection_of_Two_Linked_ListsL_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_ListsN_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsh_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsa_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_ListsA_160_Intersection_of_Two_Linked_Lists,_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_ListsL_160_Intersection_of_Two_Linked_Listsi_160_Intersection_of_Two_Linked_Listss_160_Intersection_of_Two_Linked_Listst_160_Intersection_of_Two_Linked_ListsN_160_Intersection_of_Two_Linked_Listso_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Listsh_160_Intersection_of_Two_Linked_Listse_160_Intersection_of_Two_Linked_Listsa_160_Intersection_of_Two_Linked_Listsd_160_Intersection_of_Two_Linked_ListsB_160_Intersection_of_Two_Linked_Lists)_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists{_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists _160_Intersection_of_Two_Linked_Lists}_160_Intersection_of_Two_Linked_Lists_160_Intersection_of_Two_Linked_Lists
_160_Intersection_of_Two_Linked_Lists}_160_Intersection_of_Two_Linked_Lists