/*
import java.util.*;

class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int n=s.length();
        int m=t.length();

        int[][] dp=new int[n+1][m+1];

        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=m; j++)
            {
                //Base conditions :
                if(i==0)
                    dp[i][j]=j;

                else if(j==0)
                    dp[i][j]=i;

                // Actual condition flow :
                else if(s.charAt(i-1) == t.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = 1 + Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
}*/
