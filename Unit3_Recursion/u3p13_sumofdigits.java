package unit3_recursion;

import java.util.Scanner;

/*
---------------------------------------------------------
Program: Sum of Digits using Recursion
---------------------------------------------------------

Concept Used:
Recursion

This program calculates the sum of digits
of a given number using recursion.

---------------------------------------------------------
Understanding the Logic
---------------------------------------------------------

For any number:

Last Digit  = num % 10
Remaining Number = num / 10

Example:
Number = 987689

Last digit:
987689 % 10 = 9

Remaining number:
987689 / 10 = 98768

So:

sumOfDigits(987689)
= 9 + sumOfDigits(98768)

---------------------------------------------------------
Recursive Relation
---------------------------------------------------------

sumOfDigits(num)
=
(last digit)
+
sum of remaining digits

Mathematically:

sumOfDigits(num)
=
(num % 10)
+
sumOfDigits(num / 10)

---------------------------------------------------------
Base Case
---------------------------------------------------------

If number becomes a single digit:

num < 10

return num directly.

---------------------------------------------------------
Recursive Call Flow for 987689
---------------------------------------------------------

sumOfDigits(987689)
= 9 + sumOfDigits(98768)

sumOfDigits(98768)
= 8 + sumOfDigits(9876)

sumOfDigits(9876)
= 6 + sumOfDigits(987)

sumOfDigits(987)
= 7 + sumOfDigits(98)

sumOfDigits(98)
= 8 + sumOfDigits(9)

sumOfDigits(9)
= 9      ← Base Case

Now returning back:

sumOfDigits(98)
= 8 + 9
= 17

sumOfDigits(987)
= 7 + 17
= 24

sumOfDigits(9876)
= 6 + 24
= 30

sumOfDigits(98768)
= 8 + 30
= 38

sumOfDigits(987689)
= 9 + 38
= 47

---------------------------------------------------------
Output
---------------------------------------------------------

Input:
987689

Output:
47

---------------------------------------------------------
Important Observation
---------------------------------------------------------

Each recursive call removes one digit
from the number.

Therefore:
Number of recursive calls depends on
number of digits.

---------------------------------------------------------
Time Complexity:
O(d)

Where:
d = number of digits

---------------------------------------------------------
Auxiliary Space Complexity:
O(d)

Reason:
Recursive calls are stored in call stack.
---------------------------------------------------------
*/

public class u3p13_sumofdigits {

    /*
    ---------------------------------------------------------
    Recursive Function to Find Sum of Digits
    ---------------------------------------------------------
    */

    public static int sumOfDigits(int num) {

        /*
        Base Case

        If number becomes single digit,
        return it directly.
        */
        if (num < 10) {
            return num;
        }

        /*
        Recursive Relation

        Last digit
        +
        Sum of remaining digits
        */
        return num % 10 + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        int number = sc.nextInt();

        // Closing scanner
        sc.close();

        // Function Call
        int res = sumOfDigits(number);

        // Printing result
        System.out.println(res);
    }
}