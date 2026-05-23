package unit3_recursion;

public class u3p18_josephusproblem {
    
    // Recursive Solution
    // T.C. = O(n)
    // A.S. = O(n)

    // Returns safe position using 0-based indexing
    public static int jos(int n, int k) {

        // Base Case:
        // If only one person is left,
        // position 0 survives
        if (n == 1) {
            return 0;
        }

        // Recursive Relation
        return (jos(n - 1, k) + k) % n;
    }

    // Returns safe position using 1-based indexing
    public static int myJos(int n, int k) {
        return jos(n, k) + 1;
    }

    public static void main(String[] args) {

        int n = 5;
        int k = 3;

        System.out.println("Safe Position (1-based indexing):");
        System.out.println(myJos(n, k));
    }
}