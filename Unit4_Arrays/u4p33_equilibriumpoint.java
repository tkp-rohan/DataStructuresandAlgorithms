package unit4_arrays;

public class u4p33_equilibriumpoint {


    // Naive Approach
    // T.C. = O(n-square)
    // A.S. = O(1)

    public static boolean equilibriumPoint(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int ls = 0;
            int rs = 0;
            for(int j=0; j<i; j++){
                ls+=arr[j];
            }
            for(int k=i+1; k<n; k++){
                rs+=arr[k];
            }
            if(ls==rs){
                return true;
            }
        }
        return false;
    }



    

    public static void main(String[] args) {
        int[] arr = {3,4,8,-9,9,7};
        boolean res = equilibriumPoint(arr);
        System.out.println(res);
    }
}
