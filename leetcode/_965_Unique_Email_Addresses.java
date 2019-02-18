package com.hama.leetcode;
/**
Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com,&nbsp;alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain &#39;.&#39;s or &#39;+&#39;s.

If you add periods (&#39;.&#39;) between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.&nbsp; For example, alice.z@leetcode.com and alicez@leetcode.com forward to the same email address.&nbsp; (Note that this rule does not apply for domain names.)

If you add a plus (&#39;+&#39;) in the local name, everything after the first plus sign will be&nbsp;ignored. This allows certain emails to be filtered, for example&nbsp;m.y+name@email.com&nbsp;will be forwarded to&nbsp;my@email.com.&nbsp; (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.&nbsp;&nbsp;How many different addresses actually receive mails?&nbsp;

&nbsp;


Example 1:


Input: [test.email+alex@leetcode.com,test.e.mail+bob.cathy@leetcode.com,testemail+david@lee.tcode.com]
Output: 2
Explanation:&nbsp;testemail@leetcode.com and testemail@lee.tcode.com actually receive mails


&nbsp;

Note:


	1 &lt;= emails[i].length&nbsp;&lt;= 100
	1 &lt;= emails.length &lt;= 100
	Each emails[i] contains exactly one &#39;@&#39; character.


**/
class _965_Unique_Email_Addresses {
    public int numUniqueEmails(String[] emails) {
        
    }
}