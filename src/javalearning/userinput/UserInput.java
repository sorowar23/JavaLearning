package javalearning.userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter your name:");

        String name = scannerObj.nextLine();
        System.out.println("Name: "+name);

        System.out.println("Enter your age:");
        int age = scannerObj.nextInt();

        System.out.println("Age: "+age);

       /* nextBoolean()	Reads a boolean value from the user
        nextByte()	Reads a byte value from the user
        nextDouble()	Reads a double value from the user
        nextFloat()	Reads a float value from the user
        nextInt()	Reads a int value from the user
        nextLine()	Reads a String value from the user
        nextLong()	Reads a long value from the user
        nextShort()
        */
    }
}
