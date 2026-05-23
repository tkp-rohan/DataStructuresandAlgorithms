package unit3_recursion;

import java.util.*;

/*
---------------------------------------------------------
Program: Tail Recursion Demonstration
---------------------------------------------------------

Concept Used:
Tail Recursion

Tail recursion is a special type of recursion where
the recursive call is the LAST operation performed
inside the function.

No work remains after the recursive call returns.

---------------------------------------------------------
Why is this Tail Recursion?
---------------------------------------------------------

Function Structure:

System.out.println(n);
printNto1(n - 1);

Notice carefully:

After recursive call:
printNto1(n - 1);

there is NO statement left to execute.

Hence this becomes:
Tail Recursion

---------------------------------------------------------
How the Program Works
---------------------------------------------------------

This program prints numbers from:
N to 1

using tail recursion.

---------------------------------------------------------
Recursive Call Flow for n = 5
---------------------------------------------------------

printNto1(5)
    print 5
    calls printNto1(4)

printNto1(4)
    print 4
    calls printNto1(3)

printNto1(3)
    print 3
    calls printNto1(2)

printNto1(2)
    print 2
    calls printNto1(1)

printNto1(1)
    print 1
    calls printNto1(0)

printNto1(0)
    Base case reached
    return

---------------------------------------------------------
Final Output
---------------------------------------------------------

5
4
3
2
1

---------------------------------------------------------
Important Observation
---------------------------------------------------------

Printing happens BEFORE recursive call.

So values are printed while moving deeper
into recursion.

---------------------------------------------------------
Tail Recursion vs Non-Tail Recursion
---------------------------------------------------------

Tail Recursive:
print
recursive call

Non-Tail Recursive:
recursive call
print

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

NOTE:
Java does NOT perform Tail Call Optimization (TCO).
---------------------------------------------------------
*/

public class u3p9_tailrecursion {

    /*
    ---------------------------------------------------------
    Tail Recursive Function
    ---------------------------------------------------------
    */

    public static void printNto1(int n) {

        // Base Case
        // Stops recursion when n becomes 0
        if (n == 0) {
            return;
        }

        /*
        Work done BEFORE recursive call
        */
        System.out.println(n);

        /*
        Recursive Call

        This is the LAST operation
        inside the function.

        Therefore:
        This is Tail Recursion.
        */
        printNto1(n - 1);
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