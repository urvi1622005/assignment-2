package random;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double USD_RATE = 0.012; // Example conversion rate

        System.out.print("Enter amount in INR: ");
        double inr = scanner.nextDouble();

        double usd = inr * USD_RATE;

        System.out.println("Equivalent amount in USD: " + usd);
    }
}
