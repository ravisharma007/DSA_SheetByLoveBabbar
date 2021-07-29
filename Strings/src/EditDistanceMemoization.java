/*
import java.util.*;

class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int n=s.length();
        int m=t.length();
        int[][] dp=new int[n+1][m+1];

        for(int[] rows : dp)
        {
            Arrays.fill(rows,-1);
        }

        int res=fun(s,t,n,m,dp);
        return res;
    }

    public int fun(String s1,String s2,int n,int m,int dp[][])
    {
        if(n==0)
            return m;
        if(m==0)
            return n;

        if(dp[n][m] != -1)
        {
            return dp[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1))
        {
            return dp[n][m] = fun(s1,s2,n-1,m-1,dp);
        }
        else
        {
            dp[n][m] = 1 + Math.min(fun(s1,s2,n,m-1,dp),Math.min(fun(s1,s2,n-1,m,dp),fun(s1,s2,n-1,m-1,dp)));
            return dp[n][m];
        }
    }
}
*/
