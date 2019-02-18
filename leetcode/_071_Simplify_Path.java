package com.hama.leetcode;
/**
Given an absolute path for a file (Unix-style), simplify it. Or in other words, convert it to the canonical path.

In a UNIX-style file system, a period .&nbsp;refers to the current directory. Furthermore, a double period ..&nbsp;moves the directory up a level. For more information, see:&nbsp;Absolute path&nbsp;vs&nbsp;relative&nbsp;path&nbsp;in&nbsp;Linux/Unix

Note that the returned canonical path must always begin&nbsp;with a slash /, and there must be only a single slash /&nbsp;between two directory names.&nbsp;The last directory name (if it exists) must not&nbsp;end with a trailing /. Also, the canonical path must be the shortest string&nbsp;representing the absolute path.

&nbsp;

Example 1:


Input: /home/
Output: /home
Explanation: Note that there is no trailing slash after the last directory name.


Example 2:


Input: /../
Output: /
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.


Example 3:


Input: /home//foo/
Output: /home/foo
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.


Example 4:


Input: /a/./b/../../c/
Output: /c


Example 5:


Input: /a/../../b/../c//.//
Output: /c


Example 6:


Input: /a//b////c/d//././/..
Output: /a/b/c

**/
class _071_Simplify_Path {
    public String simplifyPath(String path) {
        
    }
}