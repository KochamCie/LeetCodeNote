package com.hama.leetcode;
/**
Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle. It is also called Ring Buffer.

One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.

Your implementation should support following operations:


	MyCircularQueue(k): Constructor, set the size of the queue to be k.
	Front: Get the front item from the queue. If the queue is empty, return -1.
	Rear: Get the last item from the queue. If the queue is empty, return -1.
	enQueue(value): Insert an element into the circular queue. Return true if the operation is successful.
	deQueue(): Delete an element from the circular queue. Return true if the operation is successful.
	isEmpty(): Checks whether the circular queue is empty or not.
	isFull(): Checks whether the circular queue is full or not.


&nbsp;

Example:


MyCircularQueue circularQueue = new MyCircularQueue(3); // set the size to be 3
circularQueue.enQueue(1); &nbsp;// return true
circularQueue.enQueue(2); &nbsp;// return true
circularQueue.enQueue(3); &nbsp;// return true
circularQueue.enQueue(4); &nbsp;// return false, the queue is full
circularQueue.Rear(); &nbsp;// return 3
circularQueue.isFull(); &nbsp;// return true
circularQueue.deQueue(); &nbsp;// return true
circularQueue.enQueue(4); &nbsp;// return true
circularQueue.Rear(); &nbsp;// return 4

&nbsp;

Note:


	All values will be in the range of [0, 1000].
	The number of operations will be in the range of&nbsp;[1, 1000].
	Please do not use the built-in Queue library.

**/
class _860_Design_Circular_Queue {

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public _860_Design_Circular_Queue(int k) {
        
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        
    }
}

/**
 * Your _860_Design_Circular_Queue object will be instantiated and called as such:
 * _860_Design_Circular_Queue obj = new _860_Design_Circular_Queue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */