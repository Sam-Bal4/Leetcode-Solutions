// Last updated: 7/31/2026, 4:26:22 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        int size = nums.length;
4        Arrays.sort(nums);
5
6        int allPositive = nums[size-1] * nums[size-2] * nums[size-3];
7        int twoNegative = nums[0] * nums[1] * nums[size-1];
8        return Math.max(allPositive, twoNegative);
9    }
10}