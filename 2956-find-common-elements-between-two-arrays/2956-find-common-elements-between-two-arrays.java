class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> setOne = new HashSet<>();
        HashSet<Integer> setTwo = new HashSet<>();
        int countOne = 0;
        int countTwo = 0;
        int[] arr = new int[2];
        for (int k : nums1) {
            setOne.add(k);
        }
        for (int i : nums2) {
            setTwo.add(i);
        }
        for (int i : nums1) {
            if (setTwo.contains(i)) {
                countOne++;
            }
        }
        for (int i : nums2) {
            if (setOne.contains(i)) {
                countTwo++;
            }
        }

        arr[0] = countOne;
        arr[1] = countTwo;
        return arr;    
    }
}