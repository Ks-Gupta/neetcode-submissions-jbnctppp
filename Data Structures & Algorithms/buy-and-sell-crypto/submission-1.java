class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;

        for(int i = 0; i < n; i++){
            int sell = prices[i];
            profit = Math.max(profit, sell - buy);

            if(buy > sell){
                buy = sell;
            }
        }

        return profit;
    }
}
