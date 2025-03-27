package testcode;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Hello Java! Java is most used programming language, java used on enterprise software.";
        String santizeString = inputString.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String [] strArray = santizeString.split("\\s");

        Scanner scanner = new Scanner(System.in);
        String targetString = scanner.nextLine().toLowerCase();
        int count = 0;
        for(String str: strArray){
            if(str.equals(targetString)){
                count++;
            }
        }

        System.out.println(count);
    }
}
