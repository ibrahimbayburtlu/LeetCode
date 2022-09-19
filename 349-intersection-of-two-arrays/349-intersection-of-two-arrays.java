class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hash_Set = new HashSet<Integer>();
        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k) {
                    hash_Set.add(j);
                }
            }
        }
        int[] arr = new int[hash_Set.size()];
        int i = 0;
        for (int elem : hash_Set){
            arr[i++] = elem;
        }
        return arr;  
    }
}