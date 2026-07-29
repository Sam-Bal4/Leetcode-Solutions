// Last updated: 7/29/2026, 5:52:12 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int valueNeeded;
4        int[] index = new int[2];
5        HashMap<Integer, Integer> indices = new HashMap<>();
6        for(int i = 0; i < nums.length; i++){
7            valueNeeded = target - nums[i];
8            if(indices.get(valueNeeded) != null){
9                index[0] = i;
10                index[1] = indices.get(valueNeeded);
11            }else{
12                indices.put(nums[i], i);
13            }
14        }
15        return index;
16    }
17}