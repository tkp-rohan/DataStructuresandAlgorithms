package unit3_recursion;

public class u3p1_Recursion_Intro {
    
    public static void fun1(){
        System.out.println("fun1");
    }

    public static void fun2(){
        
        System.out.println("Before fun1");
        fun1();
        System.out.println("After fun1");
    }
    public static void main(String[] args){
        System.out.println("Before fun2");
        fun2();
        System.out.println("After fun2");
    }

}
