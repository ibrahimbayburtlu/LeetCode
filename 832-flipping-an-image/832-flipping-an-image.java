class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int left=0;
            int right=image[0].length-1;

            while(left<=right){
                int temp=image[i][left];
                image[i][left]=image[i][right]==1?0:1;
                image[i][right]=temp==1?0:1;
                left++;
                right--;
            }
        }
        return image;   
    }
}