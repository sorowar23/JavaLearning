package excercisepractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidateEmail {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Scanner scanner = new Scanner(System.in);
        String emailAddress = scanner.nextLine();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailAddress);

        if(m.matches())
            System.out.println("Valid email address.");
        else {
            System.out.println("Invalid email address.");
        }

    }
}
