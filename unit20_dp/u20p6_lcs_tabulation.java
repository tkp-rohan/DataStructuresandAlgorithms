package unit20_dp;

public class u20p6_lcs_tabulation {

    // Tabulation solution for LCS
    // T.C. = O(m*n)
    // A.S. = O(m*n)

    public static int lcs(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Build DP table
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                // If characters match
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                }

                // If characters do not match
                else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {

        String s1 = "BXSAZ";
        String s2 = "BAZ";

        int ans = lcs(s1, s2);

        System.out.println("Length of LCS: " + ans);
    }
}