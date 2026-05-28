package unit20_dp;

public class u20p9_editdistance {
    

    /*
    ====================================================
                    EDIT DISTANCE
    ====================================================

    Problem:
    --------
    Find minimum number of operations required to convert string s1 into string s2.

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
                    RECURSIVE IDEA
    ----------------------------------------------------

    If last characters are same:
    -> Ignore them
    -> Move to remaining strings

    Else:
    -> Try all 3 operations

        1) Insert
        2) Delete
        3) Replace

    and take minimum.


    ----------------------------------------------------
                    TIME COMPLEXITY
    ----------------------------------------------------

    T.C. = Exponential
    A.S. = O(m + n)

    ====================================================
    */


    public static int eD(String s1, String s2, int m, int n) {

        // If first string becomes empty
        // Insert all remaining characters of s2
        if (m == 0) {
            return n;
        }

        // If second string becomes empty
        // Delete all remaining characters of s1
        if (n == 0) {
            return m;
        }


        // If last characters are same
        // Ignore them
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {

            return eD(s1, s2, m - 1, n - 1);

        } else {

            // Insert
            int insert = eD(s1, s2, m, n - 1);

            // Delete
            int delete = eD(s1, s2, m - 1, n);

            // Replace
            int replace = eD(s1, s2, m - 1, n - 1);

            return 1 + Math.min(insert, Math.min(delete, replace));
        }
    }


    // ====================================================
    // MAIN METHOD
    // ====================================================

    public static void main(String[] args) {

        String s1 = "CAT";
        String s2 = "CUT";

        int ans = eD(s1, s2, s1.length(), s2.length());

        System.out.println("Minimum Edit Distance = " + ans);
    }

}