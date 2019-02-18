package com.hama.leetcode;
/**
Design a class to find&nbsp;the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Your&nbsp;KthLargest&nbsp;class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from&nbsp;the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.

Example:


int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);&nbsp; &nbsp;// returns 4
kthLargest.add(5);&nbsp; &nbsp;// returns 5
kthLargest.add(10);&nbsp; // returns 5
kthLargest.add(9);&nbsp; &nbsp;// returns 8
kthLargest.add(4);&nbsp; &nbsp;// returns 8


Note: 
You may assume that&nbsp;nums&#39; length&nbsp;&ge;&nbsp;k-1&nbsp;and k &ge;&nbsp;1.
**/
class _789_Kth_Largest_Element_in_a_Stream {

    public _789_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        
    }
    
    public int add(int val) {
        
    }
}

/**
 * Your _789_Kth_Largest_Element_in_a_Stream object will be instantiated and called as such:
 * _789_Kth_Largest_Element_in_a_Stream obj = new _789_Kth_Largest_Element_in_a_Stream(k, nums);
 * int param_1 = obj.add(val);
 */