class Solution {
    public int countPairs(int[] nums, int k) {
        int total = 0;
        for (int j = 1; j < nums.length;j++){
            for (int i = 0; i < j; i++){
                if (nums[i] == nums[j] && (i*j)% k == 0){
                    total+=1;
                }
            }
        }
        return total;   
    }
}