class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int total = 0;
        for (int i = 0; i < arr.length-2;i++){
            for (int j = i+1; j < arr.length-1;j++){
                for (int k = j+1; k < arr.length;k++){
                    boolean exp1 = Math.abs(arr[i] - arr[j]) <= a;
                    boolean exp2 = Math.abs(arr[j] - arr[k]) <= b;
                    boolean exp3 = Math.abs(arr[i] - arr[k]) <= c;
                    total += exp1 && exp2 && exp3 ? 1 : 0;
                }
            }
        }
        return total; 
    }
}