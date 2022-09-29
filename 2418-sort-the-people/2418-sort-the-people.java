class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> arr = new HashMap<>();
        for (int i = 0; i < heights.length;i++){
            arr.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int index = 0;
        String[] result = new String[names.length];
        for (int i = heights.length-1; i >= 0; i--){
            result[index++] = arr.get(heights[i]);
        }
        return result;   
    }
}