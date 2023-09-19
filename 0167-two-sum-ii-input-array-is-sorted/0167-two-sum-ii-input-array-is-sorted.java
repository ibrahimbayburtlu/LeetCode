class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // O(logN)
        // binary Search kullanarak iki index kontrol edeceğim target göre design edeceğim.
        
        int start = 0;
        int end = numbers.length - 1;
        int[] arr = new int[2];
        while(start < end){
            int controlTotal = numbers[start] + numbers[end];
            if(controlTotal == target){
                arr[0] = start + 1;
                arr[1] = end + 1;
                break;
            }else if(controlTotal > target){
                end--;
            }else{
                start++;
            }
        }
        return arr;
    }
}