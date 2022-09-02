class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] arr = new int[rectangles.length];
        int maxNumber = Math.min(rectangles[0][1],rectangles[0][0]);
        for (int i = 0; i < rectangles.length;i++){
            int minNumber = Math.min(rectangles[i][0],rectangles[i][1]);
            maxNumber = minNumber > maxNumber ? minNumber : maxNumber;
            arr[i] = minNumber;
        }
        int count = 0;
        for (int i = 0; i < arr.length;i++){
            if (maxNumber == arr[i]){
                count += 1;
            }
        }
        return count;   
    }
}