package javalearning.Polymorphism;

public class MethodOverRiding {

    public static void main(String[] args) {
      /*  Bicycle bicycle = new Bicycle(10, 1);
        System.out.println("Bicycle gear: "+ bicycle.gear);
        System.out.println("Bicycle Speed: "+ bicycle.speed);
        bicycle.applyBrake(1);
        System.out.println("Bicycle Speed after break : "+ bicycle.speed);
       */

        Bicycle mountainBike = new MountainBike(50,50,3);
        System.out.println("Mountain Bike Gear is: "+ mountainBike.gear);
        System.out.println("Mountain Bike Speed is: "+ mountainBike.speed);

        mountainBike.applyBrake(1);
        System.out.println("Mountain Bike Speed after apply break: "+ mountainBike.speed);

        mountainBike.speedUp(10);
        System.out.println("Mountain Bike Speed after apply Speed: "+ mountainBike.speed);


    }

}
