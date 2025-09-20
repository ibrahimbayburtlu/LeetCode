class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int i = 0;

        while (i < n) {
            char c = chars[i];
            int j = i;
            while (j < n && chars[j] == c) j++;
            int cnt = j - i;

            chars[write++] = c;

            if (cnt > 1) {
                String s = String.valueOf(cnt); 
                for (int k = 0; k < s.length(); k++) {
                    chars[write++] = s.charAt(k);
                }
            }

            i = j; 
        }

        return write;
    }
}
