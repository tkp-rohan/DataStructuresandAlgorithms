package unit4_arrays;

public class u4p26_majorityelement {

    /*
    ============================================================
                    MAJORITY ELEMENT PROBLEM
    ============================================================

    A Majority Element is an element that appears
    more than n/2 times in the array.

    Example:
    ------------------------------------------------
    Array = {6, 8, 4, 8, 8}

    Size of array = 5
    n/2 = 2

    Frequency of 8 = 3

    Since 3 > 2,
    therefore 8 is the Majority Element.
    ============================================================
    */



    // ============================================================
    // NAIVE SOLUTION
    // ============================================================
    /*
    Idea:
    -----
    For every element,
    count its frequency using another loop.

    If frequency > n/2,
    return its index.

    Time Complexity:
    ----------------
    O(n²)

    Why?
    ----
    Because for every element,
    we traverse the remaining array again.
    */

    // public static int findMajorityElement(int[] arr){

    //     int n = arr.length;

    //     // Traverse every element
    //     for(int i = 0; i < n; i++){

    //         // Frequency count of current element
    //         int count = 1;

    //         // Count occurrences of arr[i]
    //         for(int j = i + 1; j < n; j++){

    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }

    //         // If frequency becomes greater than n/2
    //         // then arr[i] is majority element
    //         if(count > n / 2){
    //             return i;
    //         }
    //     }

    //     // No Majority Element Found
    //     return -1;
    // }



    // ============================================================
    // OPTIMIZED SOLUTION
    // ============================================================

    /*
    Moore's Voting Algorithm
    ------------------------

    Time Complexity  : O(n)
    Auxiliary Space  : O(1)

    ------------------------------------------------------------
    MAIN IDEA
    ------------------------------------------------------------

    Different elements cancel each other.

    If a majority element exists,
    it will survive after all cancellations.

    ------------------------------------------------------------
    WORKING
    ------------------------------------------------------------

    STEP 1:
    Find a candidate for majority element.

    STEP 2:
    Verify whether candidate actually appears
    more than n/2 times.
    */

    public static int findMajorityElement(int[] arr){

        // Size of array
        int n = arr.length;



        // ========================================================
        // STEP 1 : FIND CANDIDATE
        // ========================================================

        /*
        res   -> stores index of current candidate
        count -> stores support count of candidate
        */

        int res = 0;
        int count = 1;



        // Traverse array from second element
        for(int i = 1; i < n; i++){

            /*
            If current element matches candidate,
            increase count.
            */
            if(arr[res] == arr[i]){
                count++;
            }

            /*
            If current element is different,
            cancel one occurrence of candidate.
            */
            else{
                count--;
            }



            /*
            If count becomes 0,
            current candidate is completely cancelled.

            Choose new candidate.
            */
            if(count == 0){

                // New candidate index
                res = i;

                // Reset count
                count = 1;
            }
        }



        // ========================================================
        // STEP 2 : VERIFY CANDIDATE
        // ========================================================

        /*
        Candidate found in Step 1
        may or may not be majority element.

        So count its actual frequency.
        */

        count = 0;

        // Count frequency of candidate
        for(int i = 0; i < n; i++){
            if(arr[res] == arr[i]){
                count++;
            }
        }

        // ========================================================
        // CHECK WHETHER MAJORITY ELEMENT EXISTS
        // ========================================================

        /*
        If frequency is NOT greater than n/2, then no majority element exists.
        */
        if(count <= n / 2){
            res = -1;
        }
        return res;
    }


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        // Input Array
        int[] arr = {6, 8, 4, 8, 8};

        // Find index of majority element
        int index = findMajorityElement(arr);

        // If no majority element exists
        if(index == -1){
            System.out.println("No Majority Element");
        }

        // Majority element found
        else{
            System.out.println("Majority Element = " + arr[index]);
            System.out.println("Index = " + index);
        }
    }
}