package unit20_dp;

public class u20p3_tabulation {

    // Tabulation Fibonacci
    // T.C. = O(n)
    // A.S. = O(n)

    public static int fib(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        int[] table = new int[n + 1];

        table[0] = 0;
        table[1] = 1;

        // Fill table
        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }

        return table[n];
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(fib(n));
    }
}