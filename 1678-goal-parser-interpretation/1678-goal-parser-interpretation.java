class Solution {
    public String interpret(String command) {
        String result = "";
        for (int i = 0; i < command.length();i++){
            if (command.charAt(i) == 'G'){
                result  += 'G';
            }
            if (command.startsWith("()", i)){
                result += 'o';
            }
            if (command.startsWith("(al)", i)){
                result += "al";
            }
        }
        return result;   
    }
}