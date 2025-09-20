class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int maxAverageSum = 0;
        for (int i = 0; i < k; i++) {
            maxAverageSum += nums[i];
        }

        int currSum = maxAverageSum; 

        for (int i = k; i < nums.length; i++) {
            currSum += nums[i] - nums[i - k];   
            if (currSum > maxAverageSum) {
                maxAverageSum = currSum;
            }
        }

        return (double) maxAverageSum / k;
    }
}


/*
1 12 -5 -6 50 3 k:4

1 12 -5 -6 = 0
0-1+50 = 49




*/