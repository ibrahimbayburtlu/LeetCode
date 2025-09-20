class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bigCandiesList = new ArrayList();
        
        int maxCandieNum = 0;
        for(int candie:candies){
            maxCandieNum = Math.max(maxCandieNum,candie);
        }

        for(int candie: candies){
            if(candie + extraCandies >= maxCandieNum){
                bigCandiesList.add(true);
            }else{
                bigCandiesList.add(false);
            }
        }
        return bigCandiesList;


    }
}

/*
2 3 5 1 3
5 6 8 4 6
t t t f t


*/