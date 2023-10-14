class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Iterate through the matrix to mark the zero rows and                 columns
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 0) {
                    if (row == 0) {
                        firstRowHasZero = true;
                    }
                    if (col == 0) {
                        firstColHasZero = true;
                    }
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Iterate through the matrix to update the cells to zero               if they're in a zero row or column
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Update the first row and column if they have zeroes
        if (firstRowHasZero) {
            for (int col = 0; col < n; col++) {
                matrix[0][col] = 0;
            }
        }

        if (firstColHasZero) {
            for (int row = 0; row < m; row++) {
                matrix[row][0] = 0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));   
    }
}