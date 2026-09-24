class Solution {
    public int maxProfit(int[] prices) {
        int minValue=prices[0];
        int maxProfit=0;
        for (int i=0; i<prices.length; i++){
            int currentProfit=prices[i]-minValue;
            minValue=Math.min(minValue, prices[i]);
            if (currentProfit>maxProfit){
                    maxProfit=currentProfit;
            }

        }
        return maxProfit;
        
    }
}
