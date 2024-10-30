import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        startUp.start();

        Scanner scanner = new Scanner(System.in);
        String currencyIn = scanner.nextLine();
        selector.select(currencyIn);// pass the currency in value to the selector class
      

        System.out.print("Please input the amount of money you would like to exchange:");
        String valueIn = scanner.nextLine();
        double amountToExchange;

        try{
            amountToExchange = Double.parseDouble(valueIn);
        }
        catch(NumberFormatException e){
            System.out.println("invalid number please restart...");
            scanner.close();
            return;
        }

        Double convertedAmount = exchange.convertCurrency(currencyIn, amountToExchange);
        System.out.printf("Converted amount: %.2f\n", convertedAmount);

        scanner.close ();
    }
}
