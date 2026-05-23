package unit3_recursion;

import java.util.Scanner;

/*
---------------------------------------------------------
Program: Nth Fibonacci Number using Recursion
---------------------------------------------------------

Concept Used:
Recursion

This program finds the Nth Fibonacci number
using recursive function calls.

---------------------------------------------------------
What is Fibonacci Series?
---------------------------------------------------------

A Fibonacci series is a sequence where:

Each number is obtained by adding
the previous two numbers.

Example Series:

1 1 2 3 5 8 13 21 ...

---------------------------------------------------------
Fibonacci Formula
---------------------------------------------------------

F(n) = F(n-1) + F(n-2)

Meaning:

Current Fibonacci number =
Previous Fibonacci number
+
Second Previous Fibonacci number

---------------------------------------------------------
Base Cases
---------------------------------------------------------

F(0) = 1
F(1) = 1

These are the starting values
of the Fibonacci sequence.

---------------------------------------------------------
Recursive Call Flow for fibonacci(5)
---------------------------------------------------------

fibonacci(5)
= fibonacci(4) + fibonacci(3)

fibonacci(4)
= fibonacci(3) + fibonacci(2)

fibonacci(3)
= fibonacci(2) + fibonacci(1)

fibonacci(2)
= fibonacci(1) + fibonacci(0)

fibonacci(1)
= 1

fibonacci(0)
= 1

Now returning back:

fibonacci(2) = 1 + 1 = 2
fibonacci(3) = 2 + 1 = 3
fibonacci(4) = 3 + 2 = 5
fibonacci(5) = 5 + 3 = 8

---------------------------------------------------------
Output Example
---------------------------------------------------------

Input:
5

Output:
8

---------------------------------------------------------
Important Observation
---------------------------------------------------------

Many recursive calls are repeated.

Example:
fibonacci(3) gets calculated multiple times.

Because of this,
recursive Fibonacci is NOT efficient for large inputs.

---------------------------------------------------------
Time Complexity:
O(2^n)

Reason:
Each function call creates two more recursive calls.

---------------------------------------------------------
Auxiliary Space Complexity:
O(n)

Reason:
Maximum recursion depth becomes n.
---------------------------------------------------------
*/

public class u3p10_nthfibonaccinumber {

    /*
    ---------------------------------------------------------
    Recursive Function to Find Fibonacci Number
    ---------------------------------------------------------
    */

    public static int fibonacci(int num) {

        /*
        Base Cases

        If num becomes 0 or 1,
        return 1 directly.
        */
        if (num == 0 || num == 1) {
            return 1;
        }

        /*
        Recursive Relation

        Current Fibonacci number =
        previous Fibonacci number
        +
        second previous Fibonacci number
        */
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        int number = sc.nextInt();

        // Closing scanner
        sc.close();

        // Function Call and Printing Result
        System.out.println(fibonacci(number));
    }
}