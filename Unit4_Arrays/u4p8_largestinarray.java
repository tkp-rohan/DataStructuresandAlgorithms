package unit4_arrays;

public class u4p8_largestinarray {
    
    public static int largestInTheArray(int[] arr, int n){
        
        int largest = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        return largest;
    }

    public static void main(String[] args){
        int[] arr = {10,50,30,70,3,9};
        int n = arr.length;
        int result = largestInTheArray(arr,n);
        System.out.println(result);
    }
}
