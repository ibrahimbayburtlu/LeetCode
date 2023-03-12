class Solution {
    public boolean halvesAreAlike(String s) {
        String a = "";
        String b = "";
        int count = 0;
        String lowerString = s.toLowerCase();
        for (int i = 0; i < lowerString.length();i++){
            if (i < lowerString.length() / 2){
                a += lowerString.charAt(i);
            }else {
                b += lowerString.charAt(i);
            }
        }


        for (int i = 0; i < a.length();i++){
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
                count ++;
            }
            if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u' ) {
                count --;
            }
        }
        return count == 0 ;  
    }
}