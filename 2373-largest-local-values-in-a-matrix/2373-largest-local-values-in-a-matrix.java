class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] arr = new int[n-2][n-2];
        for (int i = 0; i < n-2;i++){
            for (int j = 0; j < n-2;j++){
                arr[i][j] = maxValue(grid,i,j);
                }
            }
            return arr;
        }
    public int maxValue(int[][] grid, int row , int col){
        int maxNumber = 0;
        for (int i = row; i < row + 3;i++){
            for (int j = col; j < col + 3; j++){
                maxNumber = Math.max(grid[i][j], maxNumber);
                }
            }
            return maxNumber;
        } 
    }