package unit4_arrays;

import java.util.*;

// An element is called leader in the array
// if all elements to the right are smaller than it

public class u4p16_leadersinthearray {

    // Naive Solution - O(n²)
    // public static void leaderArray(int[] arr) {

    //     int n = arr.length;

    //     for(int i = 0; i < n; i++) {

    //         boolean flag = true;

    //         for(int j = i + 1; j < n; j++) {

    //             if(arr[i] <= arr[j]) {
    //                 flag = false;
    //                 break;
    //             }
    //         }

    //         if(flag) {
    //             System.out.print(arr[i] + " ");
    //         }
    //     }
    // }



    // Optimized approach
    // T.C. = O(N)
    public static void leaderArray(int[] arr){
        List<Integer> al = new ArrayList<>();
        int n = arr.length;
        int currentLeader = arr[n-1];
        al.add(0, arr[n-1]);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>currentLeader){
                currentLeader = arr[i];
                al.add(0,arr[i]);
            }
        }
        for(int num : al){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 10, 6, 5, 2};

        leaderArray(arr);

    } 
}