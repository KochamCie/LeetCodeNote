package com.hama.leetcode;
/**
Given a binary tree, we install cameras on the nodes of the tree.&nbsp;

Each camera at&nbsp;a node can monitor its parent, itself, and its immediate children.

Calculate the minimum number of cameras needed to monitor all nodes of the tree.

&nbsp;

Example 1:



Input: [0,0,null,0,0]
Output: 1
Explanation: One camera is enough to monitor all nodes if placed as shown.



Example 2:


Input: [0,0,null,0,null,0,null,null,0]
Output: 2
Explanation: At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.



Note:


	The number of nodes in the given tree will be in the range&nbsp;[1, 1000].
	Every node has value 0.



**/
_1008_Binary_Tree_Cameras/_1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras _1008_Binary_Tree_CamerasD_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerasf_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasn_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerast_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerasn_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasf_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasa_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasb_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasn_1008_Binary_Tree_Camerasa_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerasy_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerast_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerase_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasn_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerasd_1008_Binary_Tree_Camerase_1008_Binary_Tree_Cameras._1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasp_1008_Binary_Tree_Camerasu_1008_Binary_Tree_Camerasb_1008_Binary_Tree_Camerasl_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasc_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasc_1008_Binary_Tree_Camerasl_1008_Binary_Tree_Camerasa_1008_Binary_Tree_Camerass_1008_Binary_Tree_Camerass_1008_Binary_Tree_Cameras _1008_Binary_Tree_CamerasT_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerase_1008_Binary_Tree_CamerasN_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerasd_1008_Binary_Tree_Camerase_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras{_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasn_1008_Binary_Tree_Camerast_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasv_1008_Binary_Tree_Camerasa_1008_Binary_Tree_Camerasl_1008_Binary_Tree_Cameras;_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_CamerasT_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerase_1008_Binary_Tree_CamerasN_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerasd_1008_Binary_Tree_Camerase_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasl_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerasf_1008_Binary_Tree_Camerast_1008_Binary_Tree_Cameras;_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_CamerasT_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerase_1008_Binary_Tree_CamerasN_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerasd_1008_Binary_Tree_Camerase_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasg_1008_Binary_Tree_Camerash_1008_Binary_Tree_Camerast_1008_Binary_Tree_Cameras;_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_CamerasT_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerase_1008_Binary_Tree_CamerasN_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerasd_1008_Binary_Tree_Camerase_1008_Binary_Tree_Cameras(_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasn_1008_Binary_Tree_Camerast_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasx_1008_Binary_Tree_Cameras)_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras{_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasv_1008_Binary_Tree_Camerasa_1008_Binary_Tree_Camerasl_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras=_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasx_1008_Binary_Tree_Cameras;_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras}_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras}_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras*_1008_Binary_Tree_Cameras/_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Camerasc_1008_Binary_Tree_Camerasl_1008_Binary_Tree_Camerasa_1008_Binary_Tree_Camerass_1008_Binary_Tree_Camerass_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras__1008_Binary_Tree_Cameras1_1008_Binary_Tree_Cameras0_1008_Binary_Tree_Cameras0_1008_Binary_Tree_Cameras8_1008_Binary_Tree_Cameras__1008_Binary_Tree_CamerasB_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasn_1008_Binary_Tree_Camerasa_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerasy_1008_Binary_Tree_Cameras__1008_Binary_Tree_CamerasT_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerase_1008_Binary_Tree_Cameras__1008_Binary_Tree_CamerasC_1008_Binary_Tree_Camerasa_1008_Binary_Tree_Camerasm_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerasa_1008_Binary_Tree_Camerass_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras{_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasp_1008_Binary_Tree_Camerasu_1008_Binary_Tree_Camerasb_1008_Binary_Tree_Camerasl_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasc_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasn_1008_Binary_Tree_Camerast_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasm_1008_Binary_Tree_Camerasi_1008_Binary_Tree_Camerasn_1008_Binary_Tree_CamerasC_1008_Binary_Tree_Camerasa_1008_Binary_Tree_Camerasm_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerasa_1008_Binary_Tree_CamerasC_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerasv_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Cameras(_1008_Binary_Tree_CamerasT_1008_Binary_Tree_Camerasr_1008_Binary_Tree_Camerase_1008_Binary_Tree_Camerase_1008_Binary_Tree_CamerasN_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerasd_1008_Binary_Tree_Camerase_1008_Binary_Tree_Cameras _1008_Binary_Tree_Camerasr_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Cameraso_1008_Binary_Tree_Camerast_1008_Binary_Tree_Cameras)_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras{_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras _1008_Binary_Tree_Cameras}_1008_Binary_Tree_Cameras
_1008_Binary_Tree_Cameras}_1008_Binary_Tree_Cameras