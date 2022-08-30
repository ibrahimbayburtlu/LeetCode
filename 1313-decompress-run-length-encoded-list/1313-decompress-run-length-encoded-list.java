class Solution {
    public int[] decompressRLElist(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length;i+=2){
            total += nums[i];
        }
        int[] arr = new int[total];
        int k = 0;
        for (int i = 0; i < nums.length;i+=2){
            int value = nums[i+1];
            int freq = nums[i];
            for (int j = 0; j < freq;j++){
                arr[k] = value;
                k++;
            }
        }
        return arr;  
    }
}