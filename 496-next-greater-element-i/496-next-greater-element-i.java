class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        Arrays.fill(arr,-1);
        for (int i = 0; i < nums1.length;i++){
            int index = 0;
            for (int j = 0; j < nums2.length;j++){
                if (nums1[i] == nums2[j]){
                    index = j;
                }
            }
            for (int j = index; j < nums2.length;j++){
                if (nums1[i] < nums2[j]){
                    arr[i] = arr[i] == -1 ? nums2[j] : arr[i];
                }
            }
        }
        return arr;    
    }
}