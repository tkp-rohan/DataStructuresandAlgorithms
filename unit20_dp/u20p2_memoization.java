package unit20_dp;

import java.util.*;

public class u20p2_memoization {

    // Memoization Fibonacci
    // T.C. = O(n)
    // A.S. = O(n)

    public static int fib(int n, int[] memo) {

        // If already calculated
        if (memo[n] != -1) {
            return memo[n];
        }

        int res;

        // Base cases
        if (n == 0 || n == 1) {
            res = n;
        }

        // Recursive case
        else {
            res = fib(n - 1, memo) + fib(n - 2, memo);
        }

        memo[n] = res;

        return memo[n];
    }

    public static void main(String[] args) {

        int n = 5;

        int[] memo = new int[n + 1];

        Arrays.fill(memo, -1);

        System.out.println(fib(n, memo));
    }
}