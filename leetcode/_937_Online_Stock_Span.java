package com.hama.leetcode;
/**
Write a class StockSpanner which collects daily price quotes for some stock, and returns the span&nbsp;of that stock&#39;s price for the current day.

The span of the stock&#39;s price today&nbsp;is defined as the maximum number of consecutive days (starting from today and going backwards)&nbsp;for which the price of the stock was less than or equal to today&#39;s price.

For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], then the stock spans would be [1, 1, 1, 2, 1, 4, 6].

&nbsp;


Example 1:


Input: [StockSpanner,next,next,next,next,next,next,next], [[],[100],[80],[60],[70],[60],[75],[85]]
Output: [null,1,1,1,2,1,4,6]
Explanation: 
First, S = StockSpanner() is initialized.  Then:
S.next(100) is called and returns 1,
S.next(80) is called and returns 1,
S.next(60) is called and returns 1,
S.next(70) is called and returns 2,
S.next(60) is called and returns 1,
S.next(75) is called and returns 4,
S.next(85) is called and returns 6.

Note that (for example) S.next(75) returned 4, because the last 4 prices
(including today&#39;s price of 75) were less than or equal to today&#39;s price.


&nbsp;

Note:


	Calls to StockSpanner.next(int price) will have 1 &lt;= price &lt;= 10^5.
	There will be at most 10000 calls to StockSpanner.next&nbsp;per test case.
	There will be at most 150000 calls to StockSpanner.next across all test cases.
	The total&nbsp;time limit for this problem has been reduced by 75% for&nbsp;C++, and 50% for all other languages.


**/
class _937_Online_Stock_Span {

    public _937_Online_Stock_Span() {
        
    }
    
    public int next(int price) {
        
    }
}

/**
 * Your _937_Online_Stock_Span object will be instantiated and called as such:
 * _937_Online_Stock_Span obj = new _937_Online_Stock_Span();
 * int param_1 = obj.next(price);
 */