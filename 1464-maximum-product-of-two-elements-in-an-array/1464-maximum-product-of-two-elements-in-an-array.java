class Solution {
    public int maxProduct(int[] nums) {
        int maxNumber = 0;
        for (int i = 0; i < nums.length;i++){
            for (int j = 0;j < nums.length;j++){
                maxNumber = i!= j && (nums[i] -1) *(nums[j]-1) > maxNumber ? (nums[i]-1) * (nums[j]-1):maxNumber;
            }
        }
        return maxNumber;   
    }
}