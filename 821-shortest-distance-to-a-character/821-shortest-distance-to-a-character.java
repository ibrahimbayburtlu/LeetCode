class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) == c){
                arr.add(i);
            }
        }
        int[] newArr = new int[s.length()];
        for (int i = 0; i < s.length();i++){
            int minimum = s.length();
            for (int j = 0; j < arr.size();j++){
                if (Math.abs(i-arr.get(j)) < minimum){
                    minimum = Math.abs(i-arr.get(j));
                }
            }
            newArr[i] = minimum;
        }
        return newArr;   
    }
}