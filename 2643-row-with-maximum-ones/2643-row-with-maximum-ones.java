class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int count = Integer.MIN_VALUE;
        int indis = -1;
        
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
        return new int[]{indis,count};
    }
}