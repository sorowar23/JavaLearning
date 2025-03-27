package excercisepractice;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String input)
    {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);
        while(m.find()){
            input = input.replaceAll(m.group(),m.group(1));
        }
        return input;
    }

    public static void main(String[] args) {
        String str1 = "Reya is is the the best player in eye eye game";
        System.out.println(removeDuplicateWords(str1));
        /*
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(),m.group(1));
            }
            System.out.println(input);
        }
        */
    }
}
