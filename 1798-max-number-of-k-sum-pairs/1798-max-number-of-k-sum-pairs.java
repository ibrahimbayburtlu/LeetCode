class Solution {
    public int maxOperations(int[] nums, int k) {
        
        int start = 0;
        int finish = nums.length - 1;
        int count = 0;

        Arrays.sort(nums);
        while(start < finish){
            if(nums[start] + nums[finish] > k){
                finish--;
            }else if(nums[start] + nums[finish] < k){
                start++;
            }else{
                finish--;
                start++;
                count++;
            }
        }
        return count;
    }
}

/*
1 2 3 4 k = 5

1 - 4 : 1
2 - 3 : 2

1 2 3 6 

1 3 3 4 3

*/