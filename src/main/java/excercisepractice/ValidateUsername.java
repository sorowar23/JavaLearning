package excercisepractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
 */
public class ValidateUsername {

    public static boolean validateUserName(String username){
        String regex = "^[A-Za-z]\\w{7,29}$";
        if(username.isEmpty())
            return false;

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(username);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(validateUserName("Test11_11"));
    }
}
