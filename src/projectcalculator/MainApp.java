package projectcalculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainApp {
    public static void main(String[] args) {

        final String inputExp = ReadInput.read();

        boolean isValid = isValidExpression(inputExp);
        if(isValid) {
            String numberArr[] = inputExp.split("[-+*/]");
            String operationsArr[] = inputExp.split("[0-9]+");

            Queue<String> numbers = new LinkedList<>(Arrays.asList(numberArr));
            Queue<String> operations = new LinkedList<>(Arrays.asList(operationsArr));

            Double res = Double.parseDouble(numbers.poll());
            String opr = operations.poll();

            while (!numbers.isEmpty()) {
                opr = operations.poll();
                Operate operate;
                switch (opr) {
                    case "+":
                        operate = new Add();
                        break;
                    case "-":
                        operate = new Substract();
                        break;
                    case "*":
                        operate = new Multiply();
                        break;
                    case "/":
                        operate = new Division();
                        break;
                    default:
                        System.out.println("Invalid Choice.");
                        continue;
                }
                Double num = Double.parseDouble(numbers.poll());
                res = operate.getResult(res, num);
            }
            System.out.println("Result of Expression:: " + res);
        }else{
            System.out.println("Invalid Expression!!!");
        }
    }
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static boolean isValidExpression(String expression) {
        expression = expression.replaceAll("\\s+", ""); // Remove whitespace

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (!Character.isDigit(c) && !isOperator(c)) {
                return false;
            }
        }

        return true;
    }
}