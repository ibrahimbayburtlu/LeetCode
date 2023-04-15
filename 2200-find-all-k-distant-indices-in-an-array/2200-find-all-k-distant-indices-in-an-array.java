class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int end = Math.min(i + k, nums.length - 1);
                for (int j = Math.max(i - k, 0); j <= end; j++) {
                    set.add(j);
                }
            }
        }
        return new ArrayList<>(set);      
    }
}