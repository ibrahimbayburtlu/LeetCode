

bool isThree(int n){

    int flag = 0;
    for(int i = 1; i <=n; i++){
        if(n % i == 0){
            flag++;
        }
    }
    if(flag !=3){
        return false;
    }
    return true;
}