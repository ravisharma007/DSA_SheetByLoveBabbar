/*
class Driver
{
    public static void main(String[] args) {
        int[] arr={10, 22, 5, 75, 65, 80};

        Solution obj=new Solution();
        int res=obj.findMax(arr);
        System.out.println(res);
    }
}

class Solution
{
    public int findMax(int[] arr)
    {
        int overallMaxWith2Transaction=0;

        //left to right:
        int leastBuyingPoint=arr[0];
        int currMaxSellProfit=0;
        int[] dpOfBestSellMax =new int[arr.length];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < leastBuyingPoint)
                leastBuyingPoint=arr[i];

            currMaxSellProfit=arr[i]-leastBuyingPoint;
            if(currMaxSellProfit > dpOfBestSellMax[i-1])
            {
                dpOfBestSellMax[i]=currMaxSellProfit;
            }
            else
            {
                dpOfBestSellMax[i]= dpOfBestSellMax[i-1];
            }
        }

        //right to left:
        int mostSellingPoint=arr[arr.length-1];
        int currMaxBuyProfit=0;
        int[] dpOfBestBuyMax =new int[arr.length];

        for(int i= arr.length-2; i>=0; i--)
        {
            if(arr[i] > mostSellingPoint)
                mostSellingPoint=arr[i];

            currMaxBuyProfit=mostSellingPoint-arr[i];
            if(currMaxBuyProfit > dpOfBestBuyMax[i+1])
            {
                dpOfBestBuyMax[i]=currMaxBuyProfit;
            }
            else
            {
                dpOfBestBuyMax[i]= dpOfBestBuyMax[i+1];
            }
        }

        //last step to find max of addition in both the dp arr[]

        for(int i=0; i< arr.length; i++)
        {
            if(dpOfBestBuyMax[i] + dpOfBestSellMax[i] > overallMaxWith2Transaction)
            {
                overallMaxWith2Transaction=dpOfBestBuyMax[i] + dpOfBestSellMax[i];
            }
        }
        return overallMaxWith2Transaction;
    }
}*/
