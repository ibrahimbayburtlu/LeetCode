class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        List<Integer> arr = new ArrayList<>();
        if (r * c == mat[0].length * mat.length){
            for (int[] ints : mat) {
                for (int anInt : ints) {
                    arr.add(anInt);
                }
            }
            int[][] result = new int[r][c];
            int k = 0;
            for (int i = 0; i < r;i++){
                for (int j = 0; j < c;j++){
                    result[i][j] = arr.get(k++);
                }
            }
            return result;
        }else {
            return mat;
        }    
    }
}