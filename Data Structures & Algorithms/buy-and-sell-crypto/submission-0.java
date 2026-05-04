class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i =0,j = 1 ;
        int maxProfit = 0;
        int minPrice = prices[i];
        while(j<n)
        {
            if(prices[i] < prices[j]){
                int profit = prices[j]-prices[i];
                maxProfit = Math.max(maxProfit,profit);
            } else{
                i = j;
            }
            j++;
         
    }

    return maxProfit;
    }
}
