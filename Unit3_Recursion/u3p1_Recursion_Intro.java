package unit3_recursion;

/*
---------------------------------------------------------
Program: Introduction to Function Calls
---------------------------------------------------------

Concept Used:
Function Calling

This program demonstrates:
1. How functions call other functions
2. Execution flow of a program
3. Control transfer between methods

NOTE:
This is NOT recursion because:
- fun1() does not call itself
- fun2() does not call itself

Instead,
this program demonstrates normal function calling.

---------------------------------------------------------
Understanding the Flow
---------------------------------------------------------

Execution always starts from:
main()

main() calls:
fun2()

fun2() further calls:
fun1()

After fun1() finishes,
control returns back to fun2()

After fun2() finishes,
control returns back to main()

---------------------------------------------------------
Step-by-Step Execution Flow
---------------------------------------------------------

Step 1:
main() executes

Print:
Before fun2

Step 2:
main() calls fun2()

Inside fun2():

Print:
Before fun1

Step 3:
fun2() calls fun1()

Inside fun1():

Print:
fun1

fun1() finishes and returns back to fun2()

Step 4:
Remaining statements of fun2() execute

Print:
After fun1

fun2() finishes and returns back to main()

Step 5:
Remaining statements of main() execute

Print:
After fun2

---------------------------------------------------------
Final Output
---------------------------------------------------------

Before fun2
Before fun1
fun1
After fun1
After fun2

---------------------------------------------------------
Important Observation
---------------------------------------------------------

Whenever a function is called:
1. Control moves to called function
2. Called function executes completely
3. Control returns back to caller function

This follows:
LIFO (Last In First Out)

Similar to stack behavior.

---------------------------------------------------------
Time Complexity:
O(1)

Reason:
Fixed number of function calls.

---------------------------------------------------------
Auxiliary Space Complexity:
O(1)

Reason:
Only a few function calls are stored.
---------------------------------------------------------
*/

public class u3p1_Recursion_Intro {

    /*
    ---------------------------------------------------------
    Function fun1()
    ---------------------------------------------------------
    */

    public static void fun1() {

        // Prints message
        System.out.println("fun1");
    }

    /*
    ---------------------------------------------------------
    Function fun2()
    ---------------------------------------------------------
    */

    public static void fun2() {

        // Executes before calling fun1()
        System.out.println("Before fun1");

        // Function Call
        fun1();

        // Executes after fun1() finishes
        System.out.println("After fun1");
    }

    public static void main(String[] args) {

        // Executes before calling fun2()
        System.out.println("Before fun2");

        // Function Call
        fun2();

        // Executes after fun2() finishes
        System.out.println("After fun2");
    }
}