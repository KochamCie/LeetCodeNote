package com.hama.leetcode;
/**
In a string composed of &#39;L&#39;, &#39;R&#39;, and &#39;X&#39; characters, like RXXLRXRXL, a move consists of either replacing one occurrence of XL with LX, or replacing one occurrence of RX with XR. Given the starting string start and the ending string end, return True if and only if there exists a sequence of moves to transform one string to the other.

Example:


Input: start = RXXLRXRXL, end = XRLXXRRLX
Output: True
Explanation:
We can transform start to end following these steps:
RXXLRXRXL -&gt;
XRXLRXRXL -&gt;
XRLXRXRXL -&gt;
XRLXXRRXL -&gt;
XRLXXRRLX


Note:


	1 &lt;= len(start) = len(end) &lt;= 10000.
	Both start and end will only consist of characters in {&#39;L&#39;, &#39;R&#39;, &#39;X&#39;}.

**/
class _793_Swap_Adjacent_in_LR_String {
    public boolean canTransform(String start, String end) {
        
    }
}