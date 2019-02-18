package com.hama.leetcode;
/**
This problem is an&nbsp;interactive problem&nbsp;new to the LeetCode platform.

We are given a word list of unique words, each word is 6 letters long, and one word in this list is chosen as secret.

You may call master.guess(word)&nbsp;to guess a word.&nbsp; The guessed word should have&nbsp;type string&nbsp;and must be from the original list&nbsp;with 6 lowercase letters.

This function returns an&nbsp;integer&nbsp;type, representing&nbsp;the number of exact matches (value and position) of your guess to the secret word.&nbsp; Also, if your guess is not in the given wordlist, it will return -1 instead.

For each test case, you have 10 guesses to guess the word. At the end of any number of calls, if you have made 10 or less calls to master.guess&nbsp;and at least one of these guesses was the secret, you pass the testcase.

Besides the example test case below, there will be 5&nbsp;additional test cases, each with 100 words in the word list.&nbsp; The letters of each word in those testcases were chosen&nbsp;independently at random from &#39;a&#39; to &#39;z&#39;, such that every word in the given word lists is unique.


Example 1:
Input:&nbsp;secret = acckzz, wordlist = [acckzz,ccbazz,eiowzz,abcczz]

Explanation:

master.guess(aaaaaa) returns -1, because&nbsp;aaaaaa&nbsp;is not in wordlist.
master.guess(acckzz) returns 6, because&nbsp;acckzz is secret and has all 6&nbsp;matches.
master.guess(ccbazz) returns 3, because&nbsp;ccbazz&nbsp;has 3 matches.
master.guess(eiowzz) returns 2, because&nbsp;eiowzz&nbsp;has 2&nbsp;matches.
master.guess(abcczz) returns 4, because&nbsp;abcczz has 4 matches.

We made 5 calls to&nbsp;master.guess and one of them was the secret, so we pass the test case.


Note:&nbsp; Any solutions that attempt to circumvent the judge&nbsp;will result in disqualification.
**/
_873_Guess_the_Word/_873_Guess_the_Word*_873_Guess_the_Word*_873_Guess_the_Word
_873_Guess_the_Word _873_Guess_the_Word*_873_Guess_the_Word _873_Guess_the_Word/_873_Guess_the_Word/_873_Guess_the_Word _873_Guess_the_WordT_873_Guess_the_Wordh_873_Guess_the_Wordi_873_Guess_the_Words_873_Guess_the_Word _873_Guess_the_Wordi_873_Guess_the_Words_873_Guess_the_Word _873_Guess_the_Wordt_873_Guess_the_Wordh_873_Guess_the_Worde_873_Guess_the_Word _873_Guess_the_WordM_873_Guess_the_Worda_873_Guess_the_Words_873_Guess_the_Wordt_873_Guess_the_Worde_873_Guess_the_Wordr_873_Guess_the_Word'_873_Guess_the_Words_873_Guess_the_Word _873_Guess_the_WordA_873_Guess_the_WordP_873_Guess_the_WordI_873_Guess_the_Word _873_Guess_the_Wordi_873_Guess_the_Wordn_873_Guess_the_Wordt_873_Guess_the_Worde_873_Guess_the_Wordr_873_Guess_the_Wordf_873_Guess_the_Worda_873_Guess_the_Wordc_873_Guess_the_Worde_873_Guess_the_Word._873_Guess_the_Word
_873_Guess_the_Word _873_Guess_the_Word*_873_Guess_the_Word _873_Guess_the_Word/_873_Guess_the_Word/_873_Guess_the_Word _873_Guess_the_WordY_873_Guess_the_Wordo_873_Guess_the_Wordu_873_Guess_the_Word _873_Guess_the_Words_873_Guess_the_Wordh_873_Guess_the_Wordo_873_Guess_the_Wordu_873_Guess_the_Wordl_873_Guess_the_Wordd_873_Guess_the_Word _873_Guess_the_Wordn_873_Guess_the_Wordo_873_Guess_the_Wordt_873_Guess_the_Word _873_Guess_the_Wordi_873_Guess_the_Wordm_873_Guess_the_Wordp_873_Guess_the_Wordl_873_Guess_the_Worde_873_Guess_the_Wordm_873_Guess_the_Worde_873_Guess_the_Wordn_873_Guess_the_Wordt_873_Guess_the_Word _873_Guess_the_Wordi_873_Guess_the_Wordt_873_Guess_the_Word,_873_Guess_the_Word _873_Guess_the_Wordo_873_Guess_the_Wordr_873_Guess_the_Word _873_Guess_the_Words_873_Guess_the_Wordp_873_Guess_the_Worde_873_Guess_the_Wordc_873_Guess_the_Wordu_873_Guess_the_Wordl_873_Guess_the_Worda_873_Guess_the_Wordt_873_Guess_the_Worde_873_Guess_the_Word _873_Guess_the_Worda_873_Guess_the_Wordb_873_Guess_the_Wordo_873_Guess_the_Wordu_873_Guess_the_Wordt_873_Guess_the_Word _873_Guess_the_Wordi_873_Guess_the_Wordt_873_Guess_the_Words_873_Guess_the_Word _873_Guess_the_Wordi_873_Guess_the_Wordm_873_Guess_the_Wordp_873_Guess_the_Wordl_873_Guess_the_Worde_873_Guess_the_Wordm_873_Guess_the_Worde_873_Guess_the_Wordn_873_Guess_the_Wordt_873_Guess_the_Worda_873_Guess_the_Wordt_873_Guess_the_Wordi_873_Guess_the_Wordo_873_Guess_the_Wordn_873_Guess_the_Word
_873_Guess_the_Word _873_Guess_the_Word*_873_Guess_the_Word _873_Guess_the_Wordi_873_Guess_the_Wordn_873_Guess_the_Wordt_873_Guess_the_Worde_873_Guess_the_Wordr_873_Guess_the_Wordf_873_Guess_the_Worda_873_Guess_the_Wordc_873_Guess_the_Worde_873_Guess_the_Word _873_Guess_the_WordM_873_Guess_the_Worda_873_Guess_the_Words_873_Guess_the_Wordt_873_Guess_the_Worde_873_Guess_the_Wordr_873_Guess_the_Word _873_Guess_the_Word{_873_Guess_the_Word
_873_Guess_the_Word _873_Guess_the_Word*_873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Wordp_873_Guess_the_Wordu_873_Guess_the_Wordb_873_Guess_the_Wordl_873_Guess_the_Wordi_873_Guess_the_Wordc_873_Guess_the_Word _873_Guess_the_Wordi_873_Guess_the_Wordn_873_Guess_the_Wordt_873_Guess_the_Word _873_Guess_the_Wordg_873_Guess_the_Wordu_873_Guess_the_Worde_873_Guess_the_Words_873_Guess_the_Words_873_Guess_the_Word(_873_Guess_the_WordS_873_Guess_the_Wordt_873_Guess_the_Wordr_873_Guess_the_Wordi_873_Guess_the_Wordn_873_Guess_the_Wordg_873_Guess_the_Word _873_Guess_the_Wordw_873_Guess_the_Wordo_873_Guess_the_Wordr_873_Guess_the_Wordd_873_Guess_the_Word)_873_Guess_the_Word _873_Guess_the_Word{_873_Guess_the_Word}_873_Guess_the_Word
_873_Guess_the_Word _873_Guess_the_Word*_873_Guess_the_Word _873_Guess_the_Word}_873_Guess_the_Word
_873_Guess_the_Word _873_Guess_the_Word*_873_Guess_the_Word/_873_Guess_the_Word
_873_Guess_the_Wordc_873_Guess_the_Wordl_873_Guess_the_Worda_873_Guess_the_Words_873_Guess_the_Words_873_Guess_the_Word _873_Guess_the_Word__873_Guess_the_Word8_873_Guess_the_Word7_873_Guess_the_Word3_873_Guess_the_Word__873_Guess_the_WordG_873_Guess_the_Wordu_873_Guess_the_Worde_873_Guess_the_Words_873_Guess_the_Words_873_Guess_the_Word__873_Guess_the_Wordt_873_Guess_the_Wordh_873_Guess_the_Worde_873_Guess_the_Word__873_Guess_the_WordW_873_Guess_the_Wordo_873_Guess_the_Wordr_873_Guess_the_Wordd_873_Guess_the_Word _873_Guess_the_Word{_873_Guess_the_Word
_873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Wordp_873_Guess_the_Wordu_873_Guess_the_Wordb_873_Guess_the_Wordl_873_Guess_the_Wordi_873_Guess_the_Wordc_873_Guess_the_Word _873_Guess_the_Wordv_873_Guess_the_Wordo_873_Guess_the_Wordi_873_Guess_the_Wordd_873_Guess_the_Word _873_Guess_the_Wordf_873_Guess_the_Wordi_873_Guess_the_Wordn_873_Guess_the_Wordd_873_Guess_the_WordS_873_Guess_the_Worde_873_Guess_the_Wordc_873_Guess_the_Wordr_873_Guess_the_Worde_873_Guess_the_Wordt_873_Guess_the_WordW_873_Guess_the_Wordo_873_Guess_the_Wordr_873_Guess_the_Wordd_873_Guess_the_Word(_873_Guess_the_WordS_873_Guess_the_Wordt_873_Guess_the_Wordr_873_Guess_the_Wordi_873_Guess_the_Wordn_873_Guess_the_Wordg_873_Guess_the_Word[_873_Guess_the_Word]_873_Guess_the_Word _873_Guess_the_Wordw_873_Guess_the_Wordo_873_Guess_the_Wordr_873_Guess_the_Wordd_873_Guess_the_Wordl_873_Guess_the_Wordi_873_Guess_the_Words_873_Guess_the_Wordt_873_Guess_the_Word,_873_Guess_the_Word _873_Guess_the_WordM_873_Guess_the_Worda_873_Guess_the_Words_873_Guess_the_Wordt_873_Guess_the_Worde_873_Guess_the_Wordr_873_Guess_the_Word _873_Guess_the_Wordm_873_Guess_the_Worda_873_Guess_the_Words_873_Guess_the_Wordt_873_Guess_the_Worde_873_Guess_the_Wordr_873_Guess_the_Word)_873_Guess_the_Word _873_Guess_the_Word{_873_Guess_the_Word
_873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word
_873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word _873_Guess_the_Word}_873_Guess_the_Word
_873_Guess_the_Word}_873_Guess_the_Word