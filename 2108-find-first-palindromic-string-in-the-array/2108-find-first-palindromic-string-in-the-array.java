class Solution {
    public String firstPalindrome(String[] words) {
        int count = 0;
        for (String elem:words){
            int left = 0;
            int right = elem.length()-1;
            int control = 0;
            while (left < right){
                if (elem.charAt(left) != elem.charAt(right)){
                    control = 1;
                    break;
                }
                left += 1;
                right -= 1;
            }
            if (control == 0){
                return elem;
            }
        }
        return ""; 
    }
}