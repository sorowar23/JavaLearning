package javalearning.inheritance;

public class MountainBike extends Bicycle{

    public int seatHight;

    public MountainBike(int setSeatHight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        this.seatHight = setSeatHight;
    }

    public void setHight(int newValue){
        seatHight = newValue;
    }
}
