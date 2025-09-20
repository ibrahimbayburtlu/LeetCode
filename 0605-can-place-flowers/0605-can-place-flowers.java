class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;

        for (int i=0;i< flowerbed.length;i=i+2){
            if(i+1<flowerbed.length && flowerbed[i+1] == 1)
                i++;
            else if(flowerbed[i] == 0){
                n--;
                if(n<=0)
                    return true;
            }
        }
        return false;
    }
}

/*
1 0 0 0 1
1 0 1 0 1

1 0 0 0 1
1 0 1 0 1
*/