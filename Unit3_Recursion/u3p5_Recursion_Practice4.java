package unit3_recursion;

/*
---------------------------------------------------------
Program: Demonstration of log₂(n) using Recursion
---------------------------------------------------------

Concept Used:
Recursion

This program calculates:

log₂(n)

Meaning:
How many times a number can be divided by 2
until it becomes 1.

---------------------------------------------------------
Understanding log₂(n)
---------------------------------------------------------

Example:
n = 32

32 → 16 → 8 → 4 → 2 → 1

Number of divisions = 5

Therefore:

log₂(32) = 5

---------------------------------------------------------
How the Recursive Function Works
---------------------------------------------------------

At every recursive call:

1. Number is divided by 2
2. Count increases by 1
3. Process continues until n becomes 1

---------------------------------------------------------
Recursive Call Flow for n = 32
---------------------------------------------------------

fun(32)
= 1 + fun(16)

fun(16)
= 1 + fun(8)

fun(8)
= 1 + fun(4)

fun(4)
= 1 + fun(2)

fun(2)
= 1 + fun(1)

fun(1)
= 0      ← Base Case

Now returning back:

fun(2)  = 1 + 0 = 1
fun(4)  = 1 + 1 = 2
fun(8)  = 1 + 2 = 3
fun(16) = 1 + 3 = 4
fun(32) = 1 + 4 = 5

Output:
5

---------------------------------------------------------
Important Observation
---------------------------------------------------------

Each recursive call reduces the problem size to half.

That is why:
Time Complexity becomes logarithmic.

---------------------------------------------------------
Time Complexity:
O(log n)

Reason:
Number gets divided by 2 in every recursive call.

---------------------------------------------------------
Auxiliary Space Complexity:
O(log n)

Reason:
Recursive call stack stores log₂(n) function calls.
---------------------------------------------------------
*/

public class u3p5_Recursion_Practice4 {

    /*
    ---------------------------------------------------------
    Recursive Function to Calculate log₂(n)
    ---------------------------------------------------------
    */

    public static int fun(int n) {

        // Base Case
        // When number becomes 1,
        // no more divisions are possible
        if (n == 1) {
            return 0;
        } else {

            /*
            Recursive Relation

            1 represents current division by 2

            fun(n/2) calculates remaining divisions
            */
            return 1 + fun(n / 2);
        }
    }

    public static void main(String[] args) {

        // Function Call
        // log₂(32) = 5
        System.out.println(fun(32));
    }
}