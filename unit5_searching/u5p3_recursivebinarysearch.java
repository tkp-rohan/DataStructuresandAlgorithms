package unit5_searching;

/*
========================================
Recursive Binary Search in Java
========================================

Definition:
Binary Search is a searching algorithm used to find an element
in a SORTED array efficiently.

It works by repeatedly dividing the search space into half.

----------------------------------------
Time Complexity (T.C.)
----------------------------------------
Best Case  : O(1)
Average Case: O(log n)
Worst Case : O(log n)

----------------------------------------
Auxiliary Space (A.S.)
----------------------------------------
O(log n) because recursive function calls use stack memory.

----------------------------------------
Important Condition
----------------------------------------
The array MUST be sorted before applying Binary Search.

========================================
Working of Recursive Binary Search
========================================

1. Find the middle element.
2. If middle element == target:
      return index
3. If target is smaller:
      search in left half
4. If target is greater:
      search in right half
5. Repeat recursively until:
      element is found
      OR
      low > high

========================================
Example
========================================

Array = {10, 20, 30, 40, 50, 60}
Target = 50

Step 1:
low = 0
high = 5
mid = 2
arr[mid] = 30

50 > 30
Search right half

Step 2:
low = 3
high = 5
mid = 4
arr[mid] = 50

Element found at index 4

*/

public class u5p3_recursivebinarysearch {

    /*
    ------------------------------------------------
    Recursive Binary Search Function
    ------------------------------------------------

    Parameters:
    arr  -> Sorted array
    low  -> Starting index
    high -> Ending index
    x    -> Element to search

    Returns:
    Index of element if found
    -1 if element does not exist
    */

    public static int binarySearch(int[] arr, int low, int high, int x) {

        /*
        Base Condition:
        If low becomes greater than high,
        element is not present in array.
        */
        if (low > high) {
            return -1;
        }

        /*
        Find middle index.

        Correct Formula:
        mid = low + (high - low) / 2

        This avoids overflow problem.
        */
        int mid = low + (high - low) / 2;

        /*
        If middle element equals target,
        return its index.
        */
        if (arr[mid] == x) {
            return mid;
        }

        /*
        If target is smaller than middle element,
        search in LEFT half.
        */
        else if (arr[mid] > x) {

            // Recursive call on left side
            return binarySearch(arr, low, mid - 1, x);
        }

        /*
        If target is greater than middle element,
        search in RIGHT half.
        */
        else {

            // Recursive call on right side
            return binarySearch(arr, mid + 1, high, x);
        }
    }

    public static void main(String[] args) {

        // Sorted array
        int[] arr = {10, 20, 30, 40, 50, 60};

        // Element to search
        int x = 25;

        /*
        Function Call

        low = 0
        high = arr.length - 1
        */
        int result = binarySearch(arr, 0, arr.length - 1, x);

        /*
        Printing Output
        */
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}