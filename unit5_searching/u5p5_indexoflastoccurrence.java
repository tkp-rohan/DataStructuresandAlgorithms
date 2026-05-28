package unit5_searching;

/*
====================================================
Index of Last Occurrence using Binary Search
====================================================

Definition:
This program finds the LAST occurrence of an element
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
LAST occurrence → index 3

----------------------------------------------------
Approaches
----------------------------------------------------

1. Naive Approach
   - Traverse array from right to left
   - Return first matching index

   Time Complexity  : O(n)
   Auxiliary Space  : O(1)

2. Efficient Binary Search Approach
   - Use Binary Search
   - Continue searching in RIGHT half
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
Is this the LAST occurrence?

mid == arr.length - 1 ? NO
arr[mid + 1] = 15

Since next element is same,
last occurrence lies in RIGHT half.

Step 3:
low = 4
high = 4
mid = 4
arr[mid] = 15

mid == arr.length - 1
So index 4 is the last occurrence.

Output = 4

====================================================
*/

public class u5p5_indexoflastoccurrence {

    /*
    ====================================================
    Naive Approach
    ====================================================

    Traverse array from right to left.
    Return first index where element is found.

    T.C. = O(n)
    A.S. = O(1)
    */

    // public static int searchLast(int[] arr, int k) {
    //
    //     int n = arr.length;
    //
    //     for (int i = n - 1; i >= 0; i--) {
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
    Index of LAST occurrence
    OR
    -1 if element not found

    T.C. = O(log n)
    A.S. = O(log n)
    */

    public static int searchLast(int[] arr, int low, int high, int k) {

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

            return searchLast(arr, mid + 1, high, k);
        }

        /*
        If target is smaller than middle element,
        search in LEFT half.
        */
        else if (k < arr[mid]) {

            return searchLast(arr, low, mid - 1, k);
        }

        /*
        Element found at mid.
        Now check whether it is the LAST occurrence.
        */
        else {

            /*
            LAST occurrence conditions:

            1. mid is last index
               OR

            2. Next element is different
            */
            if(mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {

                return mid;
            }

            /*
            If next element is same,
            last occurrence lies in RIGHT half.
            */
            else{

                return searchLast(arr, mid + 1, high, k);
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
        int result = searchLast(arr, low, high, k);

        // Output
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Last occurrence found at index: " + result);
        }
    }
}