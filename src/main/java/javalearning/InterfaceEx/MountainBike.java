package javalearning.InterfaceEx;

public class MountainBike implements Bicycle{
    private int seatHight;
    private int gear;
    private int speed;

    public MountainBike(int seatHight, int speed, int gear) {
        this.seatHight = seatHight;
        this.speed = speed;
        this.gear = gear;
    }

    public int getSeatHight() {
        return seatHight;
    }

    public void setSeatHight(int seatHight) {
        this.seatHight = seatHight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }
}
