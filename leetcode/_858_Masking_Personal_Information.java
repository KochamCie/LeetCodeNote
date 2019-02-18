package com.hama.leetcode;
/**
We are given a&nbsp;personal information string S, which may represent&nbsp;either an email address or a phone number.

We would like to mask this&nbsp;personal information according to the&nbsp;following rules:


1. Email address:

We define a&nbsp;name to be a string of length &ge; 2 consisting&nbsp;of only lowercase letters&nbsp;a-z or uppercase&nbsp;letters&nbsp;A-Z.

An email address starts with a name, followed by the&nbsp;symbol &#39;@&#39;, followed by a name, followed by the&nbsp;dot&nbsp;&#39;.&#39;&nbsp;and&nbsp;followed by a name.&nbsp;

All email addresses are&nbsp;guaranteed to be valid and in the format of&nbsp;name1@name2.name3.

To mask an email, all names must be converted to lowercase and all letters between the first and last letter of the first name must be replaced by 5 asterisks &#39;*&#39;.


2. Phone number:

A phone number is a string consisting of&nbsp;only the digits 0-9 or the characters from the set {&#39;+&#39;, &#39;-&#39;, &#39;(&#39;, &#39;)&#39;, &#39;&nbsp;&#39;}.&nbsp;You may assume a phone&nbsp;number contains&nbsp;10 to 13 digits.

The last 10 digits make up the local&nbsp;number, while the digits before those make up the country code. Note that&nbsp;the country code is optional. We want to expose only the last 4 digits&nbsp;and mask all other&nbsp;digits.

The local&nbsp;number&nbsp;should be formatted and masked as ***-***-1111,&nbsp;where 1 represents the exposed digits.

To mask a phone number with country code like +111 111 111 1111, we write it in the form +***-***-***-1111.&nbsp; The &#39;+&#39;&nbsp;sign and the first &#39;-&#39;&nbsp;sign before the local number should only exist if there is a country code.&nbsp; For example, a 12 digit phone number mask&nbsp;should start&nbsp;with +**-.

Note that extraneous characters like (, ),  , as well as&nbsp;extra dashes or plus signs not part of the above formatting scheme should be removed.

&nbsp;

Return the correct mask of the information provided.

&nbsp;

Example 1:


Input: LeetCode@LeetCode.com
Output: l*****e@leetcode.com
Explanation:&nbsp;All names are converted to lowercase, and the letters between the
&nbsp;            first and last letter of the first name is replaced by 5 asterisks.
&nbsp;            Therefore, leetcode -&gt; l*****e.


Example 2:


Input: AB@qq.com
Output: a*****b@qq.com
Explanation:&nbsp;There must be 5 asterisks between the first and last letter 
&nbsp;            of the first name ab. Therefore, ab -&gt; a*****b.


Example 3:


Input: 1(234)567-890
Output: ***-***-7890
Explanation:&nbsp;10 digits in the phone number, which means all digits make up the local number.


Example 4:


Input: 86-(10)12345678
Output: +**-***-***-5678
Explanation:&nbsp;12 digits, 2 digits for country code and 10 digits for local number. 


Notes:


	S.length&nbsp;&lt;=&nbsp;40.
	Emails have length at least 8.
	Phone numbers have length at least 10.

**/
class _858_Masking_Personal_Information {
    public String maskPII(String S) {
        
    }
}