package unit3_recursion;

import java.util.Scanner;

public class u3p8_print1ton {
    
    public static void printNto1(int n){
        if(n==0){
            return;
        }
        
        printNto1(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        printNto1(number);
    }
}
