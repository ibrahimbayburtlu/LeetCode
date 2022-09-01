class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int total = 0;
        int sum = 0;
        for (int i = 0; i < words.length;i++){
            boolean control = true;
            for (int j = 0; j < words[i].length();j++){
                if (allowed.indexOf(words[i].charAt(j)) < 0){
                    control = false;
                }
            }
            if (control == true){
                sum += 1;
            }
        }
        return sum;  
    }
}