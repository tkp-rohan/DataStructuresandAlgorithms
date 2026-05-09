package unit4_arrays;

// T.C. = O(n)

public class u4p9_secondlargest {
    


    public static int secondLargestElement(int[] arr, int n){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(arr[i]>largest){

                secondLargest = largest;
                largest=arr[i]; 

            }else if(arr[i] > secondLargest && arr[i] != largest){

                secondLargest = arr[i];

            }
        }
        return secondLargest;
    }

    public static void main(String[] args){

        int[] arr = {5, 20, 12, 20, 8};
        int result = secondLargestElement(arr, arr.length);
        System.out.println(result);

    }
}
