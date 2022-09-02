class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        for (int i = 0; i < n;i++){
            arr[i] = i < nums1.length ? nums1[i] : nums2[i - nums1.length];
        }
        Arrays.sort(arr);
        return n % 2 == 0 ? (double)(arr[(n/2)-1] + arr[n/2])/2 : (double) arr[(n-1)/2];  
    }
}