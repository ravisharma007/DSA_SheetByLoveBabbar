/*
import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        int min,max,minResult;

        Arrays.sort(arr);
        minResult = arr[n-1] - arr[0];

        for(int i=1; i<n; i++)
        {
            if(arr[i] >= k)
            {
                max = Math.max(arr[n-1]-k,arr[i-1]+k);
                min = Math.min(arr[0]+k,arr[i]-k);
                minResult=Math.min(minResult,max-min);
            }
        }
        return minResult;
    }
}*/
