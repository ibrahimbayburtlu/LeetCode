class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word : words) {
            if (word.length() >= pref.length()) {
                int control = 0;
                for (int i = 0; i < pref.length(); i++) {
                    if (pref.charAt(i) == word.charAt(i)) {
                        control++;
                    }
                }
                if (control == pref.length()){
                    count += 1;
                }
            }
        }
        return count;   
    }
}