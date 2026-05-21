package unit2_bitmanipulation;

public class u2p6_twooddoccurring {
    
    // Naive Solution
    // T.C. = O(n-square)
    // A.S. = O(1)
    // public static void priintOdd(int[] arr){
    //     int n = arr.length;

    //     for(int i = 0; i < n; i++){

    //         // Skip if element already appeared before
    //         boolean alreadyPrinted = false;

    //         for(int k = 0; k < i; k++){
    //             if(arr[i] == arr[k]){
    //                 alreadyPrinted = true;
    //                 break;
    //             }
    //         }

    //         if(alreadyPrinted){
    //             continue;
    //         }

    //         int count = 0;

    //         for(int j = 0; j < n; j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }

    //         if(count % 2 != 0){
    //             System.out.print(arr[i] + " ");
    //         }
    //     }
    // }



    // Optimized Code
    // T.C. = O(n)
    // A.S. = O(1)

    public static void priintOdd(int[] arr){

        int n = arr.length;

        int x = arr[0];

        // XOR of all elements
        for(int i = 1; i < n; i++){
            x = x ^ arr[i];
        }

        // Finds rightmost set bit
        int k = (x & (~(x - 1)));

        int res1 = 0;
        int res2 = 0;

        // Divide elements into two groups
        for(int i = 0; i < n; i++){

            if((arr[i] & k) != 0){
                res1 = res1 ^ arr[i];
            }
            else{
                res2 = res2 ^ arr[i];
            }
        }

        System.out.print(res1 + " " + res2);
    }

    public static void main(String[] args) {
        int[] arr = {7,3,7,3,7,5};
        priintOdd(arr);
    }
}