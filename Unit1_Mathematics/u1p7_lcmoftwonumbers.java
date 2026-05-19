package unit1_mathematics;

public class u1p7_lcmoftwonumbers {
    
    // Naive Approach
    // T.C. = O(n)

    // public static int lcm(int num1, int num2){
    //     int res = Math.max(num1, num2);
    //     while(true){
    //         if(res%num1==0 && res%num2==0){
    //             break;
    //         }
    //         res++;
    //     }
    //     return res;
    // }



    // Optimized Approach
    // Using GCD
    // num1 * num2 = gcd(num1, num2) * lcm(num1, num2);

    // public static int gcd(int num1, int num2){
    //     if(num2 == 0){
    //         return num1;
    //     }else{
    //         return gcd(num2, num1%num2);
    //     }
    // }

    public static int lcm(int num1, int num2){
        // int hcf = gcd(num1, num2);
        int hcf = u1p6_gcdorhcfoftwonumbers.gcd(num1, num2);
        return ((num1*num2)/hcf);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 42;
        int ans = lcm(num1, num2);
        System.out.println(ans);
    }

}
