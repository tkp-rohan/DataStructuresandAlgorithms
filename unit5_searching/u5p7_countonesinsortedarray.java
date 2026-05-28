package unit5_searching;

public class u5p7_countonesinsortedarray {

    // Count 1s in Sorted Binary Array
    // T.C. = O(log n)
    // A.S. = O(1)
    public static int countOnes(int[] arr) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Move to right half
            if (arr[mid] == 0) {
                low = mid + 1;
            }

            // Found 1
            else {

                // Check if it is first occurrence of 1
                if (mid == 0 || arr[mid - 1] == 0) {

                    return (n - mid);
                }

                // Search in left half
                else {
                    high = mid - 1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 1, 1, 1, 1};

        int result = countOnes(arr);

        System.out.println("Count of 1s = " + result);
    }
}