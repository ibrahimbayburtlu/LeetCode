class Solution {
    public int dayOfYear(String date) {
        int m[]= {31,28,31,30,31,30,31,31,30,31,30,31};
        int y=Integer.parseInt(date.substring(0,4));
        if(y%4==0&&y!=1900)
        m[1]=m[1]+1;
        int M=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8,10));
        int day=0;
        for(int i=0;i<M-1;i++)
        day=day+m[i];
        day=day+d;
        return day;
    }
}