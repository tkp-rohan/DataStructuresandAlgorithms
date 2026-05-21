package unit2_bitmanipulation;


//Bitwise Operators: AND(&), OR(|), XOR(^),Not(~),  Left Shift(<<), 
// Signed Right Shift(>>), Unsigned Right Shift(>>>)

// x << y is equivalent to x * Math.pow(2, y) if leading y bits are 0 in x.

// x >> y is equivalent to floor of x/Math.pow(2,y).

// Math.pow(2,32) - 1 = 4294967296 - 1 = 4294967295

// Two's complement of x = Math.pow(2,32) - x
// For signed numbers bitwise not of x (~x) = Math.pow(2,32) - 1 - x 

// import java.util.*;
public class u2p1_bitwiseoperators {
    
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);

        int number1 = 6; // 110
        int number2 = 3; // 011

        int result1 = number1 & number2;
        System.out.println("Result1 of 'Bitwise AND' operation is: "+result1);

        int result2 = number1 | number2;
        System.out.println("Result2 of 'Bitwise OR' operation is: "+result2);

        int result3 = number1 ^ number2;
        System.out.println("Result3 of 'Bitwise XOR' operation is: "+result3);

        int result4 = ~number1;
        System.out.println("Result4 of 'Bitwise NOT' operation is: "+result4);

        int result5 = ~number2;
        System.out.println("Result5 of 'Bitwise NOT' operation is: "+result5);

        int result6 = number1<<1;
        System.out.println("Result6 of 'Bitwise Left Shift' operation is: "+result6);

        int result7 = number1>>1;
        System.out.println("Result7 of 'Bitwise Right Shift' operation is: "+result7);

        int number3 = -1;

        int result8 = number3<<1;
        System.out.println("Result8 of 'Bitwise Left Shift' operation is: "+result8);

        int result9 = number3<<2;
        System.out.println("Result9 of 'Bitwise Left Shift' operation is: "+result9);

        int result10 = number3>>1;
        System.out.println("Result10 of 'Bitwise Right Shift' operation is: "+result10);

        int number4 = -2;
        int result11 = number4>>1;
        System.out.println("Result11 of 'Bitwise Right Shift' operation is: "+result11);

        int result12 = number4>>4;
        System.out.println("Result12 of 'Bitwise Right Shift' operation is: "+result12);

        
        int result13 = number4>>>1;
        System.out.println("Result13 of 'Bitwise Right Shift' operation is: "+result13);

        int result14 = number4>>>2;
        System.out.println("Result14 of 'Bitwise Right Shift' operation is: "+result14);

        // sc.close();
    }

}
