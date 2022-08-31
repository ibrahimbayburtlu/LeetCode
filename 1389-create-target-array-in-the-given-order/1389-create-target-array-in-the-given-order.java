class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> mylist = new ArrayList<>();
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length;i++){
            mylist.add(index[i],nums[i]);
        }
        for (int i = 0; i < arr.length;i++){
            arr[i] = mylist.get(i);
        }
        return arr;   
    }
}