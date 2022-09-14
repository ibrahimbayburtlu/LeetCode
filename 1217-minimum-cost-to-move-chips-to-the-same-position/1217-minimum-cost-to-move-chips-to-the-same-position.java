class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for(int i:position)
            even += (i%2==0) ? 1 : 0; // get # of evens
        return even > position.length/2 ? position.length-even : even; 
    }
}