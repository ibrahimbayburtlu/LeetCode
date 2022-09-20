class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums[0].length; j++) {
            list.add(nums[0][j]);
        }
        for (int i = 1; i < nums.length; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < nums[i].length; j++) {
                if (list.contains(nums[i][j])) {
                    list1.add(nums[i][j]);
                }
            }
            list = list1;
        }
        Collections.sort(list);
        return list;   
    }
}