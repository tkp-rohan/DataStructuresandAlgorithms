package unit4_arrays;

// Optimal Approach
// T.C. = O(n)
// A.S. = O(1)

public class u4p35_equilibriumpoint {
    public static boolean equilibriumPoint(int[] arr){
        int n = arr.length;
        int rs = 0;
        for(int i=0; i<n; i++){
            rs+=arr[i];
        }

        int ls = 0;
        for(int i=0; i<n; i++){
            rs-=arr[i];
            if(ls==rs){
                System.out.println("Equilibrium Point Index = " + i);
                return true;
            }
            ls+=arr[i];
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,8,-9,9,7};
        boolean res = equilibriumPoint(arr);
        System.out.println(res);
    }
}
