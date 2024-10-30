import java.util.ArrayList;

public class CurrencyList {
    public static ArrayList<String> createCurrencyList() {
        ArrayList<String> currencies = new ArrayList<>(); 
        currencies.add("USD"); // United States Dollar
        currencies.add("EUR"); // Euro
        currencies.add("GBP"); // British Pound
        currencies.add("JPY"); // Japanese Yen
        currencies.add("AUD"); // Australian Dollar
        currencies.add("CAD"); // Canadian Dollar
        return currencies; 
    }
}
