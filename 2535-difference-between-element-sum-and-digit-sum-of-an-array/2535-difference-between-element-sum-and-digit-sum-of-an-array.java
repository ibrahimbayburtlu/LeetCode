class Solution{
    public static int digitCalculator(int num){
        int total = 0;
        while (num > 0){
            total += num % 10;
            num /= 10;
        }
        return total;
    }
    public static int differenceOfSum(int[] nums) {

        int absoluteTotal = 0;
        int digitTotal = 0;

        for (int num : nums) {
            absoluteTotal += num;
            digitTotal += digitCalculator(num);
        } 
        return Math.abs(absoluteTotal - digitTotal);
    }
}