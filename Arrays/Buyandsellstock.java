import java.util.*;

public class Buyandsellstock {
    public static int BuyandStock(int prices[]) {
        int BuyPrice = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (BuyPrice < prices[i]) {
                int profit =prices[i] - BuyPrice;
                max_profit = Math.max(max_profit, profit);
            }

            else {
                BuyPrice = prices[i];
            }
        }
        return max_profit;

    }

    public static void main(String[] args) {
        Buyandsellstock object = new Buyandsellstock();
        int Array[] = { 7, 1, 5, 3, 6, 4};
        System.out.println(object.BuyandStock(Array));
    }
}