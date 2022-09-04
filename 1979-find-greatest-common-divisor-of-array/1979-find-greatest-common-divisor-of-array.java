class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums[0]; i > 0;i--){
            if (nums[nums.length-1] % i == 0 && nums[0] % i == 0){
                return i;
            }
        }
        return 1;  
    }
}