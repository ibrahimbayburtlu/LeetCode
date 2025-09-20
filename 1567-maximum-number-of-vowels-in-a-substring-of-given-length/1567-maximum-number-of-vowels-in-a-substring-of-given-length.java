class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) count++;
        }
        int maxVowelsNum = count;

        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) count++;
            if (isVowel(s.charAt(i - k))) count--;
            if (count > maxVowelsNum) maxVowelsNum = count;
        }

        return maxVowelsNum;
    }

    private boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}


/*
Sliding Window

a b c i i i d e f k=3 

abc 
bci
cii
iii
iid
ide
def

vowelsControl(cii){
    return 2;
}


*/