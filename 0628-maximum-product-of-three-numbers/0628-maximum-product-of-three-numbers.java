class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int total = nums[0] * nums[1] * nums[nums.length - 1];
        if (total < nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]){
            total = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        }
        return total;    
    }
}