class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> wordOneHash = new HashMap<Character, Integer>();
        HashMap<Character, Integer> wordTwoHash = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) wordOneHash.put(c, wordOneHash.getOrDefault(c, 0) + 1);
        for (char c : t.toCharArray()) wordTwoHash.put(c, wordTwoHash.getOrDefault(c, 0) + 1);

        for (char key : wordTwoHash.keySet()) {
            if (!wordOneHash.containsKey(key) || wordOneHash.get(key) != wordTwoHash.get(key)) {
                return key;
            }
        }
        
        return '\0';
    }
}
