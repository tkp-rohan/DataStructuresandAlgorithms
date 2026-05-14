package unit4_arrays;


// Naiove SOlution
// T.C. = O(n-square)

public class u4p19_stockbuyandsellpart1 {
    
    public static int maxProfit(int[] price, int st, int end){

        if(end <= st){
            return 0;
        }

        int profit = 0;

        for(int i = st; i < end; i++){

            for(int j = i + 1; j <= end; j++){

                if(price[j] > price[i]){

                    int curr_profit =
                            (price[j] - price[i]) +
                            maxProfit(price, st, i - 1) +
                            maxProfit(price, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] price = {1, 5, 3, 8, 12};

        int n = price.length;

        System.out.println(maxProfit(price, 0, n - 1));
    }
}