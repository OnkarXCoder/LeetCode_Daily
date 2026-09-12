class ParkingSystem {
    int bigcar;
    int medcar;
    int smallcar;

    public ParkingSystem(int big, int medium, int small) {
        bigcar = big;
        medcar = medium;
        smallcar = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1) {
            if(bigcar > 0) {
                bigcar--;
                return true;
            }
        }

        if(carType == 2) {
            if(medcar > 0) {
                medcar--;
                return true;
            }
        }

        if(carType == 3) {
            if(smallcar > 0) {
                smallcar--;
                return true;
            }
        }

        return false;
    }
}