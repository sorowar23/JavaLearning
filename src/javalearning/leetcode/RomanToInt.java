package javalearning.leetcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static javalearning.utilities.Utilities.isValidRomanString;

public class RomanToInt {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Roman Number (e.g CXIV): ");
        String s = userInput.nextLine();
        boolean isValidRomanNumber = isValidRomanString(s);
        if (isValidRomanNumber) {
            Map<Character, Integer> numbersMap = new HashMap<>();
            numbersMap.put('I', 1);
            numbersMap.put('V', 5);
            numbersMap.put('X', 10);
            numbersMap.put('L', 50);
            numbersMap.put('C', 100);
            numbersMap.put('D', 500);
            numbersMap.put('M', 1000);
            int result = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                if (numbersMap.get(s.charAt(i)) < numbersMap.get(s.charAt(i + 1))) {
                    result -= numbersMap.get(s.charAt(i));
                } else {
                    result += numbersMap.get(s.charAt(i));
                }
            }
            result = result + numbersMap.get(s.charAt(s.length() - 1));
            System.out.println("Total after adding romans digits: " + result);
        }else{
            System.out.println("Please Enter Valid Roman Number.");
        }

    }
}