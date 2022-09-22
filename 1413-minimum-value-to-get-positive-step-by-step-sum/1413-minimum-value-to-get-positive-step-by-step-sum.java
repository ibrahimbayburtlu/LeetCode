class Solution {
    public int minStartValue(int[] nums) {
        int min = 0;
        int control = 0;
        for (int num : nums) {
            control += num;
            if (min > control) {
                min = control;
            }
        }
        int x = Math.abs(min);
        return x + 1;   
    }
}