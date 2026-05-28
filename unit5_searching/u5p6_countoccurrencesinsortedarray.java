package unit5_searching;

public class u5p6_countoccurrencesinsortedarray {

    // First Occurrence
    // T.C. = O(log n)
    // A.S. = O(log n)
    public static int firstOccurrence(int[] arr, int low, int high, int k) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (k > arr[mid]) {
            return firstOccurrence(arr, mid + 1, high, k);
        }

        else if (k < arr[mid]) {
            return firstOccurrence(arr, low, mid - 1, k);
        }

        else {

            if (mid == 0 || arr[mid - 1] != arr[mid]) {
                return mid;
            }

            else {
                return firstOccurrence(arr, low, mid - 1, k);
            }
        }
    }

    // Last Occurrence
    // T.C. = O(log n)
    // A.S. = O(log n)
    public static int lastOccurrence(int[] arr, int low, int high, int k) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (k > arr[mid]) {
            return lastOccurrence(arr, mid + 1, high, k);
        }

        else if (k < arr[mid]) {
            return lastOccurrence(arr, low, mid - 1, k);
        }

        else {

            if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
                return mid;
            }

            else {
                return lastOccurrence(arr, mid + 1, high, k);
            }
        }
    }

    // Count Occurrences
    // T.C. = O(log n)
    // A.S. = O(log n)
    public static int countOccurrences(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        int first = firstOccurrence(arr, low, high, k);

        if (first == -1) {
            return 0;
        }

        int last = lastOccurrence(arr, low, high, k);

        return (last - first + 1);
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 10, 10, 15, 15, 20};

        int k = 10;

        int count = countOccurrences(arr, k);

        System.out.println("Count of " + k + " = " + count);
    }
}