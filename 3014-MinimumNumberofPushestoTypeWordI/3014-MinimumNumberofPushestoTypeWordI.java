// Last updated: 7/30/2026, 11:16:28 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int minPushes = 0;
4        int count = 1;
5        int wordSize = word.length();
6        while(wordSize > 8){
7            wordSize -= 8;
8            minPushes += 8 * count;
9            count++;
10        }
11        minPushes += wordSize * count;
12        return minPushes;
13    }
14}