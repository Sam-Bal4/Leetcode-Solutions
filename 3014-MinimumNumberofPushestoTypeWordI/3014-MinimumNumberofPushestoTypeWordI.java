// Last updated: 7/31/2026, 4:52:50 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4
5        for (char c : word.toCharArray()) {
6            freq[c - 'a']++;
7        }
8
9        Arrays.sort(freq);
10
11        int minPushes = 0;
12        int count = 0;
13
14        for (int i = 25; i >= 0; i--) {
15            if (freq[i] == 0) break; 
16            int multiplier = (count / 8) + 1;
17            minPushes += freq[i] * multiplier;
18            
19            count++;
20        }
21
22        return minPushes;
23    }
24}