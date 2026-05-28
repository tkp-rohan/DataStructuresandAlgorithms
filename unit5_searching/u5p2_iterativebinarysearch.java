package unit5_searching;

public class u5p2_iterativebinarysearch {

    // Iterative Binary Search Method
    // Returns index of element if found
    // Otherwise returns -1

    /*
     * Time Complexity (T.C.)  = O(log n)
     * Auxiliary Space (A.S.) = O(1)
     */

    public static int binarySearch(int[] arr, int x) {

        // low points to starting index
        int low = 0;

        // high points to ending index
        int high = arr.length - 1;

        // Loop continues until low crosses high
        while (low <= high) {

            // Find middle index
            int mid = (low + high) / 2;

            // If element is found at mid
            if (arr[mid] == x) {
                return mid;
            }

            // If middle element is greater than x
            // Search in left half
            else if (arr[mid] > x) {
                high = mid - 1;
            }

            // If middle element is smaller than x
            // Search in right half
            else {
                low = mid + 1;
            }
        }

        // Element not found
        return -1;
    }

    public static void main(String[] args) {

        // Sorted array
        int[] arr = {10, 20, 30, 40, 50, 60};

        // Element to search
        int x = 25;

        // Function call
        int result = binarySearch(arr, x);

        // Output
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}