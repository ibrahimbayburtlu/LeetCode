class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // convert string into char array and access the characters using for each loop.
        for (char ch : s.toCharArray()) {
            // check ch
            switch (ch) {
                // open bracket then push it in stack.
                // close bracket then pop the item and compare.
                case '(', '{', '[' -> stack.push(ch);
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(')

                    // if the stack is empty then it means string have no open bracket.
                    // hence it is invalid.
                    {
                        return false;
                    }
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();   
    }
}