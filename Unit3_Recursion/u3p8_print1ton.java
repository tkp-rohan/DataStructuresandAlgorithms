package unit3_recursion;

import java.util.Scanner;

/*
---------------------------------------------------------
Program: Print Numbers from 1 to N using Recursion
---------------------------------------------------------

Concept Used:
Recursion

Recursion means a function calls itself repeatedly
until a stopping condition (base case) is reached.

---------------------------------------------------------
Working of the Program
---------------------------------------------------------

Suppose input is:
5

Function Calls:

printNto1(5)
    -> calls printNto1(4)
        -> calls printNto1(3)
            -> calls printNto1(2)
                -> calls printNto1(1)
                    -> calls printNto1(0)

Base case reached when n == 0
Function starts returning back.

Now printing happens during returning phase:

print 1
print 2
print 3
print 4
print 5

Output:
1
2
3
4
5

---------------------------------------------------------
Time Complexity:
O(n)

Reason:
Function is called exactly n times.

---------------------------------------------------------
Auxiliary Space Complexity:
O(n)

Reason:
Recursive function calls are stored in the call stack.
---------------------------------------------------------
*/

public class u3p8_print1ton {

    /*
    ---------------------------------------------------------
    Recursive Function to Print Numbers from 1 to N
    ---------------------------------------------------------
    */

    public static void printNto1(int n) {

        // Base Case
        // Stops recursion when n becomes 0
        if (n == 0) {
            return;
        }

        /*
        Recursive Call

        Function keeps calling itself with smaller value:
        n-1

        This moves towards the base case.
        */
        printNto1(n - 1);

        /*
        Printing happens AFTER recursive call.

        Because of this,
        numbers are printed while returning back
        from recursion.

        Hence output becomes:
        1 to N
        */
        System.out.println(n);
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        int number = sc.nextInt();

        // Closing scanner
        sc.close();

        // Function Call
        printNto1(number);
    }
}