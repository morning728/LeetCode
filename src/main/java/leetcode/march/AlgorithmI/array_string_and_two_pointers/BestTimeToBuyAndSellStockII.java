package leetcode.march.AlgorithmI.array_string_and_two_pointers;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        System.out.println((new BestTimeToBuyAndSellStockII.Solution().maxProfit(new int[]{7,6,4,3,1})));
    }

    static class Solution {
        /*
                7,1,5,3,6,4*/
        public int maxProfit(int[] prices) {
            int profit = 0, buyDay = 0;
            if (prices.length<2) return 0;
            for(int i = 1; i < prices.length; i++){
                if(prices[i] - prices[buyDay] > 0) {
                    profit += prices[i] - prices[buyDay];
                }
                buyDay = i;
            }
            return profit;
        }
    }
}
