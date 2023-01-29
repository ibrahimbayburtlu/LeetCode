class ParkingSystem {
    int big,medium,small;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
    }

    public boolean addCar(int carType) {
        if(big>=1 && carType==1){
            big--;
            return true;
        }
        if(medium>=1 && carType==2){
            medium--;
            return true;
        }
        if(small>=1 && carType==3){
            small--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */