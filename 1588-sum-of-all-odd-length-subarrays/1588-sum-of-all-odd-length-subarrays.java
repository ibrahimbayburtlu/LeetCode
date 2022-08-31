class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length;i+=1){
            total += ((i+1)*(arr.length-i)+1)/2 * arr[i];
        }
        return total;      
    }
}