

char * sortSentence(char * s){
int size = strlen(s);
    char *res = (char*)malloc(sizeof(char) * (size+9));
    int ind = 0;
    char word = '1';
    for(int i=size;i>=0;i--){
        if(s[i] == word){
            //printf("Found %c\n",word);
            int end = i;
            while((s[i]!=' ') && (i>0)){i--;}
            if(i==0){i--;}
            for(int j=i+1;j<end;j++){
                res[ind++] = s[j];
            }
            res[ind++] = ' ';
            word++;
            i=size+1;
        }
    }
    res[--ind] = '\0';
    return res;
}
