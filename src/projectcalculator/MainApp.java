package projectcalculator;
import javalearning.utilities.Utilities;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainApp {
    public static void main(String[] args) {

        final String inputExp = ReadInput.read();
        boolean isValid = Utilities.isValidExpression(inputExp);
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
                        continue;
                }
                Double num = Double.parseDouble(numbers.poll());
                res = operate.getResult(res, num);
            }
            System.out.println("Result of Expression:: " + res);
        }else{
            System.out.println("Invalid Expression! Please Enter Valid Expression.");
        }
    }

}