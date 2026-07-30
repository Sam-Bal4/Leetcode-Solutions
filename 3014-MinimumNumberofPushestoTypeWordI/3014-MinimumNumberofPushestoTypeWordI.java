// Last updated: 7/30/2026, 11:13:08 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int minPushes = 0;
4        int count = 1;
5        int wordSize = word.length();
6        if (wordSize <= 8) {
7            return wordSize;
8        } else {
9            wordSize -= 8;
10            minPushes += 8 * count;
11            count++;
12            if (wordSize <= 8) {
13                minPushes += wordSize * count;
14            } else {
15                wordSize -= 8;
16                minPushes += 8 * count;
17                count++;
18                if (wordSize <= 8) {
19                    minPushes += wordSize * count;
20                } else {
21                    wordSize -= 8;
22                    minPushes += 8 * count;
23                    count++;
24                    if (wordSize <= 8) {
25                        minPushes += wordSize * count;
26                    } else {
27                        wordSize -= 8;
28                        minPushes += 8 * count;
29                    }
30                }
31            }
32        }
33        return minPushes;
34    }
35}