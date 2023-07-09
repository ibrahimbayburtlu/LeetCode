class Solution {
    public String reverseVowels(String s) {
        String word = "";
        StringBuilder vowels = new StringBuilder();
        int j = 0;
        for (int i = s.length() - 1 ; i >= 0 ;i--){
            if (checkVowels(s.charAt(i))){
                vowels.append(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length();i++){
            if (!checkVowels(s.charAt(i))){
                word += s.charAt(i);
            }else {
                word += vowels.charAt(j);
                j++;
            }
        }
        return word;
    }
    public static boolean checkVowels(char s){
        if (s == 'a' || s== 'e' || s== 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' ||               s == 'U'){
            return true;
        }
        return false;
    }
}