package unit4_arrays;

public class u4p11_reverseanarray {
    
    public static int[] reverseArray(int[] arr, int n){

        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        return arr;
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr, arr.length);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
