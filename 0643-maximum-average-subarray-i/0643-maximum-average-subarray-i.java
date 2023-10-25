class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int maxTotal = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length - k + 1;i++){
            int currentTotal = 0;
            for (int j = 0; j < k; j++){
                currentTotal += nums[i + j];
            }

            maxTotal = Math.max(currentTotal,maxTotal);
        }
        return (double) maxTotal / k;
    }
}