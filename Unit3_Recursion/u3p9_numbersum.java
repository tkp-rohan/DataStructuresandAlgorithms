package unit3_recursion;

import java.util.*;

public class u3p9_numbersum {
    
    public static int sumOfNumbers(int num){
        if(num==0){
            return 0;
        }
        return num + sumOfNumbers(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int result = sumOfNumbers(number);
        System.out.println(result);
    }
}
