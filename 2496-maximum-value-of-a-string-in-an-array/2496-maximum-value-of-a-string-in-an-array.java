class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs){
            boolean charFlag = false;
            boolean numberFlag = false;
            for (int j = 0; j < str.length();j++){
                if ((int) str.charAt(j) > 96 && (int) str.charAt(j) < 128) {
                    charFlag = true;
                } else if ((int) str.charAt(j) > 47 && (int) str.charAt(j) < 58) {
                    numberFlag = true;
                }
            }
            if (numberFlag && charFlag && str.length() > max){
                max = str.length();
            } else if (numberFlag && !charFlag && Integer.valueOf(str) > max) {
                max = Integer.valueOf(str);
            }
            else if (charFlag && !numberFlag &&str.length() > max){
                max = str.length();
            }
        }
        return max;  
    }
}