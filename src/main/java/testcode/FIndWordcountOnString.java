package testcode;

import java.util.Scanner;

public class FIndWordcountOnString {
    public static void main(String [] args){
        String inputString = "Hello Java. Java is most used language on enterprise level software. Java is so power full language.";
        String sentizeString = inputString.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();

        String [] strArray = sentizeString.split("\\s");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word to be count:");
        String wordCountInput = scanner.nextLine().toLowerCase().trim();
        int count = 0;
        for(String str: strArray){
            if(str.equals(wordCountInput)){
                count++;
            }
        }
        System.out.println(count);
    }
}
