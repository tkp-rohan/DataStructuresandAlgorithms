package unit4_arrays;

public class u4p32_suffixsum{
    public static int[] getSuffixSum(int arr[]){
        int n = arr.length;
        int suffix[] = new int[n];
        suffix[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + arr[i];
        }
        return suffix;
    }

    public static void main(String[] args){
        int arr[] = {2, 8, 3, 9, 6, 5, 4};
        int suffix[] = getSuffixSum(arr);
        for(int i = 0; i < suffix.length; i++){
            System.out.print(suffix[i] + " ");
        }
    }
}