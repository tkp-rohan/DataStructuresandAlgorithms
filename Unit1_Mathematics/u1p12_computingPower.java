package unit1_mathematics;

public class u1p12_computingPower {
    
    // Naive Approach
    // T.C. = O(n)
    // public static int computePower(int n, int p){
    //     int res = 1;
    //     for(int i=0; i<p; i++){
    //         res*=n;
    //     }
    //     return res;
    // }

    // Efficient Solution
    // T.C. = O(logn)
    // A.S. = O(logn)
    public static int computePower(int n, int p){
        if(p==0){
            return 1;
        }
        int temp = computePower(n, p/2);
        temp *= temp;
        if(p%2==0){
            return temp;
        }else{
            return temp * n;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int p = 5;
        int ans = computePower(n, p);
        System.out.println(ans);
    }
}
