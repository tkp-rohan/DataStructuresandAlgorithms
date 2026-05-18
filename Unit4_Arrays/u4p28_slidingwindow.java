package unit4_arrays;

// ============================================================
// Maximum Sum of K Consecutive Elements
// ============================================================

public class u4p28_slidingwindow {

    /*
    ============================================================
            MAXIMUM SUM OF K CONSECUTIVE ELEMENTS
    ============================================================

    Problem:
    --------
    Given an array and an integer k,

    find the maximum sum of any contiguous
    subarray of size k.

    ------------------------------------------------------------
    WHAT IS A CONTIGUOUS SUBARRAY?
    ------------------------------------------------------------

    A contiguous subarray means elements
    must be continuous (adjacent).

    Example:
    --------
    Array = {1, 8, 30, -5, 20, 7}

    Valid subarray of size 3:
    {8, 30, -5}

    Invalid:
    {1, 30, 20}
    because elements are not adjacent.

    ============================================================
    EXAMPLE
    ============================================================

    Array:
    {1, 8, 30, -5, 20, 7}
    k = 3

    ------------------------------------------------------------
    ALL SUBARRAYS OF SIZE 3
    ------------------------------------------------------------
    {1, 8, 30}   -> Sum = 39
    {8, 30, -5}  -> Sum = 33
    {30, -5, 20} -> Sum = 45
    {-5, 20, 7}  -> Sum = 22
    Maximum Sum = 45
    ============================================================
    */



    // ============================================================
    // NAIVE SOLUTION
    // ============================================================

    /*
    Time Complexity  : O((n-k+1) * k)
    Auxiliary Space  : O(1)

    ------------------------------------------------------------
    IDEA
    ------------------------------------------------------------

    Generate every subarray of size k.
    Calculate its sum separately.
    Store the maximum sum obtained.

    ------------------------------------------------------------
    WHY IS IT SLOW?
    ------------------------------------------------------------

    For every starting index, we again traverse k elements.
    So repeated calculations happen.

    ============================================================
    */
    // public static int maxSum(int[] arr, int k){

    //     // Size of array
    //     int n = arr.length;

    //     // Stores maximum sum found so far
    //     int res = Integer.MIN_VALUE;

    //     // Traverse all possible starting positions
    //     // of subarrays of size k
    //     for(int i = 0; i + k - 1 < n; i++){

    //         // Stores current subarray sum
    //         int curr = 0;

    //         // Calculate current window sum
    //         for(int j = 0; j < k; j++){
    //             curr += arr[i + j];
    //         }

    //         // Update maximum sum
    //         res = Math.max(curr, res);
    //     }

    //     // Return maximum sum
    //     return res;
    // }





    // ============================================================
    // OPTIMIZED SOLUTION
    // Sliding Window Technique
    // ============================================================

    /*
    Time Complexity  : O(n)
    Auxiliary Space  : O(1)

    ------------------------------------------------------------
    MAIN IDEA
    ------------------------------------------------------------

    Instead of recalculating every subarray sum from scratch,
    reuse the previous window sum.

    ------------------------------------------------------------
    SLIDING WINDOW CONCEPT
    ------------------------------------------------------------

    Window Size = k

    Example:
    --------
    Array:
    {1, 8, 30, -5, 20, 7}
    k = 3
    First Window:
    --------------
    {1, 8, 30}
    Sum = 39
    Move Window by 1 step:
    ----------------------
    Old Window:
    {1, 8, 30}

    New Window:
    {8, 30, -5}

    Instead of adding all elements again:

    Remove outgoing element -> 1
    Add incoming element   -> -5

    New Sum =
    Previous Sum + Incoming Element - Outgoing Element
    = 39 + (-5) - 1
    = 33

    ------------------------------------------------------------
    BENEFIT
    ------------------------------------------------------------

    Every element is added once and removed once.
    Therefore overall complexity becomes O(n).

    ============================================================
    */

    public static int maxSum(int[] arr, int k){
        // ========================================================
        // STEP 0 : INITIALIZATION
        // ========================================================

        // Size of array
        int n = arr.length;

        // ========================================================
        // STEP 1 : CALCULATE FIRST WINDOW SUM
        // ========================================================

        /*
        First window contains first k elements.

        Example:
        --------
        If k = 3
        Window:
        {1, 8, 30}
        */

        int curr = 0;
        for(int i = 0; i < k; i++){
            curr += arr[i];
        }

        // ========================================================
        // STEP 2 : STORE INITIAL ANSWER
        // ========================================================

        /*
        Initially,
        first window sum itself
        is the maximum sum.
        */

        int res = curr;

        // ========================================================
        // STEP 3 : SLIDE THE WINDOW
        // ========================================================

        /*
        Start from index k because first window is already processed.
        */

        for(int i = k; i < n; i++){
            /*
            Sliding Window Formula
            ------------------------------------------------
            New Window Sum =
            Previous Window Sum + Incoming Element - Outgoing Element

            arr[i]     -> Incoming element
            arr[i-k]   -> Outgoing element
            */
            curr = curr + arr[i] - arr[i - k];

            // Update maximum sum if needed
            res = Math.max(res, curr);
        }

        // ========================================================
        // STEP 4 : RETURN ANSWER
        // ========================================================

        return res;
    }


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        // Input Array
        int[] arr = {1, 8, 30, -5, 20, 7};

        // Window Size
        int k = 3;

        // Function Call
        int ans = maxSum(arr, k);

        // Print Final Answer
        System.out.println("Maximum Sum = " + ans);
    }
}