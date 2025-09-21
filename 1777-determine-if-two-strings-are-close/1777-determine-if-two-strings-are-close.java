import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> tableOne = new HashMap<>();
        HashMap<Character, Integer> tableTwo = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            tableOne.put(c1, tableOne.getOrDefault(c1, 0) + 1);
            tableTwo.put(c2, tableTwo.getOrDefault(c2, 0) + 1);
        }

        if (!tableOne.keySet().equals(tableTwo.keySet())) {
            return false;
        }

        List<Integer> controlListOne = new ArrayList<>(tableOne.values());
        List<Integer> controlListTwo = new ArrayList<>(tableTwo.values());

        Collections.sort(controlListOne);
        Collections.sort(controlListTwo);

        return controlListOne.equals(controlListTwo);
    }
}
