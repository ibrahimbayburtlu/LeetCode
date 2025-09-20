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

/*

1 8 6 2 5 4 8 3 7

y -> 8 ve 7 : Math.min(8,7) = 7
x -> 1 index ile 8.index = 




*/

