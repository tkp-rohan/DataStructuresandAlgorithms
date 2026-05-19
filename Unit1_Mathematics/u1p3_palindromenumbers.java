package unit1_mathematics;

public class u1p3_palindromenumbers {

    // public static int reverseIterative(int num){
        //     int temp = num;
        //     int reversed = 0;
        //     while(temp > 0){
        //         int lastDigit = temp % 10;
        //         reversed = reversed * 10 + lastDigit;
        //         temp /= 10;
        //     }
        //     return reversed;
        // }

    public static boolean isPalindrome(int num){
        int reversedNum = u1p2_reversenumber.reverseIterative(num);
        return reversedNum == num;
    }

    public static void main(String[] args) {
        int number = 1234321;
        System.out.println(isPalindrome(number));

    }
}