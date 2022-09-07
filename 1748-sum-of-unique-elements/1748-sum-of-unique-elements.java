class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] record = new int[101];
        for (int i = 0; i < nums.length;i++){
            if (record[nums[i]] != 0){
                if (record[nums[i]] == 1){
                    sum -= nums[i];
                    record[nums[i]] = 2;
                }
            }
            else{
                sum += nums[i];
                record[nums[i]] = 1;
            }
        }
        return sum;  
    }
}