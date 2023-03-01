class Solution {
    public double trimMean(int[] arr) {
        double n =( 0.05 * arr.length );
        Arrays.sort(arr);
        double sum = 0;
        for(int i = (int)n; i<arr.length-n ; i++)
            sum = sum + arr[i];
        double len  = arr.length - 2*n;
        sum  = sum / len;
        return sum;
    }
}