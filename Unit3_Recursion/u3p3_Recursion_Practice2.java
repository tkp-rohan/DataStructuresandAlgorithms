package Unit3_Recursion;

public class u3p3_Recursion_Practice2 {
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        fun(5);
    }
}
