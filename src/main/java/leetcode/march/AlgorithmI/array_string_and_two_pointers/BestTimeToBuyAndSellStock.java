package leetcode.march.AlgorithmI.array_string_and_two_pointers;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println((new BestTimeToBuyAndSellStock.Solution().maxProfit(new int[]{3,7,8,1,2,2,2})));
    }

    static class Solution {
/*7,1,5,3,6,4
        3 7 8 1 2 2 2*/
        public int maxProfit(int[] prices) {
            int maxProfit = 0, buyDay = 0;
            if (prices.length<2) return 0;
            for(int i = 1; i < prices.length; i++){
                maxProfit = prices[i] - prices[buyDay] > maxProfit ? prices[i] - prices[buyDay] : maxProfit;
                buyDay = prices[buyDay] - prices[i] > 0 ? i : buyDay;
            }
            return maxProfit;
        }
    }
}
