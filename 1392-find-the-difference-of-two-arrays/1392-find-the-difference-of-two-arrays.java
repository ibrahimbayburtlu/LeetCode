import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> listResult = new ArrayList<>();

        List<Integer> nums1List = new ArrayList<>();
        List<Integer> nums2List = new ArrayList<>();

        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            nums2Set.add(nums2[i]);
        }

        for (int value : nums1Set) {
            if (!nums2Set.contains(value)) {
                nums1List.add(value);
            }
        }
        listResult.add(nums1List);

        for (int value : nums2Set) {
            if (!nums1Set.contains(value)) {
                nums2List.add(value);
            }
        }
        listResult.add(nums2List);

        return listResult;
    }
}
