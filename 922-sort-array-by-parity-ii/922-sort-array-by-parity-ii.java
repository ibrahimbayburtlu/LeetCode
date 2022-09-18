class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length]; // size = 4
        int odd = 1; // 5,7
        int even = 0; // 2,4
        for (int i = 0; i < nums.length;i++){
            if (nums[i] % 2 ==0){
                arr[even] = nums[i];
                even += 2;
            }else{
                arr[odd] = nums[i];
                odd += 2;
            }
        }
        return arr;    
    }
}