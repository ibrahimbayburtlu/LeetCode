class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())){
            return true;
        }
        String temp = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        return word.equals(temp);   
    }
}