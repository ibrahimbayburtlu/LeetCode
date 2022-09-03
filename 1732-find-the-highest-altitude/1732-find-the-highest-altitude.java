class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        arr[0] = 0;
        int maxNumber = arr[0];
        for (int i = 1; i < gain.length+1;i++){
            arr[i] = gain[i-1] + arr[i-1];
            maxNumber = arr[i] > maxNumber ? arr[i] : maxNumber;
        }
        return maxNumber;   
    }
}