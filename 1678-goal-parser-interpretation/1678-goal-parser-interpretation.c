

char * interpret(char * command){
    
char *result = (char*)malloc(sizeof(char)*100);int index=0;int i=0;
while(command[i]){
    
    if(command[i]=='G'){ 
            result[index++]='G';
            i++;
        }
    else if(command[i]=='(' && command[i+1]==')'){
        result[index++]='o';
        i=i+2;
    }
    else {
       result[index++]='a';
       result[index++]='l';
       i+=4;
   }
}
result[index]='\0';
return result;
}