/*
import java.util.*;

class Complete{


    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int good=0;
        int currBad=0;
        int minBad=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i] <= k)
                good++;
        }

        for(int i=0;i<good;i++)
        {
            if(arr[i] > k)
                currBad++;
        }

        int i=0,j=good-1;
        while(j<n)
        {
            minBad=Math.min(minBad,currBad);
            j++;
            if(j<n && arr[j] >k)
                currBad++;

            if(arr[i] > k)
                currBad--;
            i++;
        }
        return minBad;
    }
}*/
