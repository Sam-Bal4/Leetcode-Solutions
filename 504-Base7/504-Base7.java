// Last updated: 8/3/2026, 3:44:33 PM
1class Solution {
2    public String convertToBase7(int num) {
3        String base7 = "";
4        boolean negative = false;
5        if(num == 0){
6            return "0";
7        }
8
9        if(num < 0){
10            negative = true;
11            num = Math.abs(num);
12        }
13
14
15        while(num > 0){
16            base7 = num % 7 + base7;
17            num /= 7;
18        }
19        if(negative){
20            base7 = "-" + base7;
21        }
22        return base7;
23    }
24}