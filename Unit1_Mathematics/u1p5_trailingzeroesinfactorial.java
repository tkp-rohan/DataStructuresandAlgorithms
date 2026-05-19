package unit1_mathematics;

import java.util.*;

public class u1p5_trailingzeroesinfactorial {

    // Naive Approach
    // T.C. = O(n)
    // public static int countTrailingZeroesinFactorial(int num){
    //     int fact = 1;
    //     for(int i=2; i<=num; i++){
    //         fact*=i;
    //     }
    //     int res = 0;
    //     while(fact%10==0){
    //         res++;
    //         fact/=10;
    //     }
    //     return res;
    // }

    // Factorial values grow extremely fast.
    // So for numbers larger than around 12–13, 
    // int overflows and gives incorrect results.
    

    // Efficient Solution
    // The efficient solve the problem that occurs in the above problem
    // T.C. = O(logn)
    // A.S. = O(1)
    public static int countTrailingZeroes(int num){
        int res = 0;
        for(int i=5; i<=num; i*=5){
            res = res + num/i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        // System.out.println(countTrailingZeroesinFactorial(number));
        System.out.println(countTrailingZeroes(number));
    }
}
