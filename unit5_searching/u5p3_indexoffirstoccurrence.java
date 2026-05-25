package unit5_searching;

/*
====================================================
Index of First Occurrence using Binary Search
====================================================

Definition:
This program finds the FIRST occurrence of an element
in a SORTED array using Recursive Binary Search.

----------------------------------------------------
Why Normal Binary Search is Not Enough?
----------------------------------------------------

Normal Binary Search may return ANY occurrence
of the element.

Example:
Array = {5, 10, 10, 10, 15}

Searching for 10 may return:
index 1 OR 2 OR 3

But in this problem we specifically need:
FIRST occurrence → index 1

----------------------------------------------------
Approaches
----------------------------------------------------

1. Naive Approach
   - Traverse array from left to right
   - Return first matching index

   Time Complexity  : O(n)
   Auxiliary Space  : O(1)

2. Efficient Binary Search Approach
   - Use Binary Search
   - Continue searching in LEFT half
     even after finding the element

   Time Complexity  : O(log n)
   Auxiliary Space  : O(log n)
   (because recursive calls use stack memory)

----------------------------------------------------
Important Condition
----------------------------------------------------
Array MUST be sorted.

====================================================
Example
====================================================

Array = {5, 10, 10, 15, 15}
Target = 15

Step 1:
low = 0
high = 4
mid = 2
arr[mid] = 10

15 > 10
Search right half

Step 2:
low = 3
high = 4
mid = 3
arr[mid] = 15

Now check:
Is this the FIRST occurrence?

mid == 0 ? NO
arr[mid - 1] = 10

Since previous element is different,
index 3 is the first occurrence.

Output = 3

====================================================
*/

public class u5p3_indexoffirstoccurrence {

    /*
    ====================================================
    Naive Approach
    ====================================================

    Traverse array from left to right.
    Return first index where element is found.

    T.C. = O(n)
    A.S. = O(1)
    */

    // public static int searchFirst(int[] arr, int k) {
    //
    //     int n = arr.length;
    //
    //     for (int i = 0; i < n; i++) {
    //
    //         if (arr[i] == k) {
    //             return i;
    //         }
    //     }
    //
    //     return -1;
    // }


    /*
    ====================================================
    Efficient Recursive Binary Search Approach
    ====================================================

    Parameters:
    arr  -> Sorted array
    low  -> Starting index
    high -> Ending index
    k    -> Element to search

    Returns:
    Index of FIRST occurrence
    OR
    -1 if element not found

    T.C. = O(log n)
    A.S. = O(log n)
    */

    public static int searchFirst(int[] arr, int low, int high, int k) {

        /*
        Base Condition:
        If low crosses high,
        element does not exist.
        */
        if (low > high) {
            return -1;
        }

        /*
        Find middle index.

        Safer formula avoids overflow.
        */
        int mid = low + (high - low) / 2;

        /*
        If target is greater than middle element,
        search in RIGHT half.
        */
        if (k > arr[mid]) {

            return searchFirst(arr, mid + 1, high, k);
        }

        /*
        If target is smaller than middle element,
        search in LEFT half.
        */
        else if (k < arr[mid]) {

            return searchFirst(arr, low, mid - 1, k);
        }

        /*
        Element found at mid.
        Now check whether it is the FIRST occurrence.
        */
        else {

            /*
            FIRST occurrence conditions:

            1. mid is 0
               OR

            2. Previous element is different
            */
            if(mid == 0 || arr[mid - 1] != arr[mid]) {

                return mid;
            }

            /*
            If previous element is same,
            first occurrence lies in LEFT half.
            */
            else{

                return searchFirst(arr, low, mid - 1, k);
            }
        }
    }

    public static void main(String[] args) {

        // Sorted array
        int[] arr = {5, 10, 10, 15, 15};

        // Element to search
        int k = 15;

        /*
        low = 0
        high = arr.length - 1
        */
        int low = 0;
        int high = arr.length - 1;

        // Function call
        int result = searchFirst(arr, low, high, k);

        // Output
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("First occurrence found at index: " + result);
        }
    }
}