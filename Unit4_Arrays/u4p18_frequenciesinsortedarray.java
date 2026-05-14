package unit4_arrays;

// Frequencies of elements in a sorted array
// T.C. = O(n)
// A.S. = O(1)
public class u4p18_frequenciesinsortedarray {

    public static void printFrequency(int[] arr) {

        int n = arr.length;

        if (n == 0) {
            return;
        }

        int frequency = 1;
        int i = 1;

        while (i < n) {

            while (i < n && arr[i] == arr[i - 1]) {
                frequency++;
                i++;
            }

            System.out.println(arr[i - 1] + " : " + frequency);

            frequency = 1;
            i++;
        }

        // For last element occurring once
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " : 1");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 20, 20, 30};

        printFrequency(arr);
    }
}