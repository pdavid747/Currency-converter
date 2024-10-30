public class exchange {
    public static double convertCurrency(String currency, double amount) {
        double exchangeRate;
        switch(currency.toUpperCase()){
            case "USD":
                exchangeRate = 1.30;
                break;
            case "EUR":
                exchangeRate = 1.20;
                break;
            case "GBP":
                exchangeRate = 1;
                break;
            case "JPY":
                exchangeRate = 199;
                break;
            case "AUD":
                exchangeRate = 2;
                break;
            case "CAD":
                exchangeRate = 1.8;
                break;
            default:
                throw new IllegalArgumentException("Currency not recognized.");
        }
        return amount * exchangeRate;
    }
    
}
