package unit5_searching;

public class u5p1_linearsearch {
    
    // Linear Search Method
    // Time Complexity (T.C.)  : O(n)
    // Auxiliary Space (A.S.) : O(1)
    public static boolean linearSearch(int[] arr, int k){

        // Store size of array
        int n = arr.length;

        // Traverse the array one by one
        for(int i=0; i<n; i++){

            // If element is found, return true
            if(arr[i]==k){
                return true;
            }
        }

        // If loop ends, element is not present
        return false;
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Elements to search
        int k = 45;
        int l = 50;

        // Search first element
        boolean isPresent1 = linearSearch(arr, k);

        if(isPresent1){
            System.out.println(k + " is present.");
        }else{
            System.out.println(k + " is not present.");
        }

        // Search second element
        boolean isPresent2 = linearSearch(arr, l);

        if(isPresent2){
            System.out.println(l + " is present.");
        }else{
            System.out.println(l + " is not present.");
        }
    }
}