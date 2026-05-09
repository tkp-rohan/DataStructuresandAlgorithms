package unit4_arrays;

// This program just deletes the first occurence of the element
// T.C. = O(n)

public class u4p6_deleteelementfromarray {

    
    public static int delete(int[] arr, int n, int x){
        
        if(n == 0){
            return 0;
        }

        int i;

        for(i = 0; i < n; i++){
            if(arr[i] == x){
                break;
            }
        }

        // element not found
        if(i == n){
            return n;
        }

        // shift elements left
        for(int j = i; j < n - 1; j++){
            arr[j] = arr[j + 1];
        }
        
        return n - 1;
    }

    public static void main(String[] args){

        int[] arr = {3, 8, 12, 5, 6};

        int n = arr.length;

        int x = 12;

        n = delete(arr, n, x);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}