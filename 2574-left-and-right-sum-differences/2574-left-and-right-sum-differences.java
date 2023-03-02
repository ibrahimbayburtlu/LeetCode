class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int sum = 0;
        int[] answers = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] leftSum = new int[nums.length];

        // Calculate leftSum && total
        for (int i = 0; i < nums.length; i++){
            leftSum[i] = sum;
            sum += nums[i];
        }
        // leftSum array console appearance
        // System.out.println(Arrays.toString(leftSum));

        // Calculate rightSum
        for (int i = 0; i < nums.length ;i++){
            rightSum[i] = sum - nums[i];
            sum -= nums[i];
        }
        // rightSum array console appearance
        //System.out.println(Arrays.toString(rightSum));

        // Calculate answer array
        for (int i = 0; i < nums.length;i++){
            answers[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answers;   
    }
}