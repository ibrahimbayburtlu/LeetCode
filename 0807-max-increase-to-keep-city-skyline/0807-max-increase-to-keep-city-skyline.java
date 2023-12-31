class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rows = new int[grid.length];
        int[] columns = new int[grid.length];

        int total = 0;

        for(int i = 0; i < grid.length;i++){
            int maxRow = 0;
            int maxColumn = 0;
            for(int j = 0; j < grid[i].length;j++){
                maxRow = Math.max(grid[i][j],maxRow);
                maxColumn = Math.max(grid[j][i],maxColumn);
            }
            rows[i] = maxRow;
            columns[i] = maxColumn;
        }

        for (int i = 0;i < grid.length;i++){
            int minHigh = 0;
            for (int j = 0; j < grid[i].length;j++){
                minHigh = Math.min(rows[i],columns[j]);
                total += Math.abs(grid[i][j] - minHigh);
            }
        }

        return total;
    }
}