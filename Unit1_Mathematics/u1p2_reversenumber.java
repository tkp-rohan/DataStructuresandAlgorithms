package unit1_mathematics;

import java.util.*;

public class u1p2_reversenumber {

    // Iterative Approach
    public static int reverseIterative(int num){
        int temp = num;
        int reversed = 0;
        while(temp > 0){
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }
        return reversed;
    }


    // Recursive Approach
    static int reversedRecursive = 0;
    public static int reverseRecursive(int num){
        if(num == 0){
            return reversedRecursive;
        }
        int lastDigit = num % 10;
        reversedRecursive = reversedRecursive * 10 + lastDigit;
        return reverseRecursive(num / 10);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        // Iterative Result
        int iterativeResult = reverseIterative(number);
        // Reset before recursive call
        reversedRecursive = 0;
        // Recursive Result
        int recursiveResult = reverseRecursive(number);
        System.out.println("Iterative Reverse: " + iterativeResult);
        System.out.println("Recursive Reverse: " + recursiveResult);
    }
}