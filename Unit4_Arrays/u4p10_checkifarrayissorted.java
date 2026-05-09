package unit4_arrays;


// T.C. = O(n)

public class u4p10_checkifarrayissorted {
    

    public static boolean isSorted(int[] arr, int n){

        for(int i=0; i<n-1; i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){

        int[] arr = {10, 20,75, 30, 40};
        System.out.println(isSorted(arr, arr.length));

    }
}
