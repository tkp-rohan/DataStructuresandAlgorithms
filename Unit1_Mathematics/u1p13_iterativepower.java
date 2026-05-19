package unit1_mathematics;

// Iterative power (Binary Exponentiation)
// T.C. = O(log n)
// A.S. = O(1)

public class u1p13_iterativepower {

    // Simple Binary Exponentiation
    /*
    public static int power(int num, int pow) {
        int res = 1;
        while (pow > 0) {
            // If pow is odd
            if ((pow & 1) == 1) {
                res *= num;
            }
            // Square the base
            num *= num;
            // Divide pow by 2
            pow = pow >> 1;
        }
        return res;
    }
    */


    // Iterative Power with Modulo (Binary Exponentiation)
    // T.C. = O(log n)
    // A.S. = O(1)

    public static int power(int num, int pow, int mod) {
        int res = 1;
        while (pow > 0) {
            // If pow is odd
            if ((pow & 1) == 1) {
                res = (res * num) % mod;
            }
            // Square the base and take modulo
            num = (num * num) % mod;
            // Divide pow by 2
            pow = pow >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 4;
        int pow = 5;
        int mod = 1000000007;
        System.out.println(power(num, pow, mod));
    }
}