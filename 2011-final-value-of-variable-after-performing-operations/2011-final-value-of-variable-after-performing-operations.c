

int finalValueAfterOperations(char ** operations, int operationsSize){

    // operations => + or -
    // operationsSize => length array
    
          int x  = 0;
          
          for ( int i = 0 ; i < operationsSize ; i++)
          {
              if(*(*(operations+i)+1) == '+'){
                x++;
              }
              
              else if (*(*(operations+i)+1) != '+'){
                  x--;
              }
          }
          return x;
}