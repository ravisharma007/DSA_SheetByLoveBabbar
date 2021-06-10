/*

class Driver
{
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        Solution obj=new Solution();
        int profit= obj.maxProfit(prices);
        System.out.println("Profit : " + profit);

    }
}
//BruteForce Solution:
*/
/*
class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit=0;

        for(int i=0; i < prices.length-1; i++)
        {
            for(int j=i+1; j<prices.length; j++)
            {
                if(prices[j] - prices[i] >= 0)
                {
                   maxProfit= Math.max(maxProfit,prices[j]-prices[i]);
                }
            }
        }
        return maxProfit;
    }
}*//*


class Solution {
    public int maxProfit(int[] prices) {

        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0; i<prices.length; i++)
        {
            minPrice=Math.min(minPrice,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;

    }
}
*/
