package javalearning.InterfaceEx;

public class InterfaceDemo {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 1);
        System.out.println("Gear is: "+mountainBike.getGear());
        System.out.println("Seat height: "+mountainBike.getSeatHight());
        System.out.println("Bike Speed : "+mountainBike.getSpeed());

        mountainBike.applyBrake(1);
        System.out.println("Bike Speed : "+mountainBike.getSpeed());

        mountainBike.speedUp(10);
        System.out.println("Bike Speed : "+mountainBike.getSpeed());
    }
}
