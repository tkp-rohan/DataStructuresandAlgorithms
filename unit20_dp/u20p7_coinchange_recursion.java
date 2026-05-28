package unit20_dp;

public class u20p7_coinchange_recursion {
    
    public static int countWays(int[] coins, int n, int sum){
        if(sum==0){
            return 1;
        }

        if(sum<0){
            return 0;
        }

        if(n==0){
            return 0;
        }

        return countWays(coins, n, sum-coins[n-1]) + countWays(coins, n-1, sum);
    }

    public static void main(String[] args) {

        int[] coins = {2, 3, 5};
        int sum = 20;
        int n = coins.length;

        // Recursive Solution
        int recursiveAnswer = countWays(coins, n, sum);

        System.out.println("Using Recursion:");
        System.out.println("Number of ways = " + recursiveAnswer);
    }

}
