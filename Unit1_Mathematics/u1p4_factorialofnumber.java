package unit1_mathematics;

import java.util.Scanner;

public class u1p4_factorialofnumber {
    
    public static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int result = factorial(number);
        System.out.println("Factorial of a number: "+result);
    }
}
