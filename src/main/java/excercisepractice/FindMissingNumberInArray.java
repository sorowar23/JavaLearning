package excercisepractice;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int [] inputNumbers = {1,2,3,4,5,7,8,9};
        int n = inputNumbers.length + 1;

        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int number : inputNumbers){
            actualSum += number;
        }

        System.out.println("Missing Number: "+(expectedSum - actualSum));
    }
}
