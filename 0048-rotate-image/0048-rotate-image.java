class Solution {
    public void rotate(int[][] matrix) {
        // Transpose
        for (int i = 0; i < matrix.length;i++){
            for (int j = i; j < matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Swap
        for (int i = 0; i < matrix.length;i++){
            int low = 0;
            int high = matrix.length - 1;
            while (low < high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }  
    }
}