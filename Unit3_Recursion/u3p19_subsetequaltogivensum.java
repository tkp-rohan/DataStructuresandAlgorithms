package unit3_recursion;

public class u3p19_subsetequaltogivensum {

    // ------------------------------------------------------------
    // Naive Recursive Solution
    // ------------------------------------------------------------
    // Idea:
    // For every element, we have 2 choices:
    //
    // 1. Exclude the current element
    // 2. Include the current element
    //
    // We recursively explore all possible subsets.
    //
    // ------------------------------------------------------------
    // Time Complexity  : O(2^n)
    // Auxiliary Space  : O(n)
    // ------------------------------------------------------------

    public static int countSubsetsNaive(int[] arr, int n, int sum) {

        // Base Case:
        // If no elements are left,
        // check whether required sum is formed
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }

        // Case 1:
        // Exclude current element
        int exclude = countSubsetsNaive(arr, n - 1, sum);

        // Case 2:
        // Include current element
        int include = countSubsetsNaive(arr, n - 1, sum - arr[n - 1]);

        // Total subsets
        return exclude + include;
    }

    // ------------------------------------------------------------
    // Optimized Dynamic Programming Solution
    // ------------------------------------------------------------
    // Idea:
    // dp[i][j] =
    // Number of subsets using first i elements
    // having sum equal to j
    //
    // ------------------------------------------------------------
    // Time Complexity  : O(n * sum)
    // Auxiliary Space  : O(n * sum)
    // ------------------------------------------------------------

    public static int countSubsetsOptimized(int[] arr, int sum) {

        int n = arr.length;

        // DP table
        int[][] dp = new int[n + 1][sum + 1];

        // Sum 0 is always possible
        // using empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= sum; j++) {

                // Exclude current element
                dp[i][j] = dp[i - 1][j];

                // Include current element
                if (arr[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 15};
        int sum = 25;

        // Naive Recursive Answer
        int naiveAns = countSubsetsNaive(arr, arr.length, sum);

        // Optimized DP Answer
        int optimizedAns = countSubsetsOptimized(arr, sum);

        System.out.println("Naive Answer = " + naiveAns);
        System.out.println("Optimized Answer = " + optimizedAns);
    }
}