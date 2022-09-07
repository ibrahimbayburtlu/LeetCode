class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for (int num : nums){
            if (arr.contains(num)){
                arr.remove(num);
            }else{
                arr.add(num);
            }
        }
        return arr.size() == 0; 
    }
}