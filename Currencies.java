import java.text.DecimalFormat;
public class Currencies {
    //All Conversion Rates Taken From The Microsoft Calculator App at 23:31 on 9/30/2023

//Method To Convert Currency To United States Dollars As Intermediary Currency To Be Used For Final Conversion
 private static Double toUSD(String sourceCurrency, Double amount) {
        switch (sourceCurrency) {
            case "TRY" -> {
                return amount *= 0.03653;
            }
            case "USD" -> {
                return amount;
            }
            case "VND" -> {
                return amount *= 0.00004119;
            }
            case "GBP" -> {
                return amount *= 1.2203;
            }
            case "SEK" -> {
                return amount *= 0.09158;
            }
            case "CHF" -> {
                return amount *= 1.093;
            }
            case "SAR" -> {
                return amount *= 0.2666;
            }
            case "ZAR" -> {
                return amount *= 0.05287;
            }
            case "NPR" -> {
                return amount *= 0.007527;
            }
        }
        return -1.0;
    }

    private static Double toCurrency(String targetCurrency, Double amount) {
        switch (targetCurrency) {
            case "TRY" -> {
                return amount *= 27.3712;
            }
            case "USD" -> {
                return amount;
            }
            case "VND" -> {
                return amount *= 24280.00;
            }
            case "GBP" -> {
                return amount *= 0.8195;
            }
            case "SEK" -> {
                return amount *= 10.9197;
            }
            case "CHF" -> {
                return amount *= 0.9149;
            }
            case "SAR" -> {
                return amount *= 3.7503;
            }
            case "ZAR" -> {
                return amount *= 18.9152;
            }
            case "NPR" -> {
                return amount *= 132.86;
            }
        }
        return -1.0;
    }

