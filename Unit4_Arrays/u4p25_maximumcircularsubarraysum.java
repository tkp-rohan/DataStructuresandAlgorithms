package unit4_arrays;


// Maximum Circular Subarray Sum

// Example Array:
// {10, 5, -5}

// All Circular Subarrays are:

// Normal Subarrays:
// {10}
// {5}
// {-5}
// {10, 5}
// {5, -5}
// {10, 5, -5}

// Circular Subarrays:
// {5, -5, 10}
// {-5, 10}
// {-5, 10, 5}

public class u4p25_maximumcircularsubarraysum {
    
    // Naive Solution
    // Time Complexity : O(n-square)
    // Auxiliary Space : O(1)
    // public static int maxSubarraySum(int[] arr){
    //     int n = arr.length;
    //     int res = arr[0];
    //     // Pick every element as starting point
    //     for(int i=0; i<n; i++){
    //         int currMax = arr[i];
    //         int currSum = arr[i];
    //         // Traverse circularly
    //         for(int j=1; j<n; j++){
    //             int index = (i + j) % n;
    //             currSum += arr[index];
    //             currMax = Math.max(currMax, currSum);
    //         }
    //         res = Math.max(res, currMax);
    //     }
    //     return res;
    // }






    // Efficient Solution
    // Time Complexity : O(n)

    // Idea:
    // Take maximum of the following two values:

    // 1) Maximum Sum of a Normal Subarray
    //    -> Using Kadane's Algorithm

    // 2) Maximum Sum of a Circular Subarray
    //    -> Circular subarray means the subarray wraps around the end
    //       of the array

    // Example:
    // arr[] = {5, -2, 3, 4}

    // Normal Maximum Subarray Sum:
    // {5, -2, 3, 4} = 10

    // Circular Maximum Subarray Sum:
    // {3, 4, 5} = 12

    // So Answer = max(10, 12) = 12


    // Another Example:
    // arr[] = {8, -4, 3, -5, 4}

    // Possible Circular Subarray:
    // {3, -5, 4, 8} = 10


    // Another Example:
    // arr[] = {3, -4, 5, 6, -8, 7}

    // Circular Subarray:
    // {5, 6, -8, 7, 3} = 13

    // Observation:
    // Maximum Circular Sum
    // = Total Array Sum - Minimum Subarray Sum

    // Why?
    // Because removing the minimum sum subarray
    // leaves the maximum circular subarray.

    // Formula:
    // maxCircular = totalSum - minSubarraySum

    // Final Answer:
    // max(normalKadane, maxCircular)



    // Standard Kadane's Algorithm
    // Finds Maximum Sum of Normal Subarray
    public static int normalMaxSum(int[] arr){
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];

        for(int i=1; i<n; i++){
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }



    public static int maxSubarraySum(int[] arr){

        int n = arr.length;
        // Find Normal Maximum Subarray Sum
        int maxNormal = normalMaxSum(arr);

        // If all elements are negative
        // return normal maximum only
        if(maxNormal < 0){
            return maxNormal;
        }

        // Find Array Sum
        // and invert all elements
        int arrSum = 0;

        for(int i=0; i<n; i++){
            arrSum += arr[i];
            arr[i] = -arr[i];
        }

        // Maximum Circular Sum
        int maxCircular = arrSum + normalMaxSum(arr);
        // Final Answer
        return Math.max(maxNormal, maxCircular);
    }

    
    public static void main(String[] args) {
        int[] arr = {5, -2, 3, 4};
        System.out.println(maxSubarraySum(arr));
    }
}