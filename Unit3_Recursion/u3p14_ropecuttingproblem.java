package unit3_recursion;

public class u3p14_ropecuttingproblem {
    
    // Recursive Solution
    // T.C. = O(3^n)
    // A.S. = O(n)

    public static int maxPieces(int n, int a, int b, int c) {

        // Base Case:
        // If rope length becomes exactly 0,
        // a valid set of cuts is found
        if (n == 0) {
            return 0;
        }

        // If rope length becomes negative,
        // this cut combination is invalid
        if (n < 0) {
            return -1;
        }

        // Try cutting with lengths a, b and c
        int res = Math.max(
                maxPieces(n - a, a, b, c),
                Math.max(
                    maxPieces(n - b, a, b, c),
                    maxPieces(n - c, a, b, c)
                )
            );

        // If all possibilities are invalid
        
        if (res == -1) {
            return -1;
        }

        // Include current cut
        return res + 1;
    }

    public static void main(String[] args) {

        int n = 23;
        int a = 11;
        int b = 9;
        int c = 12;

        int ans = maxPieces(n, a, b, c);

        System.out.println(ans);
    }
}