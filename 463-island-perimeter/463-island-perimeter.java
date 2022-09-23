class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0){
            return 0;
        }
        int area = 0;
        for (int i = 0; i < grid.length;i++){
            for (int j = 0; j < grid[0].length;j++){
                if (grid[i][j] == 1){
                    area += 4;
                    if (i > 0 && grid[i-1][j] == 1){
                        area -= 2;
                    }
                    if (j > 0 && grid[i][j-1] == 1){
                        area -= 2;
                    }
                }
            }
        }
        return area;    
    }
}