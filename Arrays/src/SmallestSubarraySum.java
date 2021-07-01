/*
import java.util.*;

class Solution {

    public static int sb(int a[], int n, int x) {
        // Your code goes here

        int i=0,j=0;
        int currSum=0;
        int res = Integer.MAX_VALUE;

        while(j < n)
        {
            while (j<n && currSum <=x)
            {
                currSum += a[j++];
            }

            while (i<j && currSum > x)
            {
                res=Math.min(res,j-i+1);
                currSum -= a[i++];
            }
        }
        return res;

    }
}
*/
