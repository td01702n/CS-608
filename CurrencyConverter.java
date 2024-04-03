import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    // HashMap to store conversion rates
    private static Map<String, Double> conversionRates = new HashMap<>();

    static {
        // Populate conversion rates
        conversionRates.put("Rupee to Dollar", 0.013);
        conversionRates.put("Rupee to Euro", 0.012);
        conversionRates.put("Rupee to Pound", 0.011);
        conversionRates.put("Rupee to Yen", 1.45);
        conversionRates.put("Dollar to Rupee", 83.37);
        conversionRates.put("Dollar to Euro", 0.98);
        conversionRates.put("Dollar to Pound", 0.76);
        conversionRates.put("Dollar to Yen", 111.26);
        conversionRates.put("Euro to Rupee", 80.85);
        conversionRates.put("Euro to Dollar", 1.02);
        conversionRates.put("Euro to Pound", 0.86);
        conversionRates.put("Euro to Yen", 129.76);
        conversionRates.put("Pound to Rupee", 93.17);
        conversionRates.put("Pound to Dollar", 1.31);
        conversionRates.put("Pound to Euro", 1.16);
        conversionRates.put("Pound to Yen", 151.47);
        conversionRates.put("Yen to Rupee", 0.007);
        conversionRates.put("Yen to Dollar", 0.009);
        conversionRates.put("Yen to Euro", 0.008);
        conversionRates.put("Yen to Pound", 0.007);
    }

    public static void main(String[] args) {

        System.out.println("1 Rupee");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        System.out.println("4 British Pound");
        System.out.println("5 Japanese Yen");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                convertCurrency("Rupee", amount);
                break;
            case 2:
                convertCurrency("Dollar", amount);
                break;
            case 3:
                convertCurrency("Euro", amount);
                break;
            case 4:
                convertCurrency("Pound", amount);
                break;
            case 5:
                convertCurrency("Yen", amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    public static void convertCurrency(String fromCurrency, double amount) {
        for (String toCurrency : conversionRates.keySet()) {
            if (toCurrency.startsWith(fromCurrency)) {
                double rate = conversionRates.get(toCurrency);
                System.out.println("1 " + fromCurrency + " = " + rate + " " + toCurrency.substring(toCurrency.indexOf("to") + 3));
                System.out.println(amount + " " + fromCurrency + " = " + (amount * rate) + " " + toCurrency.substring(toCurrency.indexOf("to") + 3));
                System.out.println();
            }
        }
    }
}
