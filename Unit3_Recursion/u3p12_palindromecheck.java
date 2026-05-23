package unit3_recursion;

import java.util.Scanner;

/*
---------------------------------------------------------
Program: Palindrome Check using Recursion
---------------------------------------------------------

Concept Used:
Recursion

This program checks whether a given string
is a palindrome or not using recursion.

---------------------------------------------------------
What is a Palindrome?
---------------------------------------------------------

A palindrome is a word or string that reads
the same from both directions.

Examples:

"madam"   → Palindrome
"racecar" → Palindrome
"level"   → Palindrome

"hello"   → Not Palindrome

---------------------------------------------------------
Logic Used
---------------------------------------------------------

Compare:
- First character
with
- Last character

If both are equal:
Move inward and repeat the process.

---------------------------------------------------------
Recursive Relation
---------------------------------------------------------

isPalindrome(str, st, end)

Checks:
1. Characters at positions st and end
2. Then recursively checks:
   st+1 and end-1

---------------------------------------------------------
Base Case
---------------------------------------------------------

If:
st >= end

It means:
- All characters matched successfully
OR
- Middle of string is reached

Hence:
String is a palindrome.

---------------------------------------------------------
Important Correction
---------------------------------------------------------

Incorrect Line:
str.charAt(str)

Reason:
charAt() requires an integer index,
not a string.

Correct Line:
str.charAt(st)

---------------------------------------------------------
Recursive Call Flow for "madam"
---------------------------------------------------------

isPalindrome("madam", 0, 4)

Compare:
m == m → true

Calls:
isPalindrome("madam", 1, 3)

Compare:
a == a → true

Calls:
isPalindrome("madam", 2, 2)

Now:
st >= end

Return true

---------------------------------------------------------
Output Example
---------------------------------------------------------

Input:
madam

Output:
Palindrome

---------------------------------------------------------
Time Complexity:
O(n)

Reason:
At most n/2 recursive calls occur.

---------------------------------------------------------
Auxiliary Space Complexity:
O(n)

Reason:
Recursive calls are stored in call stack.
---------------------------------------------------------
*/

public class u3p12_palindromecheck {

    /*
    ---------------------------------------------------------
    Recursive Function to Check Palindrome
    ---------------------------------------------------------
    */

    public static boolean isPalindrome(String str, int st, int end) {

        /*
        Base Case

        If starting index crosses ending index or both become equal, string is palindrome.
        */
        if (st >= end) {
            return true;
        }

        /*
        Compare characters at both ends.

        If equal:
        move inward recursively.

        If not equal:
        return false.
        */
        return (str.charAt(st) == str.charAt(end) && isPalindrome(str, st + 1, end - 1));
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking string input
        String str = sc.nextLine();

        // Closing scanner
        sc.close();

        /*
        Function Call

        Starting index = 0
        Ending index = length - 1
        */
        boolean result = isPalindrome(str, 0, str.length() - 1);

        // Printing result
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}