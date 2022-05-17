

int countMatches(char *** items, int itemsSize, int* itemsColSize, char * ruleKey, char * ruleValue){

    /// There are three series in a series. items[type,color,name];
    
    int count = 0;
    int i=0;
    
    for(i=0; i<itemsSize; i++)
    {
        if(strcmp(ruleKey, "type") == 0)
        {
            if(strcmp(ruleValue, items[i][0]) == 0)
            {
                count++;
            } 
        }
        else if(strcmp(ruleKey, "color") == 0)
        {
            if(strcmp(ruleValue, items[i][1]) == 0)
            {
                count++;
            } 
        }
        else if(strcmp(ruleKey, "name") == 0)
        {
            if(strcmp(ruleValue, items[i][2]) == 0)
            {
                count++;
            }
        }        
          
    }
     return count;   
}