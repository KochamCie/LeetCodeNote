package com.hama.leetcode;
/**
You want to form a target&nbsp;string of lowercase letters.

At the beginning, your sequence is target.length&nbsp;&#39;?&#39; marks.&nbsp; You also have a stamp&nbsp;of lowercase letters.

On each turn, you may place the stamp over the sequence, and replace every letter in the sequence with the corresponding letter from the stamp.&nbsp; You can make up to 10 * target.length turns.

For example, if the initial sequence is ?????, and your stamp is abc,&nbsp; then you may make abc??, ?abc?, ??abc&nbsp;in the first turn.&nbsp; (Note that the stamp must be fully contained in the boundaries of the sequence in order to stamp.)

If the sequence is possible to stamp, then return an array of&nbsp;the index of the left-most letter being stamped at each turn.&nbsp; If the sequence is not possible to stamp, return an empty array.

For example, if the sequence is ababc, and the stamp is abc, then we could return the answer [0, 2], corresponding to the moves ????? -&gt; abc?? -&gt; ababc.

Also, if the sequence is possible to stamp, it is guaranteed it is possible to stamp within 10 * target.length&nbsp;moves.&nbsp; Any answers specifying more than this number of moves&nbsp;will not be accepted.

&nbsp;

Example 1:


Input: stamp = abc, target = ababc
Output: [0,2]
([1,0,2] would also be accepted as an answer, as well as some other answers.)



Example 2:


Input: stamp = abca, target = aabcaca
Output: [3,0,1]



&nbsp;

Note:




	1 &lt;= stamp.length &lt;= target.length &lt;= 1000
	stamp and target only contain lowercase letters.
**/
class _973_Stamping_The_Sequence {
    public int[] movesToStamp(String stamp, String target) {
        
    }
}