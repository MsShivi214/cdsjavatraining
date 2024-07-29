import java.util.Scanner;

public class CurrencyConverter {

    // Conversion rates
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_INR = 74.93;
    private static final double EUR_TO_USD = 1.18;
    private static final double EUR_TO_INR = 88.24;
    private static final double INR_TO_USD = 0.013;
    private static final double INR_TO_EUR = 0.011;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Available currencies: USD, EUR, INR");

        System.out.print("Enter the source currency (USD, EUR, INR): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (USD, EUR, INR): ");
        String targetCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = convertCurrency(sourceCurrency, targetCurrency, amount);
        if (convertedAmount == -1) {
            System.out.println("Invalid currency conversion.");
        } else {
            System.out.printf("%.2f %s = %.2f %s\n", amount, sourceCurrency, convertedAmount, targetCurrency);
        }

        scanner.close();
    }

    public static double convertCurrency(String sourceCurrency, String targetCurrency, double amount) {
        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return amount * USD_TO_EUR;
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("INR")) {
            return amount * USD_TO_INR;
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return amount * EUR_TO_USD;
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("INR")) {
            return amount * EUR_TO_INR;
        } else if (sourceCurrency.equals("INR") && targetCurrency.equals("USD")) {
            return amount * INR_TO_USD;
        } else if (sourceCurrency.equals("INR") && targetCurrency.equals("EUR")) {
            return amount * INR_TO_EUR;
        } else {
            return -1; // Invalid conversion
        }
    }
}
