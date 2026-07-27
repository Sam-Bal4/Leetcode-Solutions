// Last updated: 7/27/2026, 5:03:07 PM
class Solution {
    public int maxProduct(int[] nums) {
        int highest = 0;
        int secondHighest = 0;
        int product;
        int arraySize = nums.length - 1;

        for(int i = 0; i <= arraySize; i++){
            if(nums[i] >= highest){
                System.out.println("New Highest value: " + nums[i] + " New Second Highest value: " + highest);
                secondHighest = highest;
                highest = nums[i];
            }
            else if(nums[i] >= secondHighest && nums[i] <= highest){
            System.out.println("Highest value: " + highest + " New Second Highest value: " + nums[i]);
            secondHighest = nums[i];
            }
        }
        
        product = (highest -1) * (secondHighest-1);

        return product;
    }
}