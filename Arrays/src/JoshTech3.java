/*
//Length of the longest alternating even odd subarray
import java.util.*;

class Driver
{
    public static void main(String[] args) {
        int[] arr=new int[]{1, 3, 5,6,8,10,11,12};

        Solution obj=new Solution();
        int x = obj.findLength(arr,arr.length);
        System.out.println(x);
    }
}

class Solution
{
    public int findLength(int [] arr,int n)
    {
        int i=0,j=1;
        int max=Integer.MIN_VALUE;
        int count=1;

        while(j<n)
        {
                if(arr[j-1]%2 ==0 && arr[j]%2 !=0)
                {
                    count++;
                    j++;
                }
                else if(arr[j-1]%2 !=0 && arr[j]%2 ==0 )
                {
                    count++;
                    j++;
                }
                else
                {
                    max=Math.max(max,count);
                    count=1;
                    j++;
                }
        }
        max=Math.max(max,count);
        return max==1 ? 0 : max;
    }
}*/
