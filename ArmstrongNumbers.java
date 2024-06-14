import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            int temp = num, sum = 0, n = Integer.toString(num).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, n);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
