package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //char[] s = {'h','e','l','l','o'};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String stringText = scanner.nextLine();
        String reverseString = "";
        for(int i = stringText.length() - 1; i>= 0; i--){
            reverseString += stringText.charAt(i);
        }
        System.out.println("Reverse String: "+reverseString);
    }
}
