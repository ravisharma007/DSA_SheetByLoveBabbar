/*

import java.util.*;

class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long overallMax=1;
        long max=1L;
        long min=1L;

        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0) //positive no.
            {
                max=max*arr[i];
                min=Math.min(1L,(long)arr[i]*min);
            }
            else if(arr[i] == 0)
            {
                max=min=1L;
            }
            else if(arr[i] < 0) //negative no.
            {
                max=max+min; //{
                min=max-min; //  swapping without using 3rd variable
                max=max-min; //}

                min= min*arr[i];
                max=Math.max(1L,(long)arr[i]*max);
            }

            if(overallMax < max)
            {
                overallMax=max;
            }
        }
        return overallMax;
    }
}*/
