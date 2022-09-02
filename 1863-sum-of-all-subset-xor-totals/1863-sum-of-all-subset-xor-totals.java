class Solution {
    public int subsetXORSum(int[] nums) {
        return xorSubset(0, nums, 0);
    }

    public int xorSubset(int i, int[] nums, int currentXOR){
        if(i == nums.length) return currentXOR;
        int l = xorSubset(i + 1, nums, currentXOR^nums[i]);
        int r = xorSubset(i + 1, nums, currentXOR);
        return l + r;
        }  
    }