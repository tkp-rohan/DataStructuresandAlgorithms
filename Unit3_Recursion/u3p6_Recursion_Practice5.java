package unit3_recursion;

/*
---------------------------------------------------------
Program: Decimal to Binary Conversion using Recursion
---------------------------------------------------------

Concept Used:
Recursion

This program converts a decimal number into its
binary representation using recursion.

---------------------------------------------------------
Binary Conversion Logic
---------------------------------------------------------

To convert a decimal number into binary:

1. Divide the number by 2 repeatedly.
2. Store the remainder each time.
3. Read the remainders from bottom to top.

Example:
Decimal Number = 7

Step 1:
7 / 2 = 3 remainder 1

Step 2:
3 / 2 = 1 remainder 1

Step 3:
1 / 2 = 0 remainder 1

Binary = 111

---------------------------------------------------------
How Recursion Helps
---------------------------------------------------------

Recursion automatically stores function calls
in stack memory.

The function first keeps dividing the number by 2
until it becomes 0.

Then while returning back,
remainders are printed in reverse order,
which gives correct binary representation.

---------------------------------------------------------
Recursive Call Flow for n = 7
---------------------------------------------------------

fun(7)
    calls fun(3)

fun(3)
    calls fun(1)

fun(1)
    calls fun(0)

fun(0)
    Base case reached
    return

Now printing starts while returning:

1 % 2 = 1
3 % 2 = 1
7 % 2 = 1

Output:
111

---------------------------------------------------------
Another Example
---------------------------------------------------------

Input:
10

Recursive Calls:
fun(10)
    -> fun(5)
        -> fun(2)
            -> fun(1)
                -> fun(0)

Printing while returning:
1 0 1 0

Output:
1010

---------------------------------------------------------
Time Complexity:
O(log n)

Reason:
Number gets divided by 2 in every recursive call.

---------------------------------------------------------
Auxiliary Space Complexity:
O(log n)

Reason:
Recursive call stack stores log₂(n) calls.
---------------------------------------------------------
*/

public class u3p6_Recursion_Practice5 {

    /*
    ---------------------------------------------------------
    Function to Print Binary Representation
    ---------------------------------------------------------
    */

    public static void fun(int n) {

        // Base Case
        // Stops recursion when number becomes 0
        if (n == 0) {
            return;
        }

        /*
        Recursive Call

        Divide number by 2 and keep moving
        towards smaller subproblems.
        */
        fun(n / 2);

        /*
        Print remainder after division by 2

        Possible remainders:
        0 or 1

        These digits form the binary number.
        */
        System.out.print(n % 2);
    }

    public static void main(String[] args) {

        // Function call
        // Decimal number = 7
        fun(7);
    }
}