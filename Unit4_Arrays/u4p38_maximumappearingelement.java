package unit4_arrays;

public class u4p38_maximumappearingelement {

    public static int maxAppearance(int[] left, int[] right, int n){
        int[] freq = new int[100];
        for(int i = 0; i < n; i++){
            for(int j = left[i]; j <= right[i]; j++){
                freq[j] += 1;
            }
        }
        int res = 0;
        for(int i = 1; i < 100; i++){
            if(freq[i] > freq[res]){
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 4};
        int[] right = {4, 5, 7};
        int n = left.length;
        System.out.println(maxAppearance(left, right, n));
    }
}