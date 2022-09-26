class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        int k = 0;
        for (int value : arr2) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == value) {
                    arr[k] = arr1[j];
                    arr1[j] = -1;
                    k += 1;
                }
            }
        }
        Arrays.sort(arr1);
        for (int j : arr1) {
            if (j != -1) {
                arr[k] = j;
                k += 1;
            }
        }
        return arr;   
    }
}