package excercisepractice;

public class BestTimetoBuyStock11 {
    public static int maxProfit(int[] prices){
      int min = prices[0];
      int result = 0;
      for(int i =0; i<prices.length;i++){
          min =Math.min(min,prices[i]);
          result =Math.max(result, prices[i] - min);
      }

      return result;
    }
    public static void main(String[] args){
        int[] price = {7,1,5,3,6,4};
        int profit = maxProfit(price);
        System.out.println(profit);
    }
}

