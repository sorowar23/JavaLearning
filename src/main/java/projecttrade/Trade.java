package projecttrade;

import java.util.*;

public class Trade {
   String stockCode;
   double stockPrice;
   String orderType;

    Trade(String stockCode, double stockPrice, String orderType){
        this.stockCode = stockCode;
        this.stockPrice = stockPrice;
        this.orderType = orderType;
   }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
