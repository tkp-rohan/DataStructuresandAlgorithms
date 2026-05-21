package unit2_bitmanipulation;

public class u2p5_oneoddoccurring {
    
    // Naive Solution
    // T.C. = O(n-square)
    // A.S. = O(1)
    // public static int findOdd(int[] arr){
    //     int n = arr.length;
    //     for(int i=0; i<n; i++){
    //         int count = 0;
    //         for(int j=0; j<n; j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count%2!=0){
    //             return arr[i];
    //         }
    //     }
    //     return 0;
    // }



    // Efficient Solution
    // T.C. = O(n)
    // A.S. = O(1)
    public static int findOdd(int[] arr){
        int n = arr.length;
        int res = arr[0];
        for(int i=1; i<n; i++){
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {7,3,7,3,7};
        int ans = findOdd(arr);
        System.out.println(ans);
    }

}
