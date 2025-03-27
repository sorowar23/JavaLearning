package excercisepractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WordCouranceCount {
    public static void main(String[] args) {
        String stringText = "This city is a world most popular city in the country and new york city have lot's of fun stuff to do.";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word want to count:");

        String expectedWord = scanner.nextLine();
        int count = 0;

        String [] srtArray = stringText.split("\\s");

        for(int i = 0; i<srtArray.length; i++){
            if(srtArray[i].equals(expectedWord)){
                count++;
            }
        }
        System.out.println(count);
    }
}
