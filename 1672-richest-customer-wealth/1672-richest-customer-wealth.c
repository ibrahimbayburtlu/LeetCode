

int maximumWealth(int** accounts, int accountsSize, int* accountsColSize){
    
    
    
        int res = 0;
        for(int i =0;i<accountsSize;i++){
            int temp = 0;
            for(int j = 0;j<*accountsColSize;j++){
                temp+=accounts[i][j];
            }
            if(temp > res) res = temp;
        }
        return res;
}
