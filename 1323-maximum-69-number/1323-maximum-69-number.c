
int maximum69Number (int num){
    int n = num;
    int c = 0;
    int d = 1;
    
    while (n) {
        if (n%10 == 6)
            c = 3*d;
        n = n/10;
        d = d*10;
    }
    
    return num + c;
}