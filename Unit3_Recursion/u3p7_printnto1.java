package unit3_recursion;

import java.util.Scanner;

public class u3p7_printnto1 {
    
    public static void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        printNto1(number);
    }
}
