package unit1_mathematics;

public class u1p8_checkforprime {
    
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        if(num == 2 || num == 3){
            return true;
        }else if(num%2==0 || num%3==0){
            return false;
        }else{
            for(int i=5; i<=Math.sqrt(num); i+=6){
                if(num%i==0 || num%(i+2)==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(isPrime(num));
    }
}
