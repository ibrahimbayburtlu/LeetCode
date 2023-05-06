class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        Arrays.sort(arr);
        int x = arr[arr.length - 1];
        for (int i = 0; i < newArr.length;i++){
            if (newArr[i] == x){
                return i;
            }
        }
        return -1;   
    }
}