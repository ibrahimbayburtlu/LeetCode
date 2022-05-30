

int fib(int n){

    int x1;
    int x2;
    int nextTerm;
    if(n == 0)
        return 0;
    else if( n == 1)
        return 1;
    x1 = 0;
    x2 = 1;
    nextTerm = x1 + x2;
    for(int i = 3; i <=n ; i++){
        x1 = x2;
        x2 = nextTerm;
        nextTerm = x2 + x1 ;
    }
    return nextTerm;
}