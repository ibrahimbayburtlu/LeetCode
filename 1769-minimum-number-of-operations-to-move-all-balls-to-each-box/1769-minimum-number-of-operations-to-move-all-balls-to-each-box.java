class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        for (int i = 0; i <boxes.length();i++){
            for (int k = 0; k < boxes.length();k++){
                if (k != i && boxes.charAt(k) == '1'){
                    arr[i] += Math.abs(k - i);
                }
            }
        }
        return arr;    
    }
}