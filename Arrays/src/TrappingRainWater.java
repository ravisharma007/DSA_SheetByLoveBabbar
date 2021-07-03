/*
import java.util.*;


class Solution{

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) {

        // Your code here
        int sum=0;

        for(int i=0;i<n;i++)
        {
            int j;
            int maxLeft=0;
            int maxRight=0;
            for(j=0;j<=i;j++)
            {
                maxLeft=Math.max(maxLeft,arr[j]);
            }

            for(j=i;j<n;j++)
            {
                maxRight=Math.max(maxRight,arr[j]);
            }
            sum= sum + Math.min(maxLeft,maxRight) - arr[i];
        }
        return sum;
    }
}


//Better Approach Time O(n) and Space O(n) :


class Solution{

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) {

        // Your code here
        int sum=0;
        int[] leftMax=new int[arr.length];
        int maxLeft=0;
        int[] rightMax=new int[arr.length];
        int maxRight=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] > maxLeft)
            {
                maxLeft=arr[i];
            }
            leftMax[i]=maxLeft;
        }

        for(int i=n-1;i>=0;i--)
        {
            if(arr[i] > maxRight)
            {
                maxRight=arr[i];
            }
            rightMax[i]=maxRight;
        }

        for(int i=0;i<n;i++)
        {
            //calculating total trapped water in this loop for every index
            sum += Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        return sum;
    }
}


//Final Optimal solution Time O(n) and space O(1):

class Solution{

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) {

        // Your code here
        int low=0;
        int high=n-1;
        int maxLeft=0;
        int maxRight=0;
        int res=0;

        while(low <= high)
        {
            if(arr[low] < arr[high])
            {
                if(arr[low] > maxLeft)
                {
                    maxLeft=arr[low];
                }
                else
                {
                    res = res + (maxLeft-arr[low]);
                }
                low++;
            }
            else
            {
                if(arr[high] > maxRight)
                {
                    maxRight=arr[high];
                }
                else
                {
                    res = res + (maxRight-arr[high]);
                }
                high--;
            }
        }
        return res;
    }
}
*/
