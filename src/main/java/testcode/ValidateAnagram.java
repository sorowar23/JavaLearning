package testcode;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class ValidateAnagram {

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char [] str1Array = str1.toCharArray();
        char [] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        for(int i = 0; i<str1Array.length; i++){
            if(str1Array[i] != str2Array[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String s1 = scanner.next();

        System.out.println("Enter Second String: ");
        String s2 = scanner.next();
        boolean result = isAnagram(s1,s2);
        System.out.println((result)? "Anagram": "Not Anagram");
    }
}
