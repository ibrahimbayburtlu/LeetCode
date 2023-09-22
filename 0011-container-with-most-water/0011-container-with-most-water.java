class Solution {
    public int maxArea(int[] height) {

        // vertical
        // horizontal
        
        // Time : O(logN)
        // Complexity : O(1)
        
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        while(left < right){
            int currentWater = (right - left) * Math.min(height[left],height[right]);
            maxWater = Math.max(currentWater,maxWater);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}