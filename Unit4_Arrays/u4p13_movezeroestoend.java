package unit4_arrays;

public class u4p13_movezeroestoend {
    

    public static int[] moveZeroesToEnd(int[] arr, int n){

       

        // O(Math.pow(n,2)) i.e. quadritic n-square time complexity

        // for(int i = 0; i < n; i++){

        //     if(arr[i] == 0){

        //        for(int j=i+1; j<n; j++){
        //             if(arr[j]!=0){
        //                 int temp = arr[i];
        //                 arr[i] = arr[j];
        //                 arr[j] = temp;
        //                 break;
        //             }
        //        }
                
        //     }
        // }



        // Optimized linear time complexity approach
        int countOfNonZeroElements = 0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[countOfNonZeroElements];
                arr[countOfNonZeroElements] = temp;
                countOfNonZeroElements++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeroesToEnd(arr, arr.length);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
