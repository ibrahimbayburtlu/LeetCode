class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];
        for (int i = 1; i < candies.length;i++){
            if (maxCandies < candies[i]){
                maxCandies = candies[i];
            }
        }
        List<Boolean> arr = new ArrayList<>();
        for (int i = 0; i < candies.length;i++){
            arr.add(extraCandies + candies[i] >= maxCandies);
        }
        return arr;
    }
}