package javalearning.inheritance;

public class InheritanceEx {

    public static void main(String[] args) {
        MountainBike mountBike = new MountainBike(20, 10,1);
        System.out.println("Gear is: "+ mountBike.gear);
        System.out.println("Seat hight: "+ mountBike.seatHight);
        System.out.println("Speed: "+ mountBike.speed);
        mountBike.applyBrake(1);
        System.out.println("Speed after apply speed: "+ mountBike.speed);

        mountBike.setGear(2);
        System.out.println("Gear after apply Gear: "+ mountBike.gear);
    }
}
