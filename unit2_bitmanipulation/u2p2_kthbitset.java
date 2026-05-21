package unit2_bitmanipulation;

public class u2p2_kthbitset {
    
    // Naive Approach
    // T.C. = O(K)
    // A.S. = O(1)
    // public static boolean isKthBitSet(int num, int k){
    //     int x =1;
    //     for(int i=0; i<(k-1); i++){
    //         x*=2;
    //     }
    //     if((num&x)!=0){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }



    // Another Naive Solution
    // T.C. = O(K)
    // A.S. = O(1)
    // public static boolean isKthBitSet(int num, int k){
    //     for(int i=0; i<(k-1); i++){
    //         num/=2;
    //     }
    //     if((num&1)!=0){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }



    // Efficient Solution - 1
    // T.C. = O(1)
    // A.S. = O(1)
    // public static boolean isKthBitSet(int num, int k){
    //     int x = (1<<(k-1));
    //     if((num&x)!=0){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    // Efficient Solution - 2
    // T.C. = O(1)
    // A.S. = O(1)
    public static boolean isKthBitSet(int num, int k){
        int x = (num>>(k-1));
        if((num&x)!=0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        int num = 5;
        int k = 3;
        boolean res = isKthBitSet(num, k);
        System.out.println(res);
    }

}
