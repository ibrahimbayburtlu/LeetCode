

int mostWordsFound(char ** sentences, int sentencesSize){


    // **sentences => matrix 
    // sentencesSize => length for i

    
    int count = 0; // for space 
    int max = 0;    // compare for space 
    for (int i = 0; i < sentencesSize; i++){    // in i element we are wandering
        for (int j = 0; j < strlen(sentences[i]); j++){   
            if(sentences[i][j] == ' '){ // sentences[i][j] == *(*(sentences+i)+j) these is same 
                count++;    // we are counter in space number 
            }
        }
        if (count > max){
            max = count;
        }
        count = 0; // if we are count equat is zero we assume increase space for example, previous counter is 5 and we count new sentence it is 5+... 
    }
    return max+1;   // for  we have 5 space okey we have 6 word because there is a space between both words.
}