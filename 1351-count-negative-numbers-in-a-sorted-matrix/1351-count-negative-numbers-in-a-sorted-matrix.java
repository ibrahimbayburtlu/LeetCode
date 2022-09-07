class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] < 0) count += 1;
            }
        }
        return count;   
    }
}