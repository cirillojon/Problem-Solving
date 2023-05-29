class ParkingSystem {
    int big_left = 0;
    int medium_left = 0;
    int small_left = 0;
    
    public ParkingSystem(int big, int medium, int small) {
        big_left = big;
        medium_left = medium;
        small_left = small;
    }

    public boolean addCar(int carType) {
        if(carType == 3 && small_left > 0)
            {small_left--; return true;}
        if(carType == 2 && medium_left > 0)
            {medium_left--; return true;}
        if(carType == 1 && big_left > 0)
            {big_left--; return true;}
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */