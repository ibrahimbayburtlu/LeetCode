class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int finish = nums.length - 1;
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        while (start <= finish){
            if (nums[start] == target){
                arr[0] = start;
            }
            if (nums[finish] == target){
                arr[1] = finish;
            }
            if (nums[start] != target){
                start++;
            }
            if (nums[finish] != target){
                finish--;
            }
            if (arr[0] != -1 && arr[1] != -1){
                return arr;
            }
        }
        return arr;  
    }
}