package unit20_dp;

public class u20p10_editdistancedp {
    

    /*
    ====================================================
                    EDIT DISTANCE DP
    ====================================================

    Problem:
    --------
    Find minimum number of operations required
    to convert one string into another.

    Allowed Operations:
    -------------------
    1) Insert
    2) Delete
    3) Replace


    Example:
    --------
    s1 = "CAT"
    s2 = "CUT"

    Replace A with U

    Answer = 1


    ----------------------------------------------------
                    DP IDEA
    ----------------------------------------------------

    dp[i][j] =
    Minimum operations required to convert

    first i characters of s1
    into
    first j characters of s2


    ----------------------------------------------------
                    TRANSITIONS
    ----------------------------------------------------

    If characters are same:

    dp[i][j] = dp[i-1][j-1]


    Else:

    dp[i][j] =
    1 + minimum of:

    1) Insert  -> dp[i][j-1]
    2) Delete  -> dp[i-1][j]
    3) Replace -> dp[i-1][j-1]


    ----------------------------------------------------
                    COMPLEXITIES
    ----------------------------------------------------

    Time Complexity  : O(m * n)
    Auxiliary Space  : O(m * n)

    ====================================================
    */


    // ====================================================
    // DP TABULATION METHOD
    // ====================================================

    public static int eDDP(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];


        // ====================================================
        // BASE CASES
        // ====================================================

        // If first string becomes empty
        // Insert all characters of second string
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // If second string becomes empty
        // Delete all characters of first string
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }


        // ====================================================
        // FILL DP TABLE
        // ====================================================

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters are same
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }

                // If characters are different
                else {
                    // Insert operation
                    int insert = dp[i][j - 1];

                    // Delete operation
                    int delete = dp[i - 1][j];

                    // Replace operation
                    int replace = dp[i - 1][j - 1];

                    dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
                }
            }
        }
        return dp[m][n];
    }


    // ====================================================
    // MAIN METHOD
    // ====================================================

    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "CUT";
        int ans = eDDP(s1, s2);
        System.out.println("Minimum Edit Distance = " + ans);
    }

}