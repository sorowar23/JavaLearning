package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCharsOnString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String stringText = scanner.nextLine().toLowerCase();

        char[] ch = stringText.toCharArray();
        Arrays.sort(ch);
        String sortedString = new String(ch);

        for(int i =0; i<stringText.length(); i++){
            int count = 1;
            while(i<stringText.length()- 1 && sortedString.charAt(i) == sortedString.charAt(i+1))
            {
                count++;
                i++;
            }
            if(count>1)
                System.out.println(sortedString.charAt(i) + ", count ="+ count);
        }

    }
}
