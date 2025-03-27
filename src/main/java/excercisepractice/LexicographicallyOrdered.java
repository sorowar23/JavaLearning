package excercisepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicallyOrdered {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> subStringList = new ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            subStringList.add(s.substring(i, i + k));
        }
        Collections.sort(subStringList);
        smallest = subStringList.get(0);
        largest = subStringList.get(subStringList.size() -1);
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
