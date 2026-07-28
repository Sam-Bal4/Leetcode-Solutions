// Last updated: 7/28/2026, 4:54:01 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int n = s.length();
4
5        char[] half = s.substring(0, n / 2).toCharArray();
6        Arrays.sort(half);
7
8        String res =
9            new String(half)
10            + ((n & 1) == 1 ? s.charAt(n / 2) : "")
11            + new StringBuilder(new String(half)).reverse();
12
13        return res;
14    }
15}