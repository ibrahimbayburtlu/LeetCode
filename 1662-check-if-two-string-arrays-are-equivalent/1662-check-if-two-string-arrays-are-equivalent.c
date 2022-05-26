

bool arrayStringsAreEqual(char ** word1, int word1Size, char ** word2, int word2Size){
    
char ans[1000];
int word1_len=0;
for(int i=0;i<word1Size;i++)
{
    int len=strlen(word1[i]);
    for(int j=0;j<len;j++)
    {
        ans[word1_len++]=word1[i][j];       
    }   
}
int word2_len=0;

for(int i=0;i<word2Size;i++)
{
    int len=strlen(word2[i]);
    for(int j=0;j<len;j++)
    {
        if(ans[word2_len++]!=word2[i][j])
        {
            return false;
        }          
    }   
}

if(word2_len!= word1_len)
{
    return false;
}
    return true;
}