package unit4_arrays;

public class u4p31_prefixsweightedsumquery {

    public static int[] getPrefixSum(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int[] getWeightedPrefixSum(int arr[]) {
        int n = arr.length;
        int weightedPrefix[] = new int[n];
        weightedPrefix[0] = 1 * arr[0];
        for(int i = 1; i < n; i++) {
            weightedPrefix[i] = weightedPrefix[i - 1] + ((i + 1) * arr[i]);
        }
        return weightedPrefix;
    }

    public static int getWeightedSum(int arr[], int prefix[], int weightedPrefix[], int l, int r) {
        if(l == 0) {
            return weightedPrefix[r];
        }
        int weightedSum = weightedPrefix[r] - weightedPrefix[l - 1];
        int normalSum = prefix[r] - prefix[l - 1];

        return weightedSum - (l * normalSum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 6, 1};
        int prefix[] = getPrefixSum(arr);
        int weightedPrefix[] = getWeightedPrefixSum(arr);

        System.out.println(getWeightedSum(arr, prefix, weightedPrefix, 0, 2));
        System.out.println(getWeightedSum(arr, prefix, weightedPrefix, 2, 3));
    }
}