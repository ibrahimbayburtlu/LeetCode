class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums){
            int control = 0;
            while (num != 0){
                num = num / 10;
                control += 1;
            }
            if (control % 2 == 0){
                count += 1;
            }
        }
        return count;   
    }
}