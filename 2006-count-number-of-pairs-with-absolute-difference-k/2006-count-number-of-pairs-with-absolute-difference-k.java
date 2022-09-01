class Solution {
    public int countKDifference(int[] nums, int k) {
        int control;
        int total = 0;
        for (int i = 0; i < nums.length-1;i++){
            for (int j = i+1; j < nums.length;j++){
                control = Math.abs(nums[i]-nums[j]);
                if (control == k){
                    total +=1;
                }
            }
        }
        return total;  
    }
}