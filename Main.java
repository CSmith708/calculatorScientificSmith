import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Available Currencies:");
        System.out.println("Turkey Lira (TRY)\nUnited States Dollar (USD)\nVietnam Dong (VND)\nUnited Kingdom Pound (GBP)\nSweden Krona (SEK)\nSwitzerland Franc (CHF)\nSaudi Arabia Riyal (SAR)\nSouth African Rand (ZAR)\nNepal Rupee (NPR)");
        while(true){
            System.out.println("Enter The Amount You Wish To Convert Or Enter 0 To Exit:");
            double amount = scanner.nextDouble();
            if(amount == 0){
                break;
            }
            System.out.println("Select The Source Currency By Using The Three Letter Abbreviation Listed Above:");
            String sourceCurrency = scanner.next().toUpperCase();
            System.out.println("Select The Target Currency By Using The Three Letter Abbreviation Listed Above:");
            String targetCurrency = scanner.next().toUpperCase();
            Currencies.convertCurrency(sourceCurrency, targetCurrency, amount);
        }
    scanner.close();
   }
}
