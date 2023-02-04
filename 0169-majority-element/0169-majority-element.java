class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : nums) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for(Integer key:keySet){
            if(map.get(key)>nums.length/2){
                num = key;
            }
        }
        return num;   
    }
}