package com.hama.leetcode;
/**
There are some trees, where each tree is represented by (x,y) coordinate in a two-dimensional garden. Your job is to fence the entire garden using the minimum length of rope as it is expensive. The garden is well fenced only if all the trees are enclosed. Your task is to help find the coordinates of trees which are exactly located on the fence perimeter.

&nbsp;

Example 1:


Input: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
Output: [[1,1],[2,0],[4,2],[3,3],[2,4]]
Explanation:



Example 2:


Input: [[1,2],[2,2],[4,2]]
Output: [[1,2],[2,2],[4,2]]
Explanation:

Even you only have trees in a line, you need to use rope to enclose them. 


&nbsp;

Note:


	All trees should be enclosed together. You cannot cut the rope to enclose trees that will separate them in more than one group.
	All input integers will range from 0 to 100.
	The garden has at least one tree.
	All coordinates are distinct.
	Input points have NO order. No order required for output.

**/
_587_Erect_the_Fence/_587_Erect_the_Fence*_587_Erect_the_Fence*_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence*_587_Erect_the_Fence _587_Erect_the_FenceD_587_Erect_the_Fencee_587_Erect_the_Fencef_587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencei_587_Erect_the_Fencet_587_Erect_the_Fencei_587_Erect_the_Fenceo_587_Erect_the_Fencen_587_Erect_the_Fence _587_Erect_the_Fencef_587_Erect_the_Fenceo_587_Erect_the_Fencer_587_Erect_the_Fence _587_Erect_the_Fencea_587_Erect_the_Fence _587_Erect_the_Fencep_587_Erect_the_Fenceo_587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence._587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence*_587_Erect_the_Fence _587_Erect_the_Fencec_587_Erect_the_Fencel_587_Erect_the_Fencea_587_Erect_the_Fences_587_Erect_the_Fences_587_Erect_the_Fence _587_Erect_the_FenceP_587_Erect_the_Fenceo_587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence _587_Erect_the_Fence{_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence*_587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence _587_Erect_the_Fencex_587_Erect_the_Fence;_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence*_587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence _587_Erect_the_Fencey_587_Erect_the_Fence;_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence*_587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_FenceP_587_Erect_the_Fenceo_587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence(_587_Erect_the_Fence)_587_Erect_the_Fence _587_Erect_the_Fence{_587_Erect_the_Fence _587_Erect_the_Fencex_587_Erect_the_Fence _587_Erect_the_Fence=_587_Erect_the_Fence _587_Erect_the_Fence0_587_Erect_the_Fence;_587_Erect_the_Fence _587_Erect_the_Fencey_587_Erect_the_Fence _587_Erect_the_Fence=_587_Erect_the_Fence _587_Erect_the_Fence0_587_Erect_the_Fence;_587_Erect_the_Fence _587_Erect_the_Fence}_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence*_587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_FenceP_587_Erect_the_Fenceo_587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence(_587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence _587_Erect_the_Fencea_587_Erect_the_Fence,_587_Erect_the_Fence _587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence _587_Erect_the_Fenceb_587_Erect_the_Fence)_587_Erect_the_Fence _587_Erect_the_Fence{_587_Erect_the_Fence _587_Erect_the_Fencex_587_Erect_the_Fence _587_Erect_the_Fence=_587_Erect_the_Fence _587_Erect_the_Fencea_587_Erect_the_Fence;_587_Erect_the_Fence _587_Erect_the_Fencey_587_Erect_the_Fence _587_Erect_the_Fence=_587_Erect_the_Fence _587_Erect_the_Fenceb_587_Erect_the_Fence;_587_Erect_the_Fence _587_Erect_the_Fence}_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence*_587_Erect_the_Fence _587_Erect_the_Fence}_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence*_587_Erect_the_Fence/_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fencec_587_Erect_the_Fencel_587_Erect_the_Fencea_587_Erect_the_Fences_587_Erect_the_Fences_587_Erect_the_Fence _587_Erect_the_Fence__587_Erect_the_Fence5_587_Erect_the_Fence8_587_Erect_the_Fence7_587_Erect_the_Fence__587_Erect_the_FenceE_587_Erect_the_Fencer_587_Erect_the_Fencee_587_Erect_the_Fencec_587_Erect_the_Fencet_587_Erect_the_Fence__587_Erect_the_Fencet_587_Erect_the_Fenceh_587_Erect_the_Fencee_587_Erect_the_Fence__587_Erect_the_FenceF_587_Erect_the_Fencee_587_Erect_the_Fencen_587_Erect_the_Fencec_587_Erect_the_Fencee_587_Erect_the_Fence _587_Erect_the_Fence{_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fencep_587_Erect_the_Fenceu_587_Erect_the_Fenceb_587_Erect_the_Fencel_587_Erect_the_Fencei_587_Erect_the_Fencec_587_Erect_the_Fence _587_Erect_the_FenceL_587_Erect_the_Fencei_587_Erect_the_Fences_587_Erect_the_Fencet_587_Erect_the_Fence<_587_Erect_the_FenceP_587_Erect_the_Fenceo_587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence>_587_Erect_the_Fence _587_Erect_the_Fenceo_587_Erect_the_Fenceu_587_Erect_the_Fencet_587_Erect_the_Fencee_587_Erect_the_Fencer_587_Erect_the_FenceT_587_Erect_the_Fencer_587_Erect_the_Fencee_587_Erect_the_Fencee_587_Erect_the_Fences_587_Erect_the_Fence(_587_Erect_the_FenceP_587_Erect_the_Fenceo_587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fence[_587_Erect_the_Fence]_587_Erect_the_Fence _587_Erect_the_Fencep_587_Erect_the_Fenceo_587_Erect_the_Fencei_587_Erect_the_Fencen_587_Erect_the_Fencet_587_Erect_the_Fences_587_Erect_the_Fence)_587_Erect_the_Fence _587_Erect_the_Fence{_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence _587_Erect_the_Fence}_587_Erect_the_Fence_587_Erect_the_Fence
_587_Erect_the_Fence}_587_Erect_the_Fence