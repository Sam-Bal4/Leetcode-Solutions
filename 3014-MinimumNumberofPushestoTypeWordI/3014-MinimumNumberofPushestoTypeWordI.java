// Last updated: 7/30/2026, 11:16:07 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int minPushes = 0;
4        int count = 1;
5        int wordSize = word.length();
6
7        //Done using if statements
8        /*
9        if (wordSize <= 8) {
10            return wordSize;
11        } else {
12            wordSize -= 8;
13            minPushes += 8 * count;
14            count++;
15            if (wordSize <= 8) {
16                minPushes += wordSize * count;
17            } else {
18                wordSize -= 8;
19                minPushes += 8 * count;
20                count++;
21                if (wordSize <= 8) {
22                    minPushes += wordSize * count;
23                } else {
24                    wordSize -= 8;
25                    minPushes += 8 * count;
26                    count++;
27                    if (wordSize <= 8) {
28                        minPushes += wordSize * count;
29                    } else {
30                        wordSize -= 8;
31                        minPushes += 8 * count;
32                    }
33                }
34            }
35        }*/
36
37        //Done using while loop
38        while(wordSize > 8){
39            wordSize -= 8;
40            minPushes += 8 * count;
41            count++;
42        }
43        minPushes += wordSize * count;
44        return minPushes;
45    }
46}