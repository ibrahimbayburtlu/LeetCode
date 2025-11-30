class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bigCandiesList = new ArrayList<>();

        int maxCandiesNum = 0;

        for(int candie : candies){
            maxCandiesNum = Math.max(maxCandiesNum,candie);
        }

        for(int candie : candies){
            if (candie + extraCandies >= maxCandiesNum){
                bigCandiesList.add(true);
            }else{
                bigCandiesList.add(false);
            }
        }
        return bigCandiesList;
    }
}
