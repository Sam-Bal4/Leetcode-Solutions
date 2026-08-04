// Last updated: 8/4/2026, 3:41:49 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        Arrays.sort(nums);
4        ArrayList<Integer> missingValues = new ArrayList<Integer>();
5
6        for(int i = 1; i < nums.length; i++){
7            int currentValue = nums[i] - 1;
8            int previousValue = nums[i-1];
9
10            int count;
11            while(currentValue != previousValue){
12                missingValues.add(currentValue);
13                currentValue--;
14            }
15        }
16        missingValues.sort(null);
17        return missingValues;
18    }
19}