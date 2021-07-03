/*
import java.util.*;

*/
/*class Solution
{
    public int TotalPairs(int[] nums, int x, int y)
    {
        // Code here
        int overAllCount=0;
        int n=nums.length;
        Arrays.sort(nums);
        int i=0,j=n-1;


        while(i<j && i>=0 && j<n)
        {

            int p=nums[i]*nums[j];
            if( p>= x && p<=y)
            {
                overAllCount++;
                j--;

            }
            else if(p < x)
            {
                i++;
            }
            else if(p > y)
            {
                j--;
            }

            if(i>=1 && i<j)
            {
                int xx=nums[i-1];
                while (i<j && nums[i]==xx){
                    overAllCount++;
                    i++;
                }
            }
            if(j>=1 && j<n && j>i)
            {
                int yy=nums[j+1];
                while (i<j && nums[i]==yy){
                    overAllCount++;
                    j--;
                }
            }

        }
        return overAllCount;
    }
}*//*


class Solution
{
    public int TotalPairs(int[] nums, int x, int y)
    {
        // Code here
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int p=nums[i]*nums[j];
                if(p >=x && p<=y)
                {
                    count++;
                }
                if(p>y)
                    break;
            }
        }
        return count;
    }
}
*/
