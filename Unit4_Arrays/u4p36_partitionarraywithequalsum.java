package unit4_arrays;

// Divide array into 3 parts such that:
// sum(part1) = sum(part2) = sum(part3)

public class u4p36_partitionarraywithequalsum {
    public static boolean isPossible(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        for(int i=0; i<n; i++){
            totalSum += arr[i];
        }

        if(totalSum%3!=0){
            return false;
        }

        int partSum = totalSum/3;
        int currSum = 0;
        int parts = 0;

        for(int i=0; i<n; i++){
            currSum += arr[i];
            if(currSum == partSum){
                parts++;
                currSum = 0;
            }
        }

        return parts>=3;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,6,1,1,1,1,4};
        System.out.println(isPossible(arr));
    }
}
