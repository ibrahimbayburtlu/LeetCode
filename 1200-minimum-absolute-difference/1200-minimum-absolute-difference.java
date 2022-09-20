class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> nums = new ArrayList<>();
        int min = 1000000;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                nums.clear();
                nums.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                nums.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return nums;
    }
}