package Unit4_Arrays;

public class u4p14_leftrotateanarraybyone {

    public static int[] leftRotatebyOne(int[] arr){

        int n = arr.length;

        int temp = arr[0];

        for(int i = 1; i < n; i++){
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        leftRotatebyOne(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}