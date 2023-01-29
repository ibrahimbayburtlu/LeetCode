class NumArray {
    int prefixArray[] = null;
    public NumArray(int[] nums) {
        int sum = 0; int n = nums.length;
        prefixArray = new int[n];
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            prefixArray[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        if(left>0) return (prefixArray[right]-prefixArray[left-1]);
        return prefixArray[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */