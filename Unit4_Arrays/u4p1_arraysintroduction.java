package Unit4_Arrays;

// Arrays: Linear DS, Stored at contiguous locations
// Advantages: Random Access(Elements can be accessed at O(1) time), 
// Advantaged: Cache Friendly since elements stored at contiguous location
// Types of Arrays: Static Arrays(Fixed size), Dynamic Arrays(Resizable)
// In java arrays are always allocated memory on heap
// ArrayList in java is a dynamic array


public class u4p1_arraysintroduction {
    public static void main(String[] args){

        // Method-1
        int[] arr = {1,2,3,4,5};

        // Method-2
        int[] arr1 = new int[5];
        arr1 = new int[]{1,2,3,4,5};

        for(int m : arr){
            System.out.print(m+" ");
        }

        System.out.println();

        for(int n : arr1){
            System.out.print(n+" ");
        }

        
    }    
}
