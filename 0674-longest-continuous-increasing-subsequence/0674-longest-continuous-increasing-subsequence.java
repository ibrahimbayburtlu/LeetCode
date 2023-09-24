class Solution {
    public int findLengthOfLCIS(int[] nums) {
     
        
        int maxCount = 0;
        int start = 0;
        
        for(int i = 0;i < nums.length;i++){
            if(i > 0 && nums[i - 1] >= nums[i]){
                start = i;
            }
            maxCount = Math.max(maxCount,i-start+1);
        }
        return maxCount;
    }
}