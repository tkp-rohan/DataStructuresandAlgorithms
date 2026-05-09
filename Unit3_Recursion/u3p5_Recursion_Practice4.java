package unit3_recursion;

// This function demonstrates logn to the base 2


public class u3p5_Recursion_Practice4 {
    
    public static int fun(int n){
        if(n==1){
            return 0;
        }else{
            return 1 + fun(n/2);
        }
    }

    public static void main(String[] args){
        System.out.println(fun(16));
    }
}
