package excercisepractice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i =0; i<str1.length; i++)
            if(str1[i]!= str2[i])
                return false;

        return true;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
