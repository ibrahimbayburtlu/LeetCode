class Solution {
    public String defangIPaddr(String address) {
        String word = "";
        for (int i = 0; i < address.length();i++){
            if (address.charAt(i) == '.'){
                word += "[.]";
            }else{
                word += address.charAt(i);
            }
        }
        return word;   
    }
}