class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] arr = Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        for (int i = 0; i < heights.length;i++){
            if (heights[i] != arr[i]){
                count += 1;
            }
        }
        return count;    
    }
}