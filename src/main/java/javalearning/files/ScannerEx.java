package javalearning.files;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float age = 0.0f;
        boolean validAge = false;
        do {
            System.out.println("Please enter your age:");
            String ageUserInput = scanner.nextLine();
            try {
                age = Float.parseFloat(ageUserInput);
                validAge = true;
            }catch (NumberFormatException e) {
                System.out.println("Hey, you didn't enter a valid input!");
            }
        }while(validAge == false);

        System.out.println("Your age is: "+ age);

    }
}
