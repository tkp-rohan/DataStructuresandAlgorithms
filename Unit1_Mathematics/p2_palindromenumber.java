import java.util.*;

public class p2_palindromenumber {
    
    public static int reverseNumber(int num){
        int temp = num;
        int reversedNum = 0;
        while(temp>0){
            int digit = temp%10;
            reversedNum= reversedNum*10 + digit;
            temp/=10;
        }
        return reversedNum;
    }

    public static boolean isPalindrome(int num){
        int temp = num;
        int reversedNum = reverseNumber(temp);
        return reversedNum == num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPalindrome(number));
        sc.close();
    }
}
