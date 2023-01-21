class Solution {
    public String replaceDigits(String s) {
        String word = "";
        for (int i= 0;i < s.length();i+=1){
            if (i % 2 == 1){
                word += (char)(Integer.parseInt(String.valueOf(s.charAt(i))) + (int) s.charAt(i-1));
            }
            else {
                word += s.charAt(i);
            }
        }
        return word;   
    }
}