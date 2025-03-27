package projecttrade;

import java.util.*;

public class TradeData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
//        while (count<=3) {
//            System.out.println("Enter Stock Code:");
//            String stockCode = scanner.nextLine();
//            System.out.println("Enter Stock Price:");
//            String stockPrice = scanner.nextLine();
//            System.out.println("Enter Stock Type:");
//            String stockType = scanner.nextLine();
//            String variableName = "t_" + count;
//            Trade t1 = new Trade(stockCode, stockPrice, stockType);
//            count++;
//        }
        Trade t1 = new Trade("AAPL", 20, "BUY");
        Trade t2 = new Trade("GE", 10, "BUY");
        List<Trade> stockList = new ArrayList<Trade>(Arrays.asList(t1,t2));


        for(Trade stock: stockList)
            System.out.println(stock.stockCode + " " + stock.stockPrice + " " + stock.orderType);

    }
}
