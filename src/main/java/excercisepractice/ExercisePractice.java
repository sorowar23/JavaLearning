package excercisepractice;

import java.util.Scanner;

public class ExercisePractice {
    public static void main(String[] args) {
        //1. Write a Java program to get the character at the given index within the string.
        String givenString = "Java Exercises!";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Index Position:");
        int index = scanner.nextInt();
        System.out.println("The character at position "+index+" is " +givenString.charAt(index));

        //2. Write a Java program to get the character (Unicode code point) at the given index within the string.
        System.out.println("Character(unicode point) =  " + givenString.codePointAt(index));
        System.out.println("Character(unicode point) =  " + (int) givenString.charAt(index));

        //3. Write a Java program to get the character (Unicode code point) before the specified index within the string.
        System.out.println("Character(unicode point) =  " + givenString.codePointBefore(index));
        //4. Write a Java program to count Unicode code points in the specified text range of a string.

        String str1 = givenString.substring(2,6);
        int count = 0;
        for(int i= 2; i<str1.length(); i++){
            count += str1.charAt(i);
        }
        System.out.println("Codepoint count ="+count);

        int ctr = givenString.codePointCount(1, 9);
        System.out.println("Codepoint count ="+ctr);
        //5. Write a Java program to compare two strings lexicographically.

        String string1 = "Hello Java Exercise 1";
        String string2 = "Hello World Java Exercise 2";
        int result = string1.compareTo(string2);
       // 6. Write a Java program to compare two strings lexicographically, ignoring case differences.
        int result2 = string1.compareToIgnoreCase(string2);

        if(result < 0){
            System.out.println(string1 + " is less than "+string2);
        }else{
            System.out.println(string1 +" is equal to "+string2);
        }

        //7. Write a Java program to concatenate a given string to the end of another string.

        System.out.println(string1.concat(string2));
        //8. Write a Java program to test if a given string contains the specified sequence of char values.
        String stringText = "PHP Exercises and Python Exercises";
        String expectedString = "Exercises";

        System.out.println(stringText.contains(expectedString));

        String [] stringArray = stringText.split(" ");

        boolean flag = false;
        for(String str: stringArray){
            if(str.equals(expectedString)){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
