import java.util.*;

public class u1p3_factorialofnumber {
    
    public static int factorialOfNumber(int num){
        int temp = num;
        if(temp==0 || temp==1){
            return 1;
        }
        return temp*factorialOfNumber(temp-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int factorial = factorialOfNumber(number);
        System.out.println(factorial);
    }

}
