class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> booleanList = new ArrayList<>();
        int[][] arr = new int[l.length][];
        for(int j = 0; j < l.length;j++){
            int[] innerArr = new int[r[j] - l[j] + 1];
            int value = l[j];
            if (r[j] + 1 - l[j] >= 0) System.arraycopy(nums, l[j], innerArr, l[j] - value, r[j] + 1 - l[j]);
            arr[j] = innerArr;
        }

        List<Boolean> listBoolean = new ArrayList<>();
        for (int[] ints : arr) {
            Arrays.sort(ints);
            int arithmetic = ints[1] - ints[0];
            boolean flag = true;
            for (int j = 0; j < ints.length - 1; j++) {
                if (ints[j + 1] - ints[j] != arithmetic) {
                    flag = false;
                }
            }
            listBoolean.add(flag);
        }
        return listBoolean;
    }
}