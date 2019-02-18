package com.hama.leetcode;
/**
Your music player contains N&nbsp;different songs and she wants to listen to L (not necessarily different) songs during your trip. &nbsp;You&nbsp;create&nbsp;a playlist so&nbsp;that:


	Every song is played at least once
	A song can only be played again only if&nbsp;K&nbsp;other songs have been played


Return the number of possible playlists.&nbsp; As the answer can be very large, return it modulo 10^9 + 7.

&nbsp;




Example 1:


Input: N = 3, L = 3, K = 1
Output: 6
Explanation: There are 6 possible playlists. [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1].



Example 2:


Input: N = 2, L = 3, K = 0
Output: 6
Explanation: There are 6 possible playlists. [1, 1, 2], [1, 2, 1], [2, 1, 1], [2, 2, 1], [2, 1, 2], [1, 2, 2]



Example 3:


Input: N = 2, L = 3, K = 1
Output: 2
Explanation: There are 2 possible playlists. [1, 2, 1], [2, 1, 2]




&nbsp;

Note:


	0 &lt;= K &lt; N &lt;= L &lt;= 100



**/
class _956_Number_of_Music_Playlists {
    public int numMusicPlaylists(int N, int L, int K) {
        
    }
}