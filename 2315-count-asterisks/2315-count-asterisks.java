class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) == '|'){
                count+=1;
            }
            if (count % 2 == 0 && s.charAt(i) == '*'){
                temp += 1;
            }
        }
        return temp;
    }
}