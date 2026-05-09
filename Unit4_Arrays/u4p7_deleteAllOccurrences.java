package unit4_arrays;



// Time Complexity: O(n)
// Space Complexity: O(1)

public class u4p7_deleteAllOccurrences {

    public static int deleteAll(int[] arr, int n, int x){

        int j = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] != x){
                arr[j] = arr[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args){

        int[] arr = {10, 20, 20, 30, 20, 40};

        int n = arr.length;

        int x = 20;

        n = deleteAll(arr, n, x);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}