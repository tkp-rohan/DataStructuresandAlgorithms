package unit1_mathematics;

public class u1p6_gcdorhcfoftwonumbers {
    
    // Naive Approach
    // T.C. = O(n)
    // public static int gcd(int num1, int num2){
    //     int res = Math.min(num1, num2);
    //     while(res>0){
    //         if(num1%res==0 && num2%res==0){
    //             break;
    //         }
    //         res--;
    //     }
    //     return res;
    // }


    // Euclidean Approach
    public static int gcd(int num1, int num2){
        if(num2 == 0){
            return num1;
        }else{
            return gcd(num2, num1%num2);
        }
    }


    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 42;
        int ans = gcd(num1, num2);
        System.out.println(ans);
    }

}
