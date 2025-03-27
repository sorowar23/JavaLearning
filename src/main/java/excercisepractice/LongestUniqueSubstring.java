package excercisepractice;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++; // Shrink window from left
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
           // System.out.println(set);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcdbea"; // Expected output: 3 ("abc")
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(input));
    }
}
