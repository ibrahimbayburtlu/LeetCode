class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> arr = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length;i++){
            if (!arr.add(nums[i])){
                count += 1;
                arr.remove(nums[i]);
            }
        }
        int answer[] = new int[2];
        answer[0] = count;
        answer[1] = nums.length - (2*count);
        return answer;   
    }
}