int countConsistentStrings(char * allowed, char ** words, int wordsSize){

int flag=0;
int sum=0;

for(int i=0;i<wordsSize;i++)
{
    int length = strlen(words[i]);
    for(int j=0;j<length;j++)
    {
        if(strchr(allowed,words[i][j])==NULL)
        {
            flag=1;
        }
    }
    
    if(flag==0)
    {
        sum++;
    }
    flag=0;
}

return sum;
}