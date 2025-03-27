package testcode;

import java.util.Scanner;

//input an array have some palindrome word and non-palindrome word find out which are palindrome
public class ValidatePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter palindrome words:");
        String userInputString = scanner.nextLine();
        String [] inputWord = userInputString.split(" ");

        // String [] inputWord = {"madam", "level", "Jahan","Test", "radar"};
        String reverseWord = "";
        char ch;

        for(String str: inputWord) {
           for (int i = 0; i < str.length(); i++) {
               ch = str.charAt(i);
               reverseWord = ch + reverseWord;
           }

           if(str.equals(reverseWord)){
               System.out.println(str+ ": Palindrome");
           }else{
               System.out.println(str+ ": Not a Palindrome");
           }
           reverseWord = "";
        }

    }
}
