class Solution {
    public int smallestEqual(int[] nums) {
        int temp = -1;
        for (int i = nums.length-1; i >= 0;i--){
            temp = i % 10 == nums[i] ? i : temp;
        }
        return temp;   
    }
}