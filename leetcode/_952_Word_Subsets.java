package com.hama.leetcode;
/**
We are given two arrays A and B of words.&nbsp; Each word is a string of lowercase letters.

Now, say that&nbsp;word b is a subset of word a&nbsp;if every letter in b occurs in a, including multiplicity.&nbsp; For example, wrr is a subset of warrior, but is not a subset of world.

Now say a word a from A is universal if for every b in B, b&nbsp;is a subset of a.&nbsp;

Return a list of all universal words in A.&nbsp; You can return the words in any order.

&nbsp;





Example 1:


Input: A = [amazon,apple,facebook,google,leetcode], B = [e,o]
Output: [facebook,google,leetcode]



Example 2:


Input: A = [amazon,apple,facebook,google,leetcode], B = [l,e]
Output: [apple,google,leetcode]



Example 3:


Input: A = [amazon,apple,facebook,google,leetcode], B = [e,oo]
Output: [facebook,google]



Example 4:


Input: A = [amazon,apple,facebook,google,leetcode], B = [lo,eo]
Output: [google,leetcode]



Example 5:


Input: A = [amazon,apple,facebook,google,leetcode], B = [ec,oc,ceo]
Output: [facebook,leetcode]


&nbsp;

Note:


	1 &lt;= A.length, B.length &lt;= 10000
	1 &lt;= A[i].length, B[i].length&nbsp;&lt;= 10
	A[i] and B[i] consist only of lowercase letters.
	All words in A[i] are unique: there isn&#39;t i != j with A[i] == A[j].






**/
class _952_Word_Subsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        
    }
}