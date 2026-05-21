package unit2_bitmanipulation;

public class u2p3_countsetbits {
    
    // Naive Solution
    // T.C. = O(n)
    // A.S. = O(1)
    // public static int countSetBits(int num){
    //     int temp = num;
    //     int res = 0;
    //     while(temp>0){
    //       // if(temp%2==1){
    //       //     res++;
    //       // }
    //          if((temp&1)==1){
    //              res++;
    //          }
    //          temp/=2;
    //     }
    //     return res;
    // }


    // Efficient Solution : Brian Kerningam's Algorithm
    // T.C. = O(set bits)
    // A.S. = O(1)
    // public static int countSetBits(int num){
    //     int res = 0;
    //     while(num>0){
    //         num = num & (num-1);
    //         res++;
    //     }
    //     return res;
    // }



    // Lookup Table Solution : The idea is to count set bits in O(1) time with some preprocessing involved.
    

    static int[] tbl = new int[256];
    
    public static void initialize(){
        tbl[0] = 0;
        for(int i=1; i<256; i++){
            tbl[i] = tbl[i&(i-1)]+1;
        }
    }

    public static int countSetBits(int num){
        return tbl[num&255] + tbl[(num>>8) & 255] + tbl[(num>>16) & 255] + tbl[(num>>24)&255];
    }

    public static void main(String[] args) {
        initialize();
        int num = 13;
        int ans = countSetBits(num);
        System.out.println(ans);
    }

}
