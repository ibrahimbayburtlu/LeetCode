class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String word = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(word) != 0)
                word = word.substring(0,word.length()-1);
            i++;
        }
        return word;   
    }
}