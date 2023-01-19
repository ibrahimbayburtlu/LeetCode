class Solution {
    public int subtractProductAndSum(int n) {
        int total = 0;
        int multiply = 1;
        while (n > 0){
            multiply *= n % 10;
            total += n % 10;
            n = n / 10;
        }
        return multiply - total;   
    }
}