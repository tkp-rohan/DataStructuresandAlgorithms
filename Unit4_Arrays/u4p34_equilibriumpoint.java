package unit4_arrays;

// Optimized approach

public class u4p34_equilibriumpoint {

    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] ps = new int[n];
        ps[0] = arr[0];
        for(int i=1; i<n; i++){
            ps[i] = ps[i-1] + arr[i];
        }
        return ps;
    }

    public static int[] suffixSum(int[] arr){
        int n = arr.length;
        int[] ss = new int[n];
        ss[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            ss[i] = ss[i+1] + arr[i];
        }
        return ss;
    }

    public static boolean equilibriumPoint(int[] arr){
        int[] ps = prefixSum(arr);
        int[] ss = suffixSum(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            int leftSum = 0;
            int rightSum = 0;

            if(i!=0){
                leftSum = ps[i-1];
            }

            if(i!=n-1){
                rightSum = ss[i+1];
            }

            if(leftSum == rightSum){
                System.out.println("Equilibrium Point Index = " + i);
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
