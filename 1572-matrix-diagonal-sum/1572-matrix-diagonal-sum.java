class Solution {
    public int diagonalSum(int[][] mat) {
        int total = 0;
        int n = mat.length;
        for (int i = 0; i < n;i++) {
            total += mat[i][i];
            total += mat[i][n - i - 1];
        }
        return n % 2 == 0 ? total : total - mat[(n-1)/2][(n-1)/2];    
    }
}