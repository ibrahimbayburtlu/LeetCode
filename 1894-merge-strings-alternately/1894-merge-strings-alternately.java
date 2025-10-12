class Solution {
    public String mergeAlternately(String word1, String word2) {
        int maxLength = word1.length() + word2.length();
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < maxLength; i++){
            if(i < word1.length()){
                word.append(word1.charAt(i));
            }
            if(i < word2.length()){
                word.append(word2.charAt(i));
            }
        }
        return word.toString();
    }
}