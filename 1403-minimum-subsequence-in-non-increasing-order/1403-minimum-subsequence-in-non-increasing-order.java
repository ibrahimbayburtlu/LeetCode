class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        int total = 0;
        int otherTotal = 0;
        int j = nums.length-1;
        for (int num : nums) {
            total += num;
        }
        while (total >= otherTotal){
            otherTotal += nums[j];
            arr.add(nums[j]);
            total -= nums[j];
            j--;
        }
        return arr;  
    }
}