class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // ABABAB + ABAB == ABAB + ABABAB
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        // 6 3
        int gcdLength = gcd(str1.length(),str2.length());
        return str1.substring(0,gcdLength);
    }

    private int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
}