package Unit3_Recursion;



public class u3p2_Recursion_Practice1 {

    public static void fun1(int num){
        int temp = num;
        if(temp==0){
            return;
        }
        System.out.println("Inside Fun1");
        fun1(temp-1);
    }

    public static void main(String[] args){
        int number = 5;
        fun1(number);
    }

}
