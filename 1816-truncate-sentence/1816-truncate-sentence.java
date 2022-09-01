class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String returnArr = "";
        for (int i = 0; i < k-1;i++){
            returnArr += arr[i]+" ";
        }
        returnArr += arr[k-1];
        return returnArr;   
    }
}