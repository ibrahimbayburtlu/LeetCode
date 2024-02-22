class Solution {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> result = new ArrayList<>();

        for(int i = 0; i < l.length; i++) {
            result.add(checkArithmetic(nums, l[i], r[i]));
        }

        return result;
    }

    private static boolean checkArithmetic(int[] nums, int left, int right) {
        int[] subarray = Arrays.copyOfRange(nums, left, right + 1);
        Arrays.sort(subarray);

        int difference = subarray[1] - subarray[0];
        for (int j = 1; j < subarray.length - 1; j++) {
            if (subarray[j + 1] - subarray[j] != difference) {
                return false;
            }
        }
        return true;
    }
}