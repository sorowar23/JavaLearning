package projectcalculator;

public class Add implements Operate{
    @Override
    public Double getResult(Double... numbers) {
        Double result = 0.0;
        for(Double num : numbers) {
            result += num;
        }
        return result;
    }
}
