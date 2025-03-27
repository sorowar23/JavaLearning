package javalearning.Polymorphism;

public class MountainBike extends Bicycle {

    public int seatHight;

    public MountainBike(int setSeatHight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        this.seatHight = setSeatHight;
    }

    public void setHight(int newValue){
        seatHight = newValue;
    }

    @Override
    public void setGear(int newValue) {
        gear = newValue + 2;
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement - 10 ;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment + 10 ;
    }
}
