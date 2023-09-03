class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; // dizinin uzunluğu
        Set<Integer> set = new HashSet<>(); // bizim için eşsiz sayıları tutacak.
        
        
        for(int i = 0; i < n;i++){
            set.add(nums[i]);
            nums[i] = 100;
        }
        
        int setLength = set.size();
        
        int i = 0;
        
        for(int number : set){
            nums[i++] = number;
        }
        
        Arrays.sort(nums);
        return setLength;
    }
}