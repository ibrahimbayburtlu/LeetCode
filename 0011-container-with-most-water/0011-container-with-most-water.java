class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int finish = height.length - 1;
        
        int y = 0;
        int x = 0;

        int maxAreaResult = 0;
        while(start <= finish){
            x = finish - start;
            y = Math.min(height[start],height[finish]);
            maxAreaResult = Math.max(maxAreaResult, x*y );
            if(height[start] >= height[finish]){
                finish--;
            }else{
                start++;
            }

        }
        return maxAreaResult;
    }
}
