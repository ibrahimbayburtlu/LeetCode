class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int count = Integer.MIN_VALUE;
        int indis = 0;
        
        for(int i = 0;i < mat.length;i++){
            int oneCounter = 0;
            for(int j = 0; j < mat[i].length;j++){
                if(mat[i][j] == 1){
                    oneCounter++;
                }
            }
            if(oneCounter > count){
                count = oneCounter;
                indis = i;
            }
        }
        int[] arr = new int[2];
        arr[0] = indis;
        arr[1] = count;
        return arr;
    }
}