package com.hama.leetcode;
/**
At a lemonade stand, each lemonade costs $5.&nbsp;

Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).

Each customer will only buy one lemonade and&nbsp;pay with either a $5, $10, or $20 bill.&nbsp; You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.

Note that you don&#39;t have any change&nbsp;in hand at first.

Return true&nbsp;if and only if you can provide every customer with correct change.

&nbsp;


Example 1:


Input: [5,5,5,10,20]
Output: true
Explanation: 
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.



Example 2:


Input: [5,5,10]
Output: true



Example 3:


Input: [10,10]
Output: false



Example 4:


Input: [5,5,10,10,20]
Output: false
Explanation: 
From the first two customers in order, we collect two $5 bills.
For the next two customers in order, we collect a $10 bill and give back a $5 bill.
For the last customer, we can't give change of $15 back because we only have two $10 bills.
Since not every customer received correct change, the answer is false.


&nbsp;

Note:


	0 &lt;= bills.length &lt;= 10000
	bills[i]&nbsp;will be either&nbsp;5, 10, or 20.





**/
class _890_Lemonade_Change {
    public boolean lemonadeChange(int[] bills) {
        
    }
}