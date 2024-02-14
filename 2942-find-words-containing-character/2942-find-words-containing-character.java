class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // Time - Complexity : O(n^2)
        // Space - Complexity : O(1)
        
        List<Integer> list = new ArrayList();
        
        for(int i = 0; i < words.length;i++){
            boolean controlFlag = false;
            for(int j = 0 ; j < words[i].length();j++){
                if(words[i].charAt(j) == x){
                    controlFlag = true;
                }
            }
            if(controlFlag){
                list.add(i);
            }
        }
        return list;
    }
}