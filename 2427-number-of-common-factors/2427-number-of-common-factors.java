class Solution {
    public static int commonFactors(int a, int b) {
        int minNumber = Math.min(a,b);
        int count = 0;
        for(int i = minNumber; i > 0;i--){
            if(a % i == 0 && b % i == 0){
                count++;
            }
        }
        return count;
    }
}