class Solution {
    public int arrayPairSum(int[] nums) {
        int total = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length;i+=2){
            total += Math.min(nums[i],nums[i+1]);
        }
        return total;  
    }
}