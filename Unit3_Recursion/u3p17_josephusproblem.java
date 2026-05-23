package unit3_recursion;

public class u3p17_josephusproblem {
    
    // Recursive Solution
    // T.C. = O(n)
    // A.S. = O(n)

    public static int jos(int n, int k) {

        // Base Case:
        // If only 1 person is left,
        // that person survives
        if (n == 1) {
            return 0;
        }

        // Recursive Relation:
        // Safe position for n people
        // = (safe position for n-1 people + k) % n
        return (jos(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {

        int n = 5;
        int k = 3;

        System.out.println(jos(n, k));
    }
}