class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            n /= 10;
            if (num % rem == 0){
                count++;
            }
        }
        return count;   
    }
}