package com.hama.leetcode;
/**
We are given&nbsp;head,&nbsp;the head node of a linked list containing&nbsp;unique integer values.

We are also given the list&nbsp;G, a subset of the values in the linked list.

Return the number of connected components in G, where two values are connected if they appear consecutively in the linked list.

Example 1:


Input: 
head: 0-&gt;1-&gt;2-&gt;3
G = [0, 1, 3]
Output: 2
Explanation: 
0 and 1 are connected, so [0, 1] and [3] are the two connected components.


Example 2:


Input: 
head: 0-&gt;1-&gt;2-&gt;3-&gt;4
G = [0, 3, 1, 4]
Output: 2
Explanation: 
0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.


Note: 


	If&nbsp;N&nbsp;is the&nbsp;length of the linked list given by&nbsp;head,&nbsp;1 &lt;= N &lt;= 10000.
	The value of each node in the linked list will be in the range [0, N - 1].
	1 &lt;= G.length &lt;= 10000.
	G is a subset of all values in the linked list.

**/
_835_Linked_List_Components/_835_Linked_List_Components*_835_Linked_List_Components*_835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components*_835_Linked_List_Components _835_Linked_List_ComponentsD_835_Linked_List_Componentse_835_Linked_List_Componentsf_835_Linked_List_Componentsi_835_Linked_List_Componentsn_835_Linked_List_Componentsi_835_Linked_List_Componentst_835_Linked_List_Componentsi_835_Linked_List_Componentso_835_Linked_List_Componentsn_835_Linked_List_Components _835_Linked_List_Componentsf_835_Linked_List_Componentso_835_Linked_List_Componentsr_835_Linked_List_Components _835_Linked_List_Componentss_835_Linked_List_Componentsi_835_Linked_List_Componentsn_835_Linked_List_Componentsg_835_Linked_List_Componentsl_835_Linked_List_Componentsy_835_Linked_List_Components-_835_Linked_List_Componentsl_835_Linked_List_Componentsi_835_Linked_List_Componentsn_835_Linked_List_Componentsk_835_Linked_List_Componentse_835_Linked_List_Componentsd_835_Linked_List_Components _835_Linked_List_Componentsl_835_Linked_List_Componentsi_835_Linked_List_Componentss_835_Linked_List_Componentst_835_Linked_List_Components._835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components*_835_Linked_List_Components _835_Linked_List_Componentsp_835_Linked_List_Componentsu_835_Linked_List_Componentsb_835_Linked_List_Componentsl_835_Linked_List_Componentsi_835_Linked_List_Componentsc_835_Linked_List_Components _835_Linked_List_Componentsc_835_Linked_List_Componentsl_835_Linked_List_Componentsa_835_Linked_List_Componentss_835_Linked_List_Componentss_835_Linked_List_Components _835_Linked_List_ComponentsL_835_Linked_List_Componentsi_835_Linked_List_Componentss_835_Linked_List_Componentst_835_Linked_List_ComponentsN_835_Linked_List_Componentso_835_Linked_List_Componentsd_835_Linked_List_Componentse_835_Linked_List_Components _835_Linked_List_Components{_835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components*_835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Componentsi_835_Linked_List_Componentsn_835_Linked_List_Componentst_835_Linked_List_Components _835_Linked_List_Componentsv_835_Linked_List_Componentsa_835_Linked_List_Componentsl_835_Linked_List_Components;_835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components*_835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_ComponentsL_835_Linked_List_Componentsi_835_Linked_List_Componentss_835_Linked_List_Componentst_835_Linked_List_ComponentsN_835_Linked_List_Componentso_835_Linked_List_Componentsd_835_Linked_List_Componentse_835_Linked_List_Components _835_Linked_List_Componentsn_835_Linked_List_Componentse_835_Linked_List_Componentsx_835_Linked_List_Componentst_835_Linked_List_Components;_835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components*_835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_ComponentsL_835_Linked_List_Componentsi_835_Linked_List_Componentss_835_Linked_List_Componentst_835_Linked_List_ComponentsN_835_Linked_List_Componentso_835_Linked_List_Componentsd_835_Linked_List_Componentse_835_Linked_List_Components(_835_Linked_List_Componentsi_835_Linked_List_Componentsn_835_Linked_List_Componentst_835_Linked_List_Components _835_Linked_List_Componentsx_835_Linked_List_Components)_835_Linked_List_Components _835_Linked_List_Components{_835_Linked_List_Components _835_Linked_List_Componentsv_835_Linked_List_Componentsa_835_Linked_List_Componentsl_835_Linked_List_Components _835_Linked_List_Components=_835_Linked_List_Components _835_Linked_List_Componentsx_835_Linked_List_Components;_835_Linked_List_Components _835_Linked_List_Components}_835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components*_835_Linked_List_Components _835_Linked_List_Components}_835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components*_835_Linked_List_Components/_835_Linked_List_Components
_835_Linked_List_Componentsc_835_Linked_List_Componentsl_835_Linked_List_Componentsa_835_Linked_List_Componentss_835_Linked_List_Componentss_835_Linked_List_Components _835_Linked_List_Components__835_Linked_List_Components8_835_Linked_List_Components3_835_Linked_List_Components5_835_Linked_List_Components__835_Linked_List_ComponentsL_835_Linked_List_Componentsi_835_Linked_List_Componentsn_835_Linked_List_Componentsk_835_Linked_List_Componentse_835_Linked_List_Componentsd_835_Linked_List_Components__835_Linked_List_ComponentsL_835_Linked_List_Componentsi_835_Linked_List_Componentss_835_Linked_List_Componentst_835_Linked_List_Components__835_Linked_List_ComponentsC_835_Linked_List_Componentso_835_Linked_List_Componentsm_835_Linked_List_Componentsp_835_Linked_List_Componentso_835_Linked_List_Componentsn_835_Linked_List_Componentse_835_Linked_List_Componentsn_835_Linked_List_Componentst_835_Linked_List_Componentss_835_Linked_List_Components _835_Linked_List_Components{_835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Componentsp_835_Linked_List_Componentsu_835_Linked_List_Componentsb_835_Linked_List_Componentsl_835_Linked_List_Componentsi_835_Linked_List_Componentsc_835_Linked_List_Components _835_Linked_List_Componentsi_835_Linked_List_Componentsn_835_Linked_List_Componentst_835_Linked_List_Components _835_Linked_List_Componentsn_835_Linked_List_Componentsu_835_Linked_List_Componentsm_835_Linked_List_ComponentsC_835_Linked_List_Componentso_835_Linked_List_Componentsm_835_Linked_List_Componentsp_835_Linked_List_Componentso_835_Linked_List_Componentsn_835_Linked_List_Componentse_835_Linked_List_Componentsn_835_Linked_List_Componentst_835_Linked_List_Componentss_835_Linked_List_Components(_835_Linked_List_ComponentsL_835_Linked_List_Componentsi_835_Linked_List_Componentss_835_Linked_List_Componentst_835_Linked_List_ComponentsN_835_Linked_List_Componentso_835_Linked_List_Componentsd_835_Linked_List_Componentse_835_Linked_List_Components _835_Linked_List_Componentsh_835_Linked_List_Componentse_835_Linked_List_Componentsa_835_Linked_List_Componentsd_835_Linked_List_Components,_835_Linked_List_Components _835_Linked_List_Componentsi_835_Linked_List_Componentsn_835_Linked_List_Componentst_835_Linked_List_Components[_835_Linked_List_Components]_835_Linked_List_Components _835_Linked_List_ComponentsG_835_Linked_List_Components)_835_Linked_List_Components _835_Linked_List_Components{_835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components
_835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components _835_Linked_List_Components}_835_Linked_List_Components
_835_Linked_List_Components}_835_Linked_List_Components