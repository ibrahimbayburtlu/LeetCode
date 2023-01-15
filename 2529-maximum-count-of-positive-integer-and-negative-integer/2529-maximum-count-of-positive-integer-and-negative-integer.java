class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        int maxCount = -1;
        for (int i = 0; i < nums.length;i++){
            if (nums[i] > 0){
                pos += 1;
            }else if (nums[i] < 0) {
                neg = neg + 1;
            }
            maxCount = Math.max(Math.abs(pos - neg),maxCount);
        }
        maxCount = Math.max(Math.max(pos,neg),maxCount);
        return maxCount;
    }
}