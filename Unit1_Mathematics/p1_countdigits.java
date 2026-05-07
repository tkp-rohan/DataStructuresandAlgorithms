// Count Digits

import java.util.*;
class p1_countdigits{

    public static int countDigits(int num){
        int temp = num;
        int digitsCount = 0;
        while(temp>0){
            temp/=10;
            digitsCount++;
        }
        return digitsCount;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = countDigits(number);
        System.out.println(result);
        sc.close();
    }
}