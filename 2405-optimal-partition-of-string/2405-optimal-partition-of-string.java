class Solution {
    public int partitionString(String s) {
        String word = "";
        int count = 0;
        for (int i = 0; i < s.length();i++){
            if (word.contains(String.valueOf(s.charAt(i)))){
                word = "";
                count++;
            }
            word += s.charAt(i);
        }
        return ++count;   
    }
}