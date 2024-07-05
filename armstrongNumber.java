import java.util.Scanner;
public class armstrongNumber {

    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        int temp = num, sum = 0, n = Integer.toString(num).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
    
}
