class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setArr = new HashSet();

        for(int i = 0; i < nums.length; i++){
            setArr.add(nums[i]);
        }
        return setArr.size() != nums.length ? true : false;
    }
}