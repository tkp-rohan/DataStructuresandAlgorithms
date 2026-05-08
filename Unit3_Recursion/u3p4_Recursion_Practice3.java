package Unit3_Recursion;

public class u3p4_Recursion_Practice3 {
    
    public static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args){
        fun(3);
    }
}
