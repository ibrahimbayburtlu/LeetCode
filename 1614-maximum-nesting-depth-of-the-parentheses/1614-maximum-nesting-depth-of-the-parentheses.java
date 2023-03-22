class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) == '('){
                stack.push('(');
                count++;
            } else if (s.charAt(i) == ')') {
                stack.push(')');
                count--;
            }
            if (count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;   
    }
}