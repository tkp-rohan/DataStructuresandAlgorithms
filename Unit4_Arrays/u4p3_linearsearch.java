package unit4_arrays;

// Linear search 
// TC = O(n)


public class u4p3_linearsearch {
    
    public static int linearsearch(int[] arr, int n, int x){

        for(int i=0; i<n; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int n = arr.length;
        int x = 5;
        System.out.println(linearsearch(arr, n, x));
    }

}
