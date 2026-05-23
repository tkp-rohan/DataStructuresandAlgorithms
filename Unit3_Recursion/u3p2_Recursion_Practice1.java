package unit3_recursion;

/*
---------------------------------------------------------
Program: Basic Recursion Demonstration
---------------------------------------------------------

Concept Used:
Recursion

Recursion means a function calling itself repeatedly
until a stopping condition (base case) is reached.

This program demonstrates:
1. Recursive function calls
2. Base case
3. How recursion moves towards termination

---------------------------------------------------------
Understanding the Program
---------------------------------------------------------

Function:
fun1(num)

Behavior:
- Prints "Inside Fun1"
- Calls itself with num - 1
- Continues until num becomes 0

---------------------------------------------------------
Recursive Call Flow for num = 5
---------------------------------------------------------

fun1(5)
    print "Inside Fun1"
    calls fun1(4)

fun1(4)
    print "Inside Fun1"
    calls fun1(3)

fun1(3)
    print "Inside Fun1"
    calls fun1(2)

fun1(2)
    print "Inside Fun1"
    calls fun1(1)

fun1(1)
    print "Inside Fun1"
    calls fun1(0)

fun1(0)
    Base case reached
    return

---------------------------------------------------------
Final Output
---------------------------------------------------------

Inside Fun1
Inside Fun1
Inside Fun1
Inside Fun1
Inside Fun1

---------------------------------------------------------
Important Observation
---------------------------------------------------------

At every recursive call:
num decreases by 1

This helps recursion eventually reach:
num == 0

Without this,
the recursion would continue infinitely
and cause StackOverflowError.

---------------------------------------------------------
Understanding Base Case
---------------------------------------------------------

Base Case:
if(temp == 0)

Purpose:
Stops recursive calls.

Every recursive function MUST have:
1. Base case
2. Smaller subproblem

---------------------------------------------------------
Time Complexity:
O(n)

Reason:
Function is called n times.

---------------------------------------------------------
Auxiliary Space Complexity:
O(n)

Reason:
Each recursive call is stored in call stack.
---------------------------------------------------------
*/

public class u3p2_Recursion_Practice1 {

    /*
    ---------------------------------------------------------
    Recursive Function
    ---------------------------------------------------------
    */

    public static void fun1(int num) {

        // Copying value into temporary variable
        int temp = num;

        /*
        Base Case

        Stops recursion when temp becomes 0.
        */
        if (temp == 0) {
            return;
        }

        /*
        Statement executed before recursive call.

        So this prints while moving deeper
        into recursion.
        */
        System.out.println("Inside Fun1");

        /*
        Recursive Call

        Function calls itself with smaller value.
        */
        fun1(temp - 1);
    }

    public static void main(String[] args) {

        // Initial value
        int number = 5;

        // Function Call
        fun1(number);
    }
}