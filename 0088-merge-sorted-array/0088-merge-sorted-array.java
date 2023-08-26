class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // i = 3,4,5
        for(int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
    /*
    class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        for i in range(n):
            nums1[m+i]  = nums2[i]
        nums1.sort()
        return nums1
    */
}