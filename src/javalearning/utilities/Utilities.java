package javalearning.utilities;

public class Utilities {
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static boolean isValidExpression(String expression) {
        expression = expression.replaceAll("\\s+", ""); // Remove whitespace

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (!Character.isDigit(c) && !isOperator(c)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isRomanChar(char c){
        return c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M';
    }

    public static boolean isValidRomanString(String romanString) {
        romanString = romanString.replaceAll("\\s+", "").toUpperCase(); // Remove whitespace
        for (int i = 0; i < romanString.length(); i++) {
            char c = romanString.charAt(i);
            if (!isRomanChar(c)) {
                return false;
            }
        }
        return true;
    }
}
