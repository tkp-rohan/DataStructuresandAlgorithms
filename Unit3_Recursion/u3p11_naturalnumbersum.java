package unit3_recursion;

import java.util.Scanner;

/*
---------------------------------------------------------
Program: Sum of First N Natural Numbers using Recursion
---------------------------------------------------------

Concept Used:
Recursion

This program calculates the sum of first N
natural numbers using recursion.

---------------------------------------------------------
What are Natural Numbers?
---------------------------------------------------------

Natural numbers are positive counting numbers.

Example:
1, 2, 3, 4, 5 ...

---------------------------------------------------------
Formula for Sum of First N Natural Numbers
---------------------------------------------------------

Sum = 1 + 2 + 3 + ... + N

Example:
For N = 5

Sum = 1 + 2 + 3 + 4 + 5
    = 15

---------------------------------------------------------
Recursive Relation
---------------------------------------------------------

sum(n) = n + sum(n-1)

Meaning:

Current number
+
Sum of smaller numbers

---------------------------------------------------------
Base Case
---------------------------------------------------------

sum(0) = 0

This stops recursion.

---------------------------------------------------------
Recursive Call Flow for sumOfNumbers(5)
---------------------------------------------------------

sumOfNumbers(5)
= 5 + sumOfNumbers(4)

sumOfNumbers(4)
= 4 + sumOfNumbers(3)

sumOfNumbers(3)
= 3 + sumOfNumbers(2)

sumOfNumbers(2)
= 2 + sumOfNumbers(1)

sumOfNumbers(1)
= 1 + sumOfNumbers(0)

sumOfNumbers(0)
= 0      ← Base Case

Now returning back:

sumOfNumbers(1) = 1 + 0  = 1
sumOfNumbers(2) = 2 + 1  = 3
sumOfNumbers(3) = 3 + 3  = 6
sumOfNumbers(4) = 4 + 6  = 10
sumOfNumbers(5) = 5 + 10 = 15

---------------------------------------------------------
Output Example
---------------------------------------------------------

Input:
5

Output:
15

---------------------------------------------------------
Important Observation
---------------------------------------------------------

Each recursive call reduces the problem size by 1.

Recursion continues until:
num becomes 0

---------------------------------------------------------
Time Complexity:
O(n)

Reason:
Function is called exactly n times.

---------------------------------------------------------
Auxiliary Space Complexity:
O(n)

Reason:
Recursive calls are stored in call stack.
---------------------------------------------------------
*/

public class u3p11_naturalnumbersum {

    /*
    ---------------------------------------------------------
    Recursive Function to Find Sum
    ---------------------------------------------------------
    */

    public static int sumOfNumbers(int num) {

        /*
        Base Case

        When num becomes 0,
        no numbers are left to add.
        */
        if (num == 0) {
            return 0;
        }

        /*
        Recursive Relation

        Current number
        +
        Sum of smaller numbers
        */
        return num + sumOfNumbers(num - 1);
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        int number = sc.nextInt();

        // Closing scanner
        sc.close();

        // Function Call and Printing Result
        System.out.println(sumOfNumbers(number));
    }
}