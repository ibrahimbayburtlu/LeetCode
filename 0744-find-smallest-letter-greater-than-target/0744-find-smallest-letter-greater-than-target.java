class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int minChar =  123;
        for (int i = 0 ; i < letters.length;i++){
            if ((int) target < (int) letters[i]){
                minChar = Math.min((int) letters[i],(int) minChar);
            }
        }
        if (minChar == 123){
            return (char) letters[0];
        }else {
            return (char) minChar;
        }
    }
}