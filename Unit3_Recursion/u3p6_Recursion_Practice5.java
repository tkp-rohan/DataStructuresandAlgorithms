package unit3_recursion;


public class u3p6_Recursion_Practice5 {
    
    public static void fun(int n){
        if(n==0){
            return;
        }
        fun(n/2);
        System.out.print(n%2);
    }
    
    public static void main(String[] args){
        fun(9);
    }
}
