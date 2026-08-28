package Unit0_asymptoticanalysis;

import java.util.Scanner;

public class u0p1_ {
    // Find sum of first n natural numbers

    // Method-1
    public static int methodA(int n){
        return n*(n+1)/2;

        // T.C. = O(c)
    }

    // Method-2
    public static int methodB(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;

        // T.C. = O(n)
    }

    // Method-3
    public static int methodC(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
           for(int j=1; j<=i; j++){
            sum++;
           }
        }
        return sum;

        // T.C. = O(n^2)
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(methodA(n));
        System.out.println(methodB(n));
        System.out.println(methodC(n));
        sc.close();
    }

}
