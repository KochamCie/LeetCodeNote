package com.hama.leetcode;
/**
Given two words (beginWord and endWord), and a dictionary&#39;s word list, find all shortest transformation sequence(s) from beginWord to endWord, such that:


	Only one letter can be changed at a time
	Each transformed word must exist in the word list. Note that beginWord is not a transformed word.


Note:


	Return an empty list if there is no such transformation sequence.
	All words have the same length.
	All words contain only lowercase alphabetic characters.
	You may assume no duplicates in the word list.
	You may assume beginWord and endWord are non-empty and are not the same.


Example 1:


Input:
beginWord = hit,
endWord = cog,
wordList = [hot,dot,dog,lot,log,cog]

Output:
[
  [hit,hot,dot,dog,cog],
&nbsp; [hit,hot,lot,log,cog]
]


Example 2:


Input:
beginWord = hit
endWord = cog
wordList = [hot,dot,dog,lot,log]

Output: []

Explanation:&nbsp;The endWord cog is not in wordList, therefore no possible&nbsp;transformation.




**/
class _126_Word_Ladder_II {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        
    }
}