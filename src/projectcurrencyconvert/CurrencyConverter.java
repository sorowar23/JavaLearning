package projectcurrencyconvert;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


import com.google.gson.*;
public class CurrencyConverter {
   // private static final String API_KEY = "b84ec73e3c8d5bc6bb471a88";
    private static String API_ENDPOINT = "https://v6.exchangerate-api.com/v6/b84ec73e3c8d5bc6bb471a88/latest/USD";
    public static String[] CURRENCIES = {
            "USD", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG",
            "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB",
            "BRL", "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLP",
            "CNY", "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD",
            "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "FOK", "GBP", "GEL", "GGP",
            "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG",
            "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD",
            "JOD", "JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW", "KWD", "KYD",
            "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA",
            "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR",
            "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN",
            "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF",
            "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD",
            "SSP", "STN", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY",
            "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "UYU", "UZS", "VEF", "VND",
            "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW",
            "ZWL"
    };

    public static void main(String[] args) throws IOException {

        HashSet<String> set = new HashSet<>(Arrays.asList(CURRENCIES));
        Scanner scannerObj = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");


        while(true) {
            System.out.println("Enter Currency Code From:");
            String fromCurrency = scannerObj.nextLine();

            System.out.println("Enter Currency Code To:");
            String toCurrency = scannerObj.nextLine();

            System.out.println("Enter Amount:");
            String amountToConvert = scannerObj.nextLine();
            boolean flag = isDigits(amountToConvert);

            if (set.contains(fromCurrency) && set.contains(toCurrency) && flag) {
                int amountTo = Integer.parseInt(amountToConvert);
                double result = convert(amountTo, fromCurrency, toCurrency);
                String resultFinal = df.format(result);
               // String resultFinal = String.format("%.2f", result);
                System.out.println("Total amount after convert = " + resultFinal + " " + toCurrency);
                break;
            } else {
                System.out.println("Currency code not valid or Entered amount not valid digits. please correct feedback error then try again.");

            }

        }
    }

    public static boolean isDigits(String input){
        if (input == null || input.isEmpty()) {
            return false; // Or handle empty input as needed
        }
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static double convert(double amount,String fromCurrency,String toCurrency) throws IOException {

        /* Making Request */
        URL url = new URL(API_ENDPOINT);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Accessing object
        JsonObject conversion_rates = jsonobj.get("conversion_rates").getAsJsonObject();
        System.out.println(conversion_rates.get(fromCurrency));
        double rateFrom = conversion_rates.get(fromCurrency).getAsDouble();
        double rateTo = conversion_rates.get(toCurrency).getAsDouble();
        return amount*(1/rateFrom)*rateTo;
    }

}
