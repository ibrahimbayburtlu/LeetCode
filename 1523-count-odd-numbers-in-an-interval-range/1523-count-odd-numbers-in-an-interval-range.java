class Solution {
    public int countOdds(int low, int high) {
        if(low==high)
        return low%2!=0?1:0;
        int c=0;
        if(low%2!=0)c++;
        if(high%2!=0)c++;
        int diff=(high-low)-1;
        c+=low%2!=0?diff/2:(diff%2!=0?(diff/2)+1:diff/2);
        return c;  
    }
}