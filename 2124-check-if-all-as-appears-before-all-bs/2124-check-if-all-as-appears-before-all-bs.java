class Solution {
    public boolean checkString(String s) {
        int maxA = 0;
        int minB = s.length();
        for (int i = 0; i< s.length();i++){
            if (s.charAt(i) == 'a' && i > maxA){
                maxA = i;
            }
            if (s.charAt(i) == 'b' && i < minB){
                minB = i;
            }
        }
        return maxA <= minB;
    }
}