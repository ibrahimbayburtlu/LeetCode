class Solution {
    public static int signFunc(int product){
        if (product > 0){
            return 1;
        } else if (product < 0) {
            return -1;
        }
        return 0;
    }
    public static int arraySign(int[] nums) {
        int product = 1;
        for (int num : nums){
            if (num > 0){
                product *= 1;
            } else if (num < 0) {
                product *= -1;
            }else {
                product *= 0;
            }
        }
        return signFunc(product);
    }
}