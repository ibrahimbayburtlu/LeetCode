class Solution {
    public String mergeAlternately(String word1, String word2) {
        int maxLength = Math.max(word1.length(),word2.length()); // 4 > 2 : 4
        StringBuilder sb = new StringBuilder(); // --> Her seferinde yeni String oluşturmak istemedim.

        for(int i = 0; i < maxLength;i++){
            if(i < word1.length()){ 
                sb.append(word1.charAt(i)); // a b c d
            }
            if(i < word2.length()){
                sb.append(word2.charAt(i)); // p q 
            }
        }
        return sb.toString();
    }
}