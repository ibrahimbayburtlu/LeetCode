class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 1) {
                sum += num;
            } else if (map.get(num) == 2) {
                sum -= num;
            }
        }
        System.out.print(map);
        return sum;   
    }
}