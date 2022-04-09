

int mostWordsFound(char ** sentences, int sentencesSize){


    // **sentences => matrix 
    // sentencesSize => length for i

    
    int count = 0; // for space 
    int max = 0;    // compare for space 
    for (int i = 0; i < sentencesSize; i++){    // in i element we are wandering
        for (int j = 0; j < strlen(sentences[i]); j++){   
            if(sentences[i][j] == ' '){ // sentences[i][j] == *(*(sentences+i)+j) these is same 
                count++;
            }
        }
        if (count > max){
            max = count;
        }
        count = 0;
    }
    return max+1;
}