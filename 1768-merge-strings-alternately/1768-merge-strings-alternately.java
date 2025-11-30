class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder word = new StringBuilder();
        if(word1.length() == word2.length()){
            for(int i = 0; i < word1.length();i++){
                word.append(word1.charAt(i));
                word.append(word2.charAt(i));
            }
        }else if(word1.length() > word2.length()){
            for(int i = 0; i < word2.length();i++){
                word.append(word1.charAt(i));
                word.append(word2.charAt(i)); 
            }
            word.append(word1.substring(word2.length()));
        }else{
            for(int i = 0; i < word1.length();i++){
                word.append(word1.charAt(i));
                word.append(word2.charAt(i)); 
            }
            word.append(word2.substring(word1.length()));
        }
        return word.toString();
    }
}