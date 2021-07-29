/*
//User function Template for Java
import java.util.*;
class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int n=str.length();
        int[][] dp= new int[n+1][n+1];

        //No need to fill first row and column with 0 in java as they are
        //by default 0

        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[i].length;j++)
            {
                if(str.charAt(i-1) == str.charAt(j-1) && i!=j)
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[n][n];
    }
}*/
