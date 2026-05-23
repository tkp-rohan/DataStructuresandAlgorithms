package unit3_recursion;

/*
---------------------------------------------------------
Program: Recursion Practice Pattern
---------------------------------------------------------

Concept Used:
Recursion

This program demonstrates:

1. Printing BEFORE recursive call
2. Printing AFTER recursive call

Because of this,
the same numbers are printed twice:
- First while going deeper into recursion
- Second while returning back from recursion

---------------------------------------------------------
Understanding the Flow
---------------------------------------------------------

Function Structure:

print(n)
fun(n-1)
print(n)

This creates two phases:

---------------------------------------------------------
Phase 1 → Going DOWN the recursion stack
---------------------------------------------------------

Numbers are printed before recursive call.

For n = 5:

print 5
print 4
print 3
print 2
print 1

---------------------------------------------------------
Phase 2 → Returning BACK from recursion
---------------------------------------------------------

Numbers are printed again after recursive call returns.

For n = 5:

print 1
print 2
print 3
print 4
print 5

---------------------------------------------------------
Complete Recursive Call Flow for fun(5)
---------------------------------------------------------

fun(5)
    print 5
    calls fun(4)

fun(4)
    print 4
    calls fun(3)

fun(3)
    print 3
    calls fun(2)

fun(2)
    print 2
    calls fun(1)

fun(1)
    print 1
    calls fun(0)

fun(0)
    Base case reached
    return

Now returning back:

print 1
print 2
print 3
print 4
print 5

---------------------------------------------------------
Final Output
---------------------------------------------------------

5
4
3
2
1
1
2
3
4
5

---------------------------------------------------------
Important Observation
---------------------------------------------------------

Anything written BEFORE recursive call executes
while moving deeper into recursion.

Anything written AFTER recursive call executes
while returning back from recursion.

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

public class u3p3_Recursion_Practice2 {

    /*
    ---------------------------------------------------------
    Recursive Function
    ---------------------------------------------------------
    */

    public static void fun(int n) {

        // Base Case
        // Stops recursion when n becomes 0
        if (n == 0) {
            return;
        }

        /*
        Printing BEFORE recursive call

        Executes while going deeper
        into recursion.
        */
        System.out.println(n);

        /*
        Recursive Call

        Function calls itself with smaller value.
        */
        fun(n - 1);

        /*
        Printing AFTER recursive call

        Executes while returning back
        from recursion.
        */
        System.out.println(n);
    }

    public static void main(String[] args) {

        // Function Call
        fun(5);
    }
}