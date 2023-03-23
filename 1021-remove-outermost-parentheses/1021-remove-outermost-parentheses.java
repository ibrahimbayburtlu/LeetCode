class Solution {
    public String removeOuterParentheses(String s) {
        String S = "";
        int counter = 0;
        for (int i = 0; i < s.length();i++) {
            if (s.charAt(i) == '(' && counter++ > 0){
                S += '(';
            } else if ((s.charAt(i) == ')' && counter-- > 1)) {
                S += ')';
            }
        }
        return S;
        }
    }