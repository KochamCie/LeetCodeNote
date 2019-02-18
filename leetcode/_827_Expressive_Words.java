package com.hama.leetcode;
/**
Sometimes people repeat letters to represent extra feeling, such as hello -&gt; heeellooo, hi -&gt; hiiii.&nbsp; Here, we have&nbsp;groups, of adjacent letters that are all the same character, and adjacent characters to&nbsp;the group are different.&nbsp; A group&nbsp;is extended if that group is length 3 or more, so e and o would be extended in the first example, and i would be extended in the second example.&nbsp; As another example, the groups of abbcccaaaa would be a, bb, ccc, and aaaa; and ccc and aaaa are the extended groups of that string.

For some given string S, a query word is stretchy if it can be made to be equal to S by extending some groups.&nbsp; Formally, we are allowed to repeatedly choose a group&nbsp;(as defined above) of characters c, and add some number of the&nbsp;same character c to it so that the length of the group is 3 or more.&nbsp; Note that we cannot extend a group of size one like h to a group of size two like hh - all extensions must leave the group extended - ie., at least 3 characters long.

Given a list of query words, return the number of words that are stretchy.&nbsp;


Example:
Input: 
S = heeellooo
words = [hello, hi, helo]
Output: 1
Explanation: 
We can extend e and o in the word hello to get heeellooo.
We can&#39;t extend helo to get heeellooo because the group ll is not extended.


Notes: 


	0 &lt;= len(S) &lt;= 100.
	0 &lt;= len(words) &lt;= 100.
	0 &lt;= len(words[i]) &lt;= 100.
	S and all words in words&nbsp;consist only of&nbsp;lowercase letters


&nbsp;
**/
class _827_Expressive_Words {
    public int expressiveWords(String S, String[] words) {
        
    }
}