class Solution {
    public String reverseWords(String s) {
        String S = s.replaceAll("\\s+", " ");
        String[] arr = S.split(" ");
        String str = "";
        for (int i = arr.length - 1; i >= 0; i--){
            str += arr[i];
            str += " ";
        }

        return str.trim(); 
    }
}