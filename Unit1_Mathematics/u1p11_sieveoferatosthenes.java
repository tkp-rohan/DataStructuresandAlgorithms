package unit1_mathematics;

public class u1p11_sieveoferatosthenes {
    
    // Efficient Solution to find primes in a range from 1 to n
    //T.C. = O(nloglogn) 

    // public static void sieve(int n){
    //     boolean[] isPrime = new boolean[n + 1];
    //     for(int i = 0; i <= n; i++){
    //         isPrime[i] = true;
    //     }
    //     isPrime[0] = false;
    //     isPrime[1] = false;
    //     for(int i = 2; i <= Math.sqrt(n); i++){
    //         if(isPrime[i]){
    //             for(int j=2*i; j<=n; j=j+i){
    //                 isPrime[j] = false;
    //             }
    //         }
    //     }
    //     for(int i=2; i<=n; i++){
    //         if(isPrime[i]){
    //             System.out.print(i + " ");
    //         }
    //     }
    // }


    // Optimized implementation of the above approach
    //T.C. = O(nloglogn) 
    public static void sieve(int n){

        boolean[] isPrime = new boolean[n + 1];

        for(int i=0; i<=n; i++){
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2; i*i<=n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
                for(int j=i*i; j<=n; j=j+i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=(int)Math.sqrt(n)+1; i<=n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){
        int n = 93;
        sieve(n);
    }
}