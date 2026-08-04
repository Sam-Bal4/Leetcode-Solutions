// Last updated: 8/4/2026, 3:41:30 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        Arrays.sort(nums);
4        //int missing = nums[nums.length-1] - nums.length;
5        //int[] missingValues = new int[missing];
6        ArrayList<Integer> missingValues = new ArrayList<Integer>();
7
8        for(int i = 1; i < nums.length; i++){
9            int currentValue = nums[i] - 1;
10            int previousValue = nums[i-1];
11
12            int count;
13            while(currentValue != previousValue){
14                missingValues.add(currentValue);
15                currentValue--;
16            }
17        }
18        missingValues.sort(null);
19        return missingValues;
20    }
21}