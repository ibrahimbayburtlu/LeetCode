class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";

        int gcdval=gcd(str1.length(),str2.length());
        return str2.substring(0,gcdval);
    }

    int gcd(int x,int y){
        if(y==0) return x;
        else return gcd(y,x%y);
    }    
}

/*

EBOB. - EKOK kullanarak bu soru çözülür.

ABC ABC = str1

ABC = str2


AB AB AB = str1
AB AB = str2

AB

AB AB AB AB = str1

AB AB = str2

ABAB
*/