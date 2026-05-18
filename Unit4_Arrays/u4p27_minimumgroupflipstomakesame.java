package unit4_arrays;

public class u4p27_minimumgroupflipstomakesame {
    /*
    ============================================================
            MINIMUM CONSECUTIVE GROUP FLIPS PROBLEM
    ============================================================
    Problem:
    --------
    Given a binary array (containing only 0s and 1s),
    we need to print the minimum groups to flip
    so that all elements become same.
    ------------------------------------------------------------
    EXAMPLE
    ------------------------------------------------------------
    Array:
    {1, 1, 0, 0, 0, 1}
    Groups:
    --------
    Group of 1s -> {1,1}
    Group of 0s -> {0,0,0}
    Group of 1s -> {1}

    Minimum flips:
    ---------------
    Flip the group of 0s

    Output:
    --------
    From 2 to 4

    ============================================================
    */

    // ============================================================
    // OPTIMIZED SOLUTION
    // ============================================================

    /*
    Time Complexity  : O(n)
    Auxiliary Space  : O(1)

    ------------------------------------------------------------
    MAIN IDEA
    ------------------------------------------------------------
    Whenever current element becomes different
    from previous element,
    a new group starts.

    We compare every group with first element.

    If group is different from first group,
    print starting and ending indexes of that group.

    ------------------------------------------------------------
    WHY THIS WORKS?
    ------------------------------------------------------------

    We always flip the groups which are fewer.

    Instead of counting groups separately,
    this trick automatically prints the groups
    that should be flipped.

    ============================================================
    */

    public static void printGroupsToBeFlipped(int[] arr){

        // Size of array
        int n = arr.length;

        // Traverse array from second element
        for(int i = 1; i < n; i++){

            // If current element differs from previous, then a new group starts.            
            if(arr[i] != arr[i - 1]){

                /*
                If current group is different
                from first group,
                then this group should be flipped.

                Print starting index.
                */
                if(arr[i] != arr[0]){
                    System.out.print("From " + i + " to ");
                }
                /*
                Otherwise current group is same
                as first group.
                So previous group ends at i-1.
                Print ending index.
                */
                else{
                    System.out.println(i - 1);
                }
            }
        }

        /*
        Special Case:
        -------------
        If last group is different from first group,
        then its ending index was never printed.

        So print n-1.
        */
        if(arr[n - 1] != arr[0]){
            System.out.println(n - 1);
        }
    }
    // ============================================================
    // MAIN METHOD
    // ============================================================
    public static void main(String[] args) {
        /*
        Example Array
        Groups:
        --------
        1 1 | 0 0 0 | 1 1 | 0 0
        Minimum groups to flip:
        ------------------------
        Flip 0 groups
        */
        int[] arr = {1, 1, 0, 0, 0, 1, 1, 0, 0};

        // Print groups to be flipped
        printGroupsToBeFlipped(arr);
    }
}