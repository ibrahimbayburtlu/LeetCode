class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int startIndex = 0;
        int lastIndex = nums.length - 1;
        int maxTotal = 0;
        while (startIndex < lastIndex){
            maxTotal = Math.max(maxTotal,nums[startIndex] + nums[lastIndex]);
            startIndex++;
            lastIndex--;
        }
        return maxTotal;
    }
}