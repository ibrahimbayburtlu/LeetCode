class Solution {
    public void moveZeroes(int[] nums) {
        int insert = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != insert) {
                    int tmp = nums[i];
                    nums[i] = nums[insert];
                    nums[insert] = tmp;
                }
                insert++;
            }
        }
    }
}
