class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // i = 0,1,2
        for(int i = 0; i < n;i++){
            nums1[m + i] = nums2[i];
        }
        // [1,2,3,2,5,6] non-decreasing
        Arrays.sort(nums1);
        // [1,2,2,3,5,6] => nums1
    }
}