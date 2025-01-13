package leetcode;

public class LengthLastWord {
    public static void main(String[] args) {
        String s = "Hello World New York";
        String regex = "[\\s]";
        String lastWord[] = s.split(regex);
        int count = lastWord[lastWord.length - 1].length();
        System.out.println(count);
    }
}
