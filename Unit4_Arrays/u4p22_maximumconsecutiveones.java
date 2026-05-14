package unit4_arrays;

public class u4p22_maximumconsecutiveones {

    // Optimized Approach
    // T.C. = O(n)
    // A.S. = O(1)
    // public static int maxConsecutiveOnes(int[] arr){

    //     int res = 0;
    //     int curr = 0;

    //     for(int i = 0; i < arr.length; i++){

    //         if(arr[i] == 1){
    //             curr++;
    //             res = Math.max(res, curr);
    //         }
    //         else{
    //             curr = 0;
    //         }
    //     }

    //     return res;
    // }



    // Optimized approach
    // T.C. = O(n)
    // A.S. = O(1)
    public static int maxConsecutiveOnes(int[] arr){
        int n = arr.length;
        int res = 0;
        int curr = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                curr = 0;
            }else{
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 1, 1};

        System.out.println(maxConsecutiveOnes(arr));
    }
}