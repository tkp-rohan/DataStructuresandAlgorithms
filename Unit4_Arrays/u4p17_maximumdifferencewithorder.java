package unit4_arrays;

// Here we find the maximum value of arr[j] - arr[i] such that j > i

public class u4p17_maximumdifferencewithorder {
    
    // Naive Solution
    // Time Complexity: O(n^2)
    // Auxiliary Space: O(1)
    // public static int maxDifference(int[] arr){
    //     int n = arr.length;
    //     int res = arr[1] - arr[0];

    //     for(int i = 0; i < n - 1; i++){
    //         for(int j = i + 1; j < n; j++){
    //             res = Math.max(res, arr[j] - arr[i]);
    //         }
    //     }
    //     return res;
    // }

    // Optimized Approach
    // T.C. = O(n)
    public static int maxDifference(int[] arr){
        int n = arr.length;
        int res = arr[1] - arr[0];
        int minValue = arr[0];
        for(int j=1; j<n; j++){
            res = Math.max(res, arr[j]-minValue);
            minValue = Math.min(minValue, arr[j]);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maxDifference(arr));

    }
}