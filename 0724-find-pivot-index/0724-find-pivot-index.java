class Solution {
    public int pivotIndex(int[] nums) {
        int numLen = nums.length;
        int[] prefix = new int[numLen];
        int total = nums[0];

        prefix[0] = nums[0];
        for (int i = 1; i < numLen; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
            total += nums[i];
        }

        for (int i = 0; i < numLen; i++) {
            int leftSum = prefix[i] - nums[i];
            int rightSum = total - prefix[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}


/*
43
21 22

*/