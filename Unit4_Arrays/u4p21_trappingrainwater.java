package unit4_arrays;

public class u4p21_trappingrainwater {
    
    // Naive Solution
    // T.C. = O(n-square)

    // public static int getWater(int[] arr){

    //     int n = arr.length;

    //     int resWater = 0;

    //     for(int i = 1; i < n - 1; i++){

    //         int lmax = arr[i];

    //         for(int j = 0; j < i; j++){
    //             lmax = Math.max(lmax, arr[j]);
    //         }

    //         int rmax = arr[i];

    //         for(int j = i + 1; j < n; j++){
    //             rmax = Math.max(rmax, arr[j]);
    //         }

    //         resWater = resWater +
    //                    (Math.min(lmax, rmax) - arr[i]);
    //     }

    //     return resWater;
    // }



    // Optimized Approach
    // T.C. = O(n)
    // A.S. = O(n)
    public static int getWater(int[] arr){

        int n = arr.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        int res = 0;
        
        lmax[0] = arr[0];
        for(int i=1; i<n; i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }

        rmax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }

        // Calculate trapped water
        for(int i = 1; i < n - 1; i++){
            res += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {5, 0, 6, 2, 3};

        System.out.println(getWater(arr));
    }
}