    public static void convertCurrency(String sourceCurrency, String targetCurrency, Double amount) {
        double c1;
        double c2;
        c1 = toUSD(sourceCurrency, amount);
        c2 = toCurrency(targetCurrency, c1);
        double conversionRate = (c2 / amount);
        DecimalFormat df = new DecimalFormat("#.##");
        if (c1 == -1.0 || c2 == -1.0) {
            System.out.println("Invalid Currency Codes Please Try Again!");
        } else {
            System.out.println("The Conversion Rate Is " + df.format(conversionRate));
            System.out.println("Your Amount In " + targetCurrency + " Is " + df.format(c2));
        }
    }
/*
    //Alternate Methods With Nested Switch Statements For Conversion From One Currency To Another Without Using USD As An Intermediary
    public static void convertCurrency(String sourceCurrency, String targetCurrency, Double amount) {
        double conversionRate = 0;
        double finalAmount = 0;
        switch (sourceCurrency) {
            case "TRY" -> {
                switch (targetCurrency) {
                    case "TRY" -> {
                        conversionRate = 1;
                        finalAmount = amount * conversionRate;
                    }
                    case "USD" -> {
                        conversionRate = 0.03653;
                        finalAmount = amount * conversionRate;
                    }
                    case "VND" -> {
                        conversionRate = 887.0638;
                        finalAmount = amount * conversionRate;
                    }
                    case "GBP" -> {
                        conversionRate = 0.02994;
                        finalAmount = amount * conversionRate;
                    }
                    case "SEK" -> {
                        conversionRate = 0.3989;
                        finalAmount = amount * conversionRate;
                    }
                    case "CHF" -> {
                        conversionRate = 0.03343;
                        finalAmount = amount * conversionRate;
                    }
                    case "SAR" -> {
                        conversionRate = 0.137;
                        finalAmount = amount * conversionRate;
                    }
                    case "ZAR" -> {
                        conversionRate = 0.6911;
                        finalAmount = amount * conversionRate;
                    }
                    case "NPR" -> {
                        conversionRate = 4.854;
                        finalAmount = amount * conversionRate;
                    }
                    default -> {
                        conversionRate = -1.0;
                    }
                }
            }
            case "USD" -> {
                switch (targetCurrency) {
                    case "TRY" -> {
                        conversionRate = 27.3712;
                        finalAmount = amount * conversionRate;
                    }
                    case "USD" -> {
                        conversionRate = 1;
                        finalAmount = amount * conversionRate;
                    }
                    case "VND" -> {
                        conversionRate = 24280;
                        finalAmount = amount * conversionRate;
                    }
                    case "GBP" -> {
                        conversionRate = 0.8195;
                        finalAmount = amount * conversionRate;
                    }
                    case "SEK" -> {
                        conversionRate = 10.9197;
                        finalAmount = amount * conversionRate;
                    }
                    case "CHF" -> {
                        conversionRate = 0.9149;
                        finalAmount = amount * conversionRate;
                    }
                    case "SAR" -> {
                        conversionRate = 3.7503;
                        finalAmount = amount * conversionRate;
                    }
                    case "ZAR" -> {
                        conversionRate = 18.9152;
                        finalAmount = amount * conversionRate;
                    }
                    case "NPR" -> {
                        conversionRate = 132.86;
                        finalAmount = amount * conversionRate;
                    }
                    default -> {
                        conversionRate = -1.0;
                    }
                }
            }
            case "VND" -> {
                switch (targetCurrency) {
                    case "TRY" -> {
                        conversionRate = 0.001127;
                        finalAmount = amount * conversionRate;
                    }
                    case "USD" -> {
                        conversionRate = 0.00004119;
                        finalAmount = amount * conversionRate;
                    }
                    case "VND" -> {
                        conversionRate = 1;
                        finalAmount = amount * conversionRate;
                    }
                    case "GBP" -> {
                        conversionRate = 0.00003375;
                        finalAmount = amount * conversionRate;
                    }
                    case "SEK" -> {
                        conversionRate = 0.0004497;
                        finalAmount = amount * conversionRate;
                    }
                    case "CHF" -> {
                        conversionRate = 0.00003768;
                        finalAmount = amount * conversionRate;
                    }
                    case "SAR" -> {
                        conversionRate = 0.0001545;
                        finalAmount = amount * conversionRate;
                    }
                    case "ZAR" -> {
                        conversionRate = 0.000779;
                        finalAmount = amount * conversionRate;
                    }
                    case "NPR" -> {
                        conversionRate = 0.005472;
                        finalAmount = amount * conversionRate;
                    }
                    default -> {
                        conversionRate = -1.0;
                    }
                }
            }
            case "GBP" -> {
                switch (targetCurrency) {
                    case "TRY" -> {
                        conversionRate = 33.3999;
                        finalAmount = amount * conversionRate;
                    }
                    case "USD" -> {
                        conversionRate = 1.2203;
                        finalAmount = amount * conversionRate;
                    }
                    case "VND" -> {
                        conversionRate = 29627.8218;
                        finalAmount = amount * conversionRate;
                    }
                    case "GBP" -> {
                        conversionRate = 1;
                        finalAmount = amount * conversionRate;
                    }
                    case "SEK" -> {
                        conversionRate = 13.3248;
                        finalAmount = amount * conversionRate;
                    }
                    case "CHF" -> {
                        conversionRate = 1.1164;
                        finalAmount = amount * conversionRate;
                    }
                    case "SAR" -> {
                        conversionRate = 4.5763;
                        finalAmount = amount * conversionRate;
                    }
                    case "ZAR" -> {
                        conversionRate = 23.0814;
                        finalAmount = amount * conversionRate;
                    }
                    case "NPR" -> {
                        conversionRate = 162.12;
                        finalAmount = amount * conversionRate;
                    }
                    default -> {
                        conversionRate = -1.0;
                    }
                }
            }
            case "SEK" -> {
                switch (targetCurrency) {
                    case "TRY" -> {
                        conversionRate = 2.5066;
                        finalAmount = amount * conversionRate;
                    }
                    case "USD" -> {
                        conversionRate = 0.09158;
                        finalAmount = amount * conversionRate;
                    }
                    case "VND" -> {
                        conversionRate = 2223.5043;
                        finalAmount = amount * conversionRate;
                    }
                    case "GBP" -> {
                        conversionRate = 0.07505;
                        finalAmount = amount * conversionRate;
                    }
                    case "SEK" -> {
                        conversionRate = 1;
                        finalAmount = amount * conversionRate;
                    }
                    case "CHF" -> {
                        conversionRate = 0.08378;
                        finalAmount = amount * conversionRate;
                    }
                    case "SAR" -> {
                        conversionRate = 0.3434;
                        finalAmount = amount * conversionRate;
                    }
                    case "ZAR" -> {
                        conversionRate = 1.7322;
                        finalAmount = amount * conversionRate;
                    }
                    case "NPR" -> {
                        conversionRate = 12.167;
                        finalAmount = amount * conversionRate;
                    }
                    default -> {
                        conversionRate = -1.0;
                    }
                }
            }
            case "CHF" -> {
                switch (targetCurrency) {
                    case "TRY" -> {
                        conversionRate = 29.9171;
                        finalAmount = amount * conversionRate;
                    }
                    case "USD" -> {
                        conversionRate = 1.093;
                        finalAmount = amount * conversionRate;
                    }
                    case "VND" -> {
                        conversionRate = 26538.4195;
                        finalAmount = amount * conversionRate;
                    }
                    case "GBP" -> {
                        conversionRate = 0.8957;
                        finalAmount = amount * conversionRate;
                    }
                    case "SEK" -> {
                        conversionRate = 11.9354;
                        finalAmount = amount * conversionRate;
                    }
                    case "CHF" -> {
                        conversionRate = 1;
                        finalAmount = amount * conversionRate;
                    }
                    case "SAR" -> {
                        conversionRate = 4.0991;
                        finalAmount = amount * conversionRate;
                    }
                    case "ZAR" -> {
                        conversionRate = 20.6746;
                        finalAmount = amount * conversionRate;
                    }
                    case "NPR" -> {
                        conversionRate = 145.2181;
                        finalAmount = amount * conversionRate;
                    }
                    default -> {
                        conversionRate = -1.0;
                    }
                }
            }
            case "SAR" -> {
                switch (targetCurrency) {
                    case "TRY" -> {
                        conversionRate = 7.2984;
                        finalAmount = amount * conversionRate;
                    }
                    case "USD" -> {
                        conversionRate = 0.2666;
                        finalAmount = amount * conversionRate;
                    }
                    case "VND" -> {
                        conversionRate = 6474.1487;
                        finalAmount = amount * conversionRate;
                    }
                    case "GBP" -> {
                        conversionRate = 0.2185;
                        finalAmount = amount * conversionRate;
                    }
                    case "SEK" -> {
                        conversionRate = 2.9117;
                        finalAmount = amount * conversionRate;
                    }
                    case "CHF" -> {
                        conversionRate = 0.244;
                        finalAmount = amount * conversionRate;
                    }
                    case "SAR" -> {
                        conversionRate = 1;
                        finalAmount = amount * conversionRate;
                    }
                    case "ZAR" -> {
                        conversionRate = 5.0436;
                        finalAmount = amount * conversionRate;
                    }
                    case "NPR" -> {
                        conversionRate = 35.4265;
                        finalAmount = amount * conversionRate;
                    }
                    default -> {
                        conversionRate = -1.0;
                    }
                }
            }
            case "ZAR" -> {
                switch (targetCurrency) {
                    case "TRY" -> {
                        conversionRate = 1.447;
                        finalAmount = amount * conversionRate;
                    }
                    case "USD" -> {
                        conversionRate = 0.05287;
                        finalAmount = amount * conversionRate;
                    }
                    case "VND" -> {
                        conversionRate = 1283.6238;
                        finalAmount = amount * conversionRate;
                    }
                    case "GBP" -> {
                        conversionRate = 0.04332;
                        finalAmount = amount * conversionRate;
                    }
                    case "SEK" -> {
                        conversionRate = 0.5773;
                        finalAmount = amount * conversionRate;
                    }
                    case "CHF" -> {
                        conversionRate = 0.04837;
                        finalAmount = amount * conversionRate;
                    }
                    case "SAR" -> {
                        conversionRate = 0.1983;
                        finalAmount = amount * conversionRate;
                    }
                    case "ZAR" -> {
                        conversionRate = 1;
                        finalAmount = amount * conversionRate;
                    }
                    case "NPR" -> {
                        conversionRate = 7.024;
                        finalAmount = amount * conversionRate;
                    }
                    default -> {
                        conversionRate = -1.0;
                    }
                }
            }
            case "NPR" -> {
                switch (targetCurrency) {
                    case "TRY" -> {
                        conversionRate = 0.206;
                        finalAmount = amount * conversionRate;
                    }
                    case "USD" -> {
                        conversionRate = 0.007527;
                        finalAmount = amount * conversionRate;
                    }
                    case "VND" -> {
                        conversionRate = 182.7488;
                        finalAmount = amount * conversionRate;
                    }
                    case "GBP" -> {
                        conversionRate = 0.006168;
                        finalAmount = amount * conversionRate;
                    }
                    case "SEK" -> {
                        conversionRate = 0.08219;
                        finalAmount = amount * conversionRate;
                    }
                    case "CHF" -> {
                        conversionRate = 0.006886;
                        finalAmount = amount * conversionRate;
                    }
                    case "SAR" -> {
                        conversionRate = 0.02823;
                        finalAmount = amount * conversionRate;
                    }
                    case "ZAR" -> {
                        conversionRate = 0.1424;
                        finalAmount = amount * conversionRate;
                    }
                    case "NPR" -> {
                        conversionRate = 1;
                        finalAmount = amount * conversionRate;
                    }
                    default -> {
                        conversionRate = -1.0;
                    }
                }
            }
            default -> {
                conversionRate = -1.0;
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        if (conversionRate == -1.0) {
            System.out.println("Invalid Currency Codes Please Try Again!");
        } else {
            System.out.println("The Conversion Rate Is " + df.format(conversionRate));
            System.out.println("Your Amount In " + targetCurrency + " Is " + df.format(finalAmount));
        }
    }
*/
}

