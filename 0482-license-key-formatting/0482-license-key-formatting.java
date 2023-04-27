class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '-')
                continue;
            if (ch >= 'a')
                ch = (char) (ch - 'a' + 'A');
            if (counter == k) {
                counter = 1;
                sb.append('-').append(ch);
            } else {
                sb.append(ch);
                ++counter;
            }
        }
        return sb.reverse().toString();    
    }
}