class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length;i++){
            int count = 0;
            for (int j = 0; j < arr.length;j++){
                if (arr[i] == arr[j]){
                    count += 1;
                }
            }
            map.put(arr[i],count);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();   
    }
}