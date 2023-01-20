class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=0,n=nums.length;i<n-2;i++)
            if(nums[n-i-1]<nums[n-i-2]+nums[n-i-3])
                return nums[n-i-1]+nums[n-i-2]+nums[n-i-3];
        return 0;    
    }
}