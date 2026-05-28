package unit20_dp;

import java.util.Arrays;

public class u20p5_lcs_memoization {

    // Memoization solution for LCS
    // T.C. = O(m*n)
    // A.S. = O(m*n)

    public static int lcs(String s1, String s2, int m, int n, int[][] memo) {

        // If already calculated
        if (memo[m][n] != -1) {
            return memo[m][n];
        }

        // Base case
        if (m == 0 || n == 0) {
            memo[m][n] = 0;
        }

        // If characters match
        else if (s1.charAt(m - 1) == s2.charAt(n - 1)) {

            memo[m][n] = 1 + lcs(s1, s2, m - 1, n - 1, memo);

        }

        // If characters do not match
        else {

            memo[m][n] = Math.max(
                    lcs(s1, s2, m - 1, n, memo),
                    lcs(s1, s2, m, n - 1, memo)
            );
        }

        return memo[m][n];
    }

    public static void main(String[] args) {

        String s1 = "BXSAZ";
        String s2 = "BAZ";

        int m = s1.length();
        int n = s2.length();

        int[][] memo = new int[m + 1][n + 1];

        // Fill memo array with -1
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        int ans = lcs(s1, s2, m, n, memo);

        System.out.println("Length of LCS: " + ans);
    }
}