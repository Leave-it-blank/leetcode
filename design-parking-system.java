//https://leetcode.com/problems/design-parking-system/ 
class ParkingSystem {
    private int p_big, p_med, p_small;

    public ParkingSystem(int big, int medium, int small) {
        this.p_big = big;
        this.p_small = small;
        this.p_med = medium;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(this.p_big >0){
                this.p_big--;
                return true;
            }else {
                return false;
            }
        }
         if(carType == 2){
            if(this.p_med >0){
                this.p_med--;
                return true;
            }else {
                return false;
            }
        }
         if(carType == 3){
            if(this.p_small >0){
                this.p_small--;
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
