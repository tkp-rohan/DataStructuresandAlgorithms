package unit4_arrays;

public class u4p37_partitionarraywithequalsum {
    public static boolean isPossible(int[] arr, int k){
        int n = arr.length;
        int totalSum = 0;
        for(int i=0; i<n; i++){
            totalSum += arr[i];
        }

        if(totalSum%k!=0){
            return false;
        }

        int partSum = totalSum/k;

        int currSum = 0;
        int parts = 0;
        for(int i=0; i<n; i++){
            currSum += arr[i];
            if(currSum == partSum){
                parts++;
                currSum = 0;
            }else if(currSum>partSum){
                return false;
            }
        }
        return parts == k;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 1, 1, 1, 4};
        int k = 3;
        System.out.println(isPossible(arr, k));
    }
}
