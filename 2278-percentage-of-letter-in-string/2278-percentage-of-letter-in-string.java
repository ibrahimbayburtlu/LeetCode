class Solution {
    public int percentageLetter(String s, char letter) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (char c : arr) {
            if (c == letter) {
                count += 1;
            }
        }
        return 100 * count / arr.length;  
    }
}