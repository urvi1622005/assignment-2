import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter time (T) in years: ");
        int time = scanner.nextInt();
        System.out.print("Enter rate (R): ");
        double rate = scanner.nextDouble();

        double interest = (principal * time * rate) / 100;

        System.out.println("Simple Interest: " + interest);
    }
}
