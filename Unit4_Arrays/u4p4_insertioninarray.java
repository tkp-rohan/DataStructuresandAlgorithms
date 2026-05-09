package unit4_arrays;

// Insert in an array at given position
// T.C. = O(n)

// If we are inserting at last position T.C. = O(1)

public class u4p4_insertioninarray {

    public static int insert(int[] arr, int n, int x, int cap, int pos){

        if(n == cap){
            return n;
        }

        int idx = pos - 1;

        for(int i = n - 1; i >= idx; i--){
            arr[i + 1] = arr[i];
        }

        arr[idx] = x;

        return n + 1;
    }

    public static void main(String[] args){

        int cap = 3;
        int[] arr = new int[cap];

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;

        int n = 0;

        for(int num : arr){
            if(num != 0){
                n++;
            }
        }
        
        int x = 7;
        int pos = 2;

        int result = insert(arr, n, x, cap, pos);

        System.out.println("New size: " + result);

        for(int i = 0; i < result; i++){
            System.out.print(arr[i] + " ");
        }
    }
}