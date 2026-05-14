package unit1_mathematics;

import java.util.*;

public class u1p5_trailingzeroesinfactorial {
    
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
        countTrailingZeroes(number);
    }
}
