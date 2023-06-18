class Solution{
    public int maxProfit(int[] prices){
       int buy = 2147483647;
        int profit = 0; 
        for (int i = 0; i <prices.length; i++){
            buy = Math.min(buy, prices[i]);
            profit = Math.max(prices[i] - buy, profit);
        } return profit;
    }
}