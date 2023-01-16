class Solution {
    public boolean canBeIncreasing(int[] nums) {
    
        ArrayList<Integer> arr = new ArrayList<>();

        // array copy of ArrayList
        for (int num : nums) {
            arr.add(num);
        }

        // a elem remove ArrayList and send control !
        for (int i = 0; i< nums.length;i++){
            arr.remove(i);
            if (control(arr)){
                return true;
            }
            arr.add(i,nums[i]);
        }
        return false;
    }

    // Control Method
    public static boolean control(ArrayList<Integer> arr) {
        boolean flag = true;
        for(int i = 1; i < arr.size();i++){
            if (arr.get(i) <= arr.get(i - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}