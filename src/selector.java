public class selector {
    public static void select(String currencyIn){
        if (currencyIn.equalsIgnoreCase("USD") || currencyIn.equals("1")) {
            System.out.println("You selected US Dollar.");
            return;

        } else if (currencyIn.equalsIgnoreCase("EUR") || currencyIn.equals("2")) {
            System.out.println("You selected Euro.");

        } else if (currencyIn.equalsIgnoreCase("GBP") || currencyIn.equals("3")) {
            System.out.println("You selected British Pound.");

        } else if (currencyIn.equalsIgnoreCase("JPY") || currencyIn.equals("4")) {
            System.out.println("You selected Japanese Yen.");

        } else if (currencyIn.equalsIgnoreCase("AUD") || currencyIn.equals("5")) {
            System.out.println("You selected Australian Dollar.");

        } else if (currencyIn.equalsIgnoreCase("CAD") || currencyIn.equals("6")) {
            System.out.println("You selected Canadian Dollar.");

        } else {
            System.out.println("Currency not recognized. Please try again.");
        }
    }
    
}
