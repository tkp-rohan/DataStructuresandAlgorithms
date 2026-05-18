package unit4_arrays;

public class u4p29_subarraywithgivensum {

    /*
    ============================================================
                SUBARRAY WITH GIVEN SUM
    ============================================================

    Problem:
    --------
    Given an array of POSITIVE integers
    and a target sum,

    check whether there exists a contiguous
    subarray whose sum is equal to given sum.

    ------------------------------------------------------------
    WHAT IS A CONTIGUOUS SUBARRAY?
    ------------------------------------------------------------

    Elements must be continuous (adjacent).

    Example:
    --------
    Array = {1, 4, 20, 3, 10, 5}

    Valid Subarray:
    {20, 3, 10}

    Invalid:
    {1, 20, 5}
    because elements are not adjacent.

    ============================================================
    EXAMPLE
    ============================================================

    Array:
    {1, 4, 20, 3, 10, 5}

    Required Sum:
    33

    Subarray:
    {20, 3, 10}

    Sum = 33

    Therefore Answer = TRUE

    ============================================================
    */



    // ============================================================
    // NAIVE APPROACH
    // ============================================================

    /*
    Time Complexity  : O(n²)
    Auxiliary Space  : O(1)

    ------------------------------------------------------------
    IDEA
    ------------------------------------------------------------

    Generate every possible subarray.

    Calculate sum of each subarray.

    If any subarray sum becomes equal to
    required sum,
    return true.

    ------------------------------------------------------------
    WHY IS IT SLOW?
    ------------------------------------------------------------

    For every starting index,
    we traverse remaining elements again.

    Hence nested loops are used.

    ============================================================
    */

    // public static boolean isSubSumEqual(int[] arr, int sum){

    //     // Size of array
    //     int n = arr.length;



    //     // Traverse every starting index
    //     for(int i = 0; i < n; i++){

    //         // Stores current subarray sum
    //         int curr = 0;



    //         // Extend subarray
    //         for(int j = i; j < n; j++){

    //             curr += arr[j];



    //             // Required sum found
    //             if(curr == sum){

    //                 return true;
    //             }
    //         }
    //     }



    //     // No subarray found
    //     return false;
    // }





    // ============================================================
    // OPTIMIZED APPROACH
    // Sliding Window Technique
    // ============================================================

    /*
    Time Complexity  : O(n)
    Auxiliary Space  : O(1)

    ------------------------------------------------------------
    IMPORTANT NOTE
    ------------------------------------------------------------

    This approach works ONLY for
    positive numbers.

    ------------------------------------------------------------
    MAIN IDEA
    ------------------------------------------------------------

    Maintain a window of variable size.

    ------------------------------------------------------------
    RULES
    ------------------------------------------------------------

    1) If current sum becomes smaller
       than required sum:
       -> Expand window

    2) If current sum becomes greater
       than required sum:
       -> Shrink window

    3) If current sum becomes equal
       to required sum:
       -> Return true

    ============================================================
    DRY RUN
    ============================================================

    Array:
    {1, 4, 20, 3, 10, 5}

    Sum = 33

    ------------------------------------------------------------
    WINDOW MOVEMENT
    ------------------------------------------------------------

    Window = {1}
    curr = 1

    Window = {1, 4}
    curr = 5

    Window = {1, 4, 20}
    curr = 25

    Window = {1, 4, 20, 3}
    curr = 28

    Window = {1, 4, 20, 3, 10}
    curr = 38

    curr > 33
    Shrink window:

    Remove 1
    curr = 37

    Remove 4
    curr = 33

    Sum Found.

    ============================================================
    */

    public static boolean isSubSumEqual(int[] arr, int sum){
        // ========================================================
        // STEP 1 : INITIALIZATION
        // ========================================================

        // Size of array
        int n = arr.length;

        /*
        st   -> starting index of window
        curr -> current window sum
        */

        int st = 0;
        int curr = 0;

        // ========================================================
        // STEP 2 : TRAVERSE ARRAY
        // ========================================================

        /*
        end represents ending index of current window
        */

        for(int end = 0; end < n; end++){

            /*
            Expand window by adding current element
            */

            curr += arr[end];

            // ====================================================
            // STEP 3 : SHRINK WINDOW IF SUM EXCEEDS
            // ====================================================

            /*
            If current sum becomes greater
            than required sum, remove elements from beginning of window.
            */

            while(sum < curr){
                curr -= arr[st];
                st++;
            }

            // ====================================================
            // STEP 4 : CHECK REQUIRED SUM
            // ====================================================

            if(curr == sum){
                return true;
            }
        }

        // ========================================================
        // STEP 5 : NO SUBARRAY FOUND
        // ========================================================
        return false;
    }



    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args){

        // Input Array
        int[] arr = {1, 4, 20, 3, 10, 5};

        // Required Sum
        int sum = 33;

        // Function Call
        boolean ans = isSubSumEqual(arr, sum);

        // Print Result
        if(ans){
            System.out.println("Subarray with given sum exists");
        }else{
            System.out.println("Subarray with given sum does not exist");
        }
    }
}