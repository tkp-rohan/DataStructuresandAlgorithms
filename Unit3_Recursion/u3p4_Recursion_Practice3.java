package unit3_recursion;

/*
---------------------------------------------------------
Program: Recursive Tree Traversal Pattern
---------------------------------------------------------

Concept Used:
Recursion

This program demonstrates how recursive calls
can create a recursive tree structure.

The function:
1. Calls itself
2. Prints the current number
3. Calls itself again

Because of this,
the same values get printed multiple times.

---------------------------------------------------------
Understanding the Recursive Structure
---------------------------------------------------------

Function Structure:

fun(n)
{
    fun(n-1);
    print(n);
    fun(n-1);
}

This means:

LEFT Recursive Call
        ↓
Print Current Value
        ↓
RIGHT Recursive Call

---------------------------------------------------------
Recursive Call Tree for fun(3)
---------------------------------------------------------

fun(3)
│
├── fun(2)
│   │
│   ├── fun(1)
│   │   │
│   │   ├── fun(0) → return
│   │   ├── print 1
│   │   └── fun(0) → return
│   │
│   ├── print 2
│   │
│   └── fun(1)
│       │
│       ├── fun(0) → return
│       ├── print 1
│       └── fun(0) → return
│
├── print 3
│
└── fun(2)
    │
    ├── fun(1)
    │   │
    │   ├── fun(0) → return
    │   ├── print 1
    │   └── fun(0) → return
    │
    ├── print 2
    │
    └── fun(1)
        │
        ├── fun(0) → return
        ├── print 1
        └── fun(0) → return

---------------------------------------------------------
Final Output
---------------------------------------------------------

1
2
1
3
1
2
1

---------------------------------------------------------
Important Observation
---------------------------------------------------------

Each function call creates TWO more recursive calls.

Because of this,
number of calls grows exponentially.

---------------------------------------------------------
Time Complexity:
O(2^n)

Reason:
Every function call generates two recursive calls.

---------------------------------------------------------
Auxiliary Space Complexity:
O(n)

Reason:
Maximum recursion depth becomes n.
---------------------------------------------------------
*/

public class u3p4_Recursion_Practice3 {

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
        LEFT Recursive Call

        Function goes deeper first.
        */
        fun(n - 1);

        /*
        Print current value after
        returning from left recursion.
        */
        System.out.println(n);

        /*
        RIGHT Recursive Call

        Function again calls itself
        with smaller value.
        */
        fun(n - 1);
    }

    public static void main(String[] args) {

        // Function Call
        fun(3);
    }
}