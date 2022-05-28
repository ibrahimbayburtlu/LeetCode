

int minMovesToSeat(int* seats, int seatsSize, int* students, int studentsSize){
    
    
    int temp = 0;
    int sum =0;
    for(int i = 0;i<seatsSize-1;i++){       
        for(int j=0;j<seatsSize-i-1;j++){          
            if(seats[j]>seats[j+1]){               
                temp = seats[j];
                seats[j] = seats[j + 1];
                seats[j + 1] = temp;
                }
            if(students[j] > students[j+1]){
                temp = students[j];
                students[j] = students[j+1];
                students[j+1] = temp;
                }
            }
        }
    for(int i = 0; i < seatsSize;i++){
        if((seats[i] - students[i]) >= 0){
            sum += (seats[i] - students[i]);
        }
        else{
            sum += (students[i] - seats[i]);
        }
    }
    return sum;
}