class Solution {
    public int[] sumZero(int n) {
        int other = n / 2;
        int[] arr = new int[n];
        if (n %2 == 1){
            arr[n-1] = 0;
        }
        for (int i = 0; i < n / 2;i++){
            arr[i] = (i+1);
            arr[i+other] = -1*(i+1);
        }
        return arr;   
    }
}