package com.hama.leetcode;
/**
Design your&nbsp;implementation of the linked list. You can choose to use the singly linked list or the doubly linked list. A node in a singly&nbsp;linked list should have two attributes: val&nbsp;and next. val is the value of the current node, and next&nbsp;is&nbsp;a&nbsp;pointer/reference to the next node. If you want to use the doubly linked list,&nbsp;you will need&nbsp;one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement these functions in your linked list class:


	get(index) : Get the value of&nbsp;the index-th&nbsp;node in the linked list. If the index is invalid, return -1.
	addAtHead(val) : Add a node of value val&nbsp;before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
	addAtTail(val) : Append a node of value val&nbsp;to the last element of the linked list.
	addAtIndex(index, val) : Add a node of value val&nbsp;before the index-th&nbsp;node in the linked list.&nbsp;If index&nbsp;equals&nbsp;to the length of&nbsp;linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
	deleteAtIndex(index) : Delete&nbsp;the index-th&nbsp;node in the linked list, if the index is valid.


Example:


MyLinkedList linkedList = new MyLinkedList();
linkedList.addAtHead(1);
linkedList.addAtTail(3);
linkedList.addAtIndex(1, 2);  // linked list becomes 1-&gt;2-&gt;3
linkedList.get(1);            // returns 2
linkedList.deleteAtIndex(1);  // now the linked list is 1-&gt;3
linkedList.get(1);&nbsp;&nbsp;&nbsp;         // returns 3


Note:


	All values will be in the range of [1, 1000].
	The number of operations will be in the range of&nbsp;[1, 1000].
	Please do not use the built-in LinkedList library.

**/
class _838_Design_Linked_List {

    /** Initialize your data structure here. */
    public _838_Design_Linked_List() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
    }
}

/**
 * Your _838_Design_Linked_List object will be instantiated and called as such:
 * _838_Design_Linked_List obj = new _838_Design_Linked_List();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */