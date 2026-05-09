package Unit4_Arrays;

// Linear time complexity solution

public class u4p15_leftrotateanarraybydplaces {

    public static int[] reverseArray(int[] arr, int start, int end){

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    public static int[] leftRotation(int[] arr, int d){

        int n = arr.length;

        d = d % n;

        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        leftRotation(arr, 2);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}