package unit2_bitmanipulation;

public class u2p4_poweroftwo {
    
    // Naive Solution
    // T.C. = O(logn)
    // public static boolean isPowerOfTwo(int num){
    //     if(num==0){
    //         return false;
    //     }
    //     while(num!=1){
    //         if(num%2!=0){
    //             return false;
    //         }
    //         num/=2;
    //     }
    //     return true;
    // }


    // Efficient Solution
    // T.C. = O(1)
    public static boolean isPowerOfTwo(int num){
        // if(num==0){
        //     return false;
        // }

        return num != 0 && ((num & (num - 1)) == 0);
    }

    public static void main(String[] args) {
        int num = 16;
        boolean res = isPowerOfTwo(num);
        System.out.println(res);
    }

}
