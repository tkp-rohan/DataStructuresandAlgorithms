package unit4_arrays;


// Efficient approach
// T.C. = O(n)
public class u4p20_stockbuyandsellpart2 {
    

    public static int maxProfit(int[] price){

        int n = price.length;

        int profit = 0;

        for(int i = 1; i < n; i++){

            if(price[i] > price[i - 1]){

                profit += (price[i] - price[i - 1]);
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] price = {1, 5, 3, 8, 12};

        System.out.println(maxProfit(price));
    }
}