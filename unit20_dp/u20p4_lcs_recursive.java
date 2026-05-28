package unit20_dp;

public class u20p4_lcs_recursive {

    // Recursive solution for Longest Common Subsequence
    // T.C. = O(2^(m+n))
    // A.S. = O(m+n)

    public static int lcs(String s1, String s2, int m, int n) {

        // Base case
        if (m == 0 || n == 0) {
            return 0;
        }

        // If last characters match
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s2, m - 1, n - 1);
        }

        // If last characters do not match
        return Math.max(
                lcs(s1, s2, m - 1, n),
                lcs(s1, s2, m, n - 1)
        );
    }

    public static void main(String[] args) {

        String s1 = "BAZ";
        String s2 = "BAZ";

        int ans = lcs(s1, s2, s1.length(), s2.length());

        System.out.println("Length of LCS: " + ans);
    }
}