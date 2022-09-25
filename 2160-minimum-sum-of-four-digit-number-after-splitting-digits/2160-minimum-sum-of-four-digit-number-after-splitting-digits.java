class Solution {
    public int minimumSum(int num) {
        int number1 = num % 10;
        int number2 = (num % 100) / 10;
        int number3 = (num %1000) / 100;
        int number4 = num / 1000;
        int[] arr = new int[]{number1,number2,number3,number4};
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        int total = arr[3] + arr[0] * 10 + arr[2] + arr[1]*10;
        return total;   
    }
}