// Last updated: 7/29/2026, 5:35:57 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4        int[] indices = new int[2];
5        int sum;
6
7        for(int i = 0; i < nums.length; i++){
8
9                for(int j = i+1; j < nums.length; j++){
10                    sum = nums[i] + nums[j];
11                    if(sum == target){
12                        indices[0] = i;
13                        indices[1] = j;
14                        break;
15                    }
16                }
17                if(indices[1] != 0){
18                    break;
19                }
20            }
21        return indices;
22    }
23}