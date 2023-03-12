class Solution {
    public boolean halvesAreAlike(String s) {
        String a = "";
        String b = "";
        int count = 0;
        for (int i = 0; i < s.length();i++){
            if (i < s.length() / 2){
                a += s.charAt(i);
            }else {
                b += s.charAt(i);
            }
        }
        
        for (int i = 0; i < a.length();i++){
        if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
            || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U'){
                count ++;
            }
            if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o'
            || b.charAt(i) == 'u' || b.charAt(i) == 'A' || b.charAt(i) == 'E' || b.charAt(i) == 'I' || b.charAt(i) == 'O' || b.charAt(i) == 'U') {
                count --;
            }
        }
        return count == 0 ;    
    }
}