char * restoreString(char * s, int* indices, int indicesSize){

    
    // arr(indices[i]) = s[i];
    

    char *arr = (char*)malloc(sizeof(char)*(indicesSize+1));
    for (int i = 0; i < indicesSize; i++){
        int t = indices[i];
        arr[t] = s[i]; 
        }   
    arr[indicesSize] = '\0'; 
    return arr;
}