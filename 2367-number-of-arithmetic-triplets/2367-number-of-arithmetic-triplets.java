class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length-2;i++){
            for (int j = i+1; j < nums.length-1;j++){
                for (int k = j+1; k < nums.length;k++){
                    count += nums[j] - nums[i] == diff && nums[k] - nums[j] == diff ? 1:0;
                }
            }
        }
        return count;   
    }
}