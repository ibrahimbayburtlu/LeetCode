class Solution {
    
    
    private String reverse(String a){
        StringBuilder word = new StringBuilder();
        for (int i = a.length()-1; i >= 0;i--){
            word.append(a.charAt(i));
        }
        return word.toString();
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < arr.length-1;i++){
            word.append(reverse(arr[i]));
            word.append(" ");
        }
        word.append(reverse(arr[arr.length-1]));
        return word.toString();    
    }
}