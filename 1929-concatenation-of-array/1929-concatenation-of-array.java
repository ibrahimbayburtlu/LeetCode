class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int[] arr = new int[numsLength*2];
        for (int i = 0; i < arr.length;i++){
            if (i <numsLength){
                arr[i] = nums[i];
            }else{
                arr[i] = nums[i-numsLength];
            }
        }
        return arr;
    }
}