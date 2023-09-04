class Solution {
    public int removeDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList();
        int count = 0;
        int value = nums[0];
        int k = 0;
        
        for(int i = 0; i < nums.length;i++){
            if(value == nums[i] && count < 2){
                list.add(nums[i]);
                nums[i] = 10000;
                count++;
                k++;
            }else if(value != nums[i]){
                value = nums[i];
                list.add(nums[i]);
                count = 1;
                k++;
            }
        }
        
        int i = 0;
        for(int num : list){
            nums[i++] = num;
        }
        return k;
    }
}