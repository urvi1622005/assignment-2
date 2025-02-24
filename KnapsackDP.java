import java.util.Scanner;

public class KnapsackDP {
    public static int knapsack(int n, int M, int[] W, int[] V) {
        int[][] dp = new int[n + 1][M + 1];

        // Filling DP Table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                if (W[i - 1] <= j) { 
                    dp[i][j] = Math.max(dp[i - 1][j], V[i - 1] + dp[i - 1][j - W[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][M]; // Maximum value chor leke ja sakta hai
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();
        
        System.out.print("Enter max weight thief can carry: ");
        int M = sc.nextInt();
        
        int[] W = new int[n]; // Weights
        int[] V = new int[n]; // Values

        System.out.println("Enter weight and value of each package:");
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }

        // Output the maximum value
        System.out.println("Max value chor leke ja sakta hai: " + knapsack(n, M, W, V));
        
        sc.close();
    }
}
