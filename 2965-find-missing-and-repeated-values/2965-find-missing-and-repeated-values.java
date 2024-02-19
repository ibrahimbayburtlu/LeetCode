class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid[0].length;
        Set<Integer> hashset = new HashSet<>();
        int duplicateNumber = 0;

        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!hashset.contains(ints[j])) {
                    hashset.add(ints[j]);
                } else {
                    duplicateNumber = ints[j];
                }
            }
        }
        
        int missingNumber = 0;
        for (int i = 0; i < n;i++){
            if (!hashset.contains(i + 1)){
                missingNumber = i + 1;
            }
        }
        int[] arr = new int[2];
        arr[0] = duplicateNumber;
        arr[1] = missingNumber;
        return arr;
    }
}