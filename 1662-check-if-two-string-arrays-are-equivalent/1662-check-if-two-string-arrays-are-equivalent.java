class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        /*
        1.Solution
        String arr1 = "";
        String arr2 = "";
        for (int i = 0; i < word1.length;i++){
            arr1 += word1[i];
        }
        for (int i = 0; i < word2.length;i++){
            arr2 += word2[i];
        }
        System.out.println(arr1);
        System.out.println(arr2);
        return arr1.equals(arr2) ? true : false;
         */
        // 2.Solution
        return(String.join("", word1).equals(String.join("", word2)));  
    }
}