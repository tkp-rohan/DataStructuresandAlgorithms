package unit1_mathematics;

import java.util.Scanner;

public class u1p1_countdigits {
    // T.C. = O(n)


    // Iterative Approach
    // public static int countDigits(int num){
    //     if(num == 0){
    //         return 1;
    //     }
    //     int temp = num;
    //     int countOfDigits = 0;
    //     while(temp>0){
    //         temp/=10;
    //         countOfDigits++;
    //     }
    //     return countOfDigits;
    // }


    // Recursive approach
    public static int countDigits(int num){
        int temp = num;
        if(temp>=0 && temp<10){
            return 1;
        }
        return 1 + countDigits(temp/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int result = countDigits(number);
        System.out.println(result);
    }
}
