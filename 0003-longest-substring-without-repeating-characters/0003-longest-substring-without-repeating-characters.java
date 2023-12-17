import java.util.Hashtable;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> table = new Hashtable<>();

        int maxLength = 0;
        String resultString = "";

        for(int i = 0; i < s.length();i++){

            if(!table.containsKey(s.charAt(i))){
                resultString += s.charAt(i);
            }else{
                maxLength = Math.max(maxLength,resultString.length());
                int n = resultString.indexOf(s.charAt(i));
                resultString = resultString.substring(n+1);
                resultString += s.charAt(i);
            }
            table.put(s.charAt(i),1);
        }
        return Math.max(resultString.length(),maxLength);
    }
}