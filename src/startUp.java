import java.util.ArrayList;

public class startUp {
    public static String start(){
        System.out.println("Here is a list of currencies:");

        ArrayList<String> currencyList = CurrencyList.createCurrencyList(); // Call the method and store the result
        System.out.println(currencyList); // Print the ArrayList

        System.out.println("please select what currency you would like to exchange from GBP");

        return null;
    }
    
}
