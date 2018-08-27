class Solution {
    //Use kadane's algorithm for maximum subarrays
    public int maxProfit(int[] prices) {
        if (prices.length <= 1){
            return 0;
        }
        int currentMax = 0, globalMax = 0;
        int[] diff = new int[prices.length];
        diff[0] = 0;
        for (int i = 1; i < prices.length; i++){
            diff[i] = prices[i] - prices[i-1];
        }
        for (int i = 0; i < prices.length; i++){
            currentMax = Math.max(diff[i], currentMax + diff[i]);
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }
}
