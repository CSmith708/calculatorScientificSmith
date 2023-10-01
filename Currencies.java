import java.text.DecimalFormat;
public class Currencies {
    private static Double toUSD(String sourceCurrency, Double amount) {
        switch (sourceCurrency) {
            case "TRY" -> {
                return amount *= 0.036;
            }
            case "USD" -> {
                return amount;
            }
            case "VND" -> {
                return amount *= 0.000041;
            }
            case "GBP" -> {
                return amount *= 1.22;
            }
            case "SEK" -> {
                return amount *= 0.092;
            }
            case "CHF" -> {
                return amount *= 1.09;
            }
            case "SAR" -> {
                return amount *= 0.27;
            }
            case "ZAR" -> {
                return amount *= 0.053;
            }
            case "NPR" -> {
                return amount *= 0.0075;
            }
        }
        return -1.0;
    }

    private static Double toCurrency(String targetCurrency, Double amount) {
        switch (targetCurrency) {
            case "TRY" -> {
                return amount *= 27.37;
            }
            case "USD" -> {
                return amount;
            }
            case "VND" -> {
                return amount *= 24280.00;
            }
            case "GBP" -> {
                return amount *= 0.82;
            }
            case "SEK" -> {
                return amount *= 10.92;
            }
            case "CHF" -> {
                return amount *= 0.91;
            }
            case "SAR" -> {
                return amount *= 3.75;
            }
            case "ZAR" -> {
                return amount *= 18.92;
            }
            case "NPR" -> {
                return amount *= 132.86;
            }
        }
        return -1.0;
    }

    public static void convertCurrency(String sourceCurrency, String targetCurrency, Double amount) {
        double c1 = 0;
        double c2 = 0;
        c1 = toUSD(sourceCurrency, amount);
        c2 = toCurrency(targetCurrency, c1);
        double conversionRate = (c2/amount);
        DecimalFormat df = new DecimalFormat("#.##");
        if (c1  == -1.0 || c2 == -1.0){
            System.out.println("Invalid Currency Codes Please Try Again!");
        } else {
            System.out.println("The Conversion Rate Is " + df.format(conversionRate));
            System.out.println("Your Amount In " + targetCurrency + " Is " + df.format(c2));
        }






    }
}
