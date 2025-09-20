class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] output = new int[n];
    
    int[] leftProducts = new int[n];
    int[] rightProducts = new int[n];
    
    leftProducts[0] = 1;
    rightProducts[n - 1] = 1;
    
    for (int i = 1; i < n; i++) {
        leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
    }
    
    for (int i = n - 2; i >= 0; i--) {
        rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
    }
    
    for (int i = 0; i < n; i++) {
        output[i] = leftProducts[i] * rightProducts[i];
    }
    
    return output;
        
    }
}