package unit20_dp;

public class u20p8_coinchangedp{    
  
    /*
    ====================================================
                COIN CHANGE DP SOLUTION
    ====================================================

    Problem:
    --------
    Count the number of ways to make a given sum
    using infinite supply of given coins.

    Example:
    --------
    coins = {2, 3, 5}
    sum = 5

    Ways:
    1) 2 + 3
    2) 5

    Answer = 2


    ----------------------------------------------------
    DP IDEA
    ----------------------------------------------------

    dp[i][j] =
    Number of ways to make sum j
    using first i coins

    Formula:
    --------
    dp[i][j] =
        dp[i-1][j]                 -> Exclude current coin
        +
        dp[i][j - coins[i-1]]     -> Include current coin

    ====================================================
    */


    // ====================================================
    // DP TABULATION METHOD
    // ====================================================

    /*
        Time Complexity  : O(n * sum)
        Auxiliary Space  : O(n * sum)
    */

    public static int countWaysDP(int[] coins, int sum) {

        int n = coins.length;

        // DP table
        int[][] dp = new int[n + 1][sum + 1];

        // Base Case:
        // There is 1 way to make sum 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }


        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                // Exclude current coin
                dp[i][j] = dp[i - 1][j];

                // Include current coin
                if (coins[i - 1] <= j) {
                    dp[i][j] += dp[i][j - coins[i - 1]];
                }
            }
        }
        return dp[n][sum];
    }


    // ====================================================
    // MAIN METHOD
    // ====================================================

    public static void main(String[] args) {

        int[] coins = {2, 3, 5};
        int sum = 5;
        int ways = countWaysDP(coins, sum);
        System.out.println("Number of ways = " + ways);
    }

}