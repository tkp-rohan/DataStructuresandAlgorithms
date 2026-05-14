package unit4_arrays;

public class u4p23_maximumsubarraysum {
    
    // Naive Solution
    // T.C. = O(n-square)
    // A.S. = O(1)
    // public static int maxSubarraySum(int[] arr){
    //     int n = arr.length;
    //     int maxSum = 0;
    //     for(int i=0; i<n; i++){
    //         int currSum = 0;
    //         for(int j=i; j<n; j++){
    //             currSum += arr[j];
    //             maxSum = Math.max(maxSum, currSum);
    //         }
    //     }
    //     return maxSum;
    // }


    // Kadane's Algorithm
    // T.C. = O(n)
    // A.S. = O(1)
    public static int maxSubarraySum(int[] arr){
        int n = arr.length;
        int maxSum = arr[0];
        int currSum = arr[0];
        for(int i = 1; i < n; i++){
            currSum = Math.max(currSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 8, -2, 4, -5, 6};
        System.out.println(maxSubarraySum(arr));
    }

}
