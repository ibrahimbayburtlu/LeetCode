class Solution {
    public double trimMean(int[] arr) {        
        double n = (0.05 * arr.length);
        Arrays.sort(arr);
        double sum = 0.0;
        for (int i = (int) n; i < arr.length - n; i++){
            sum += arr[i];
        }
        return sum / (arr.length - 2*n);
    }
}