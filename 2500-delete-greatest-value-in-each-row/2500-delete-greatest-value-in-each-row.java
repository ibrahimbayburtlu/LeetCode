class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length;i++){
            Arrays.sort(grid[i]);
        }

        int total = 0;
        for(int j=0;j<grid[0].length;j++){
            int m = -1;
            for(int[] row :grid){
                m = Math.max(m,row[j]);
            }
            total += m;
        }
        return total;
    }
}