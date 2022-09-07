class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int maxNumber = -1;
        for (int i = arr.length-1;i >= 0;i--){
            result[i] = maxNumber;
            maxNumber = Math.max(arr[i],maxNumber);
        }
        return result;
    }
}