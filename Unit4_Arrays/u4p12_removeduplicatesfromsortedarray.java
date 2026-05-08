package Unit4_Arrays;

public class u4p12_removeduplicatesfromsortedarray {
    

    public static int removeDuplicates(int[] arr, int n){

        int res = 1;

        for(int i = 1; i < n; i++){

            if(arr[i] != arr[res - 1]){

                arr[res] = arr[i];
                res++;
                
            }
        }

        return res;
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};

        int n = removeDuplicates(arr, arr.length);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}