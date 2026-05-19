package unit1_mathematics;

public class u1p9_primefactors {
    
    public static void printPrimeFactors(int num){
        if(num<=1){
            return;
        }
    
        while(num%2==0){
            System.out.print(2+" ");
            num/=2;
        }

        while(num%3==0){
            System.out.print(3+" ");
            num/=3;
        }

        for(int i=5; i<=Math.sqrt(num); i+=6){
            while(num%i==0){
                System.out.print(i+" ");
                num/=i;
            }
            while(num%(i+2)==0){
                System.out.print(i+2+" ");
                num/=(i+2);
            }
        }
        if(num>3){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int num = 450;
        printPrimeFactors(num);
    }
}
