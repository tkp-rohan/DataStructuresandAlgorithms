package unit4_arrays;

public class u4p30_prefixsum {
    
    public static int[] getPrefixSum(int arr[]){
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int getSum(int prefix[], int l, int r){
        if(l == 0){
            return prefix[r];
        }
        return prefix[r] - prefix[l - 1];
    }

    public static void main(String[] args){
        int arr[] = {2, 8, 3, 9, 6, 5, 4};
        int prefix[] = getPrefixSum(arr);
        System.out.println(getSum(prefix, 0, 2));
        System.out.println(getSum(prefix, 1, 3));
        System.out.println(getSum(prefix, 2, 6));
    }
}