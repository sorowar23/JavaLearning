package excercisepractice;
//Input: prices = [7,1,5,3,6,4]
//Output: 5
public class BestTimetoBuyStock {
    public static int maxProfit(int[] prices){
        int result = 0;
        for(int i =1; i<prices.length; i++){
            for(int j = i+1; j<prices.length; j++){
                result = Math.max(result, prices[j] - prices[i]);
            }
        }
        return  result;
    }
    public static void main(String[] args){
        int[] price = {7,1,5,3,6,4};
        int profit = maxProfit(price);
        System.out.println(profit);
    }
}
