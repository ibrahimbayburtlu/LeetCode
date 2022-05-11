


typedef struct {
    int small;
    int medium;
    int big;
    
} ParkingSystem;


ParkingSystem* parkingSystemCreate(int big, int medium, int small) {
    
    ParkingSystem *P = (ParkingSystem*)malloc(sizeof(ParkingSystem));
    P ->small = small;
    P ->medium = medium;
    P ->big = big;
    return P;
}

bool parkingSystemAddCar(ParkingSystem* obj, int carType) {
     
    if(carType == 3 && obj -> small > 0){
        
        obj -> small --;
        return true;
    }
    else if (carType == 2 && obj -> medium > 0){
        obj -> medium --;
        return true;
    }
    else if (carType == 1 && obj -> big > 0){
        obj -> big --;
        return true;
    }
    return false;
    
    
    
}

void parkingSystemFree(ParkingSystem* obj) {

    free(obj);
    
}

/**
 * Your ParkingSystem struct will be instantiated and called as such:
 * ParkingSystem* obj = parkingSystemCreate(big, medium, small);
 * bool param_1 = parkingSystemAddCar(obj, carType);
 
 * parkingSystemFree(obj);
*/