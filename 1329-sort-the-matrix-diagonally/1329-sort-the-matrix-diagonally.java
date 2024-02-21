class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length; // row length
        int col = mat[0].length; // column length

        for (int i = 0; i < row; i++) {
            sortDiagonal(mat, i, 0);
        }
        for (int j = 1; j < col; j++) {
            sortDiagonal(mat, 0, j);
        }
        return mat;
    }

    private static void sortDiagonal(int[][] mat, int startRow, int startCol) {
        int row = mat.length;
        int col = mat[0].length;


        List<Integer> diagonalElements = new ArrayList<>();
        for (int i = startRow, j = startCol; i < row && j < col; i++, j++) {
            diagonalElements.add(mat[i][j]);
        }


        Collections.sort(diagonalElements);


        for (int i = startRow, j = startCol, k = 0; i < row && j < col; i++, j++, k++) {
            mat[i][j] = diagonalElements.get(k);
        }
        
    }
}