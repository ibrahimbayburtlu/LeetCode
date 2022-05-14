

int numberOfMatches(int n){

    int total = 0;
    
    if(n == 1)
        return total;
    
    while(n != 1){
        
        if(n % 2 == 0){
            n = (n /2);
            total += n;
        }
        else{
            total +=(n-1)/2;
            n = (n/2) + 1;
        }
    }
    return total;
}