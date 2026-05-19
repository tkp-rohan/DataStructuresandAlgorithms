package unit1_mathematics;

public class u1p10_alldivisors {
    
    // Naive Solution
    // T.C. = O(n)
    // public static void printAllDivisorsOfGivenNumber(int num){
    //     for(int i=1; i<=num; i++){
    //         if(num%i==0){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }

    // Efficient Solution
    // T.C. = O(sqrt of n)
    // public static void printAllDivisorsOfGivenNumber(int num){
    //     for(int i=1; i<=Math.sqrt(num); i++){
    //         if(num%i==0){
    //             System.out.print(i+" ");
    //             if(i!=(num/i)){
    //                 System.out.print(num/i + " ");
    //             }
    //         }

    //     }
    // }

    // Efficient Solution that prints 
    // T.C. = O(sqrt of n)
    public static void printAllDivisorsOfGivenNumber(int num){
        int i;
        for(i=1; i<Math.sqrt(num); i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        for( i=(int)Math.sqrt(num); i>=1; i--){
            if(num%i==0){
                System.out.print(num/i + " ");
            }
        }
    }


    public static void main(String[] args) {
        int num = 56;
        printAllDivisorsOfGivenNumber(num);
    }
}
