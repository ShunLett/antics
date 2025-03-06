import java.util.Scanner;

public class Main {
    // Conversion rates (Partner 1: EUR to USD, USD to EUR)
    static final double EUR_TO_USD = 1.05;
    static final double USD_TO_EUR = 1 / 1.05;

    // Conversion rates (Partner 2: MMK to USD, USD to MMK)
    static final double MMK_TO_USD = 0.0004766; // 1 MMK = 0.0004766 USD
    static final double USD_TO_MMK = 2098; // 1 USD = 2,098 MMK

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // instantiating a scanner object
        String exitMsg = "Exiting program now. Goodbye!";
        int choice;