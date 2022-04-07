

int finalValueAfterOperations(char ** operations, int operationsSize){

    // operations => + or -
    // operationsSize => length array
    
    
    int X = 0;
    
    for (int i = 0; i < operationsSize; i++){
        
        if(operations[i][1] == '+'){
            X++;
        }
        else{
            X--;
        }
    }
    return X;
}