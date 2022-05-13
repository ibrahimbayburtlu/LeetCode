

int balancedStringSplit(char * s){
    
    int rightR = 0;
    int leftL = 0;
    int sum = 0;
    int i = 0;
    
    while(s[i] !='\0'){
     
        if(s[i] == 'R'){
            rightR++;
        }
        else if(s[i] == 'L'){
            leftL++;
        }
        if(rightR == leftL){
            sum++;
            rightR = 0;
            leftL = 0;
        }
        i++;
    }
    return sum;
}