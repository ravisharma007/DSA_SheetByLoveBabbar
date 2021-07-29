/*
import java.util.*;

class Solution {

    public int lcs(String s1,String s2,int n,int m,int [][] dp)
    {
        if(n==0 || m==0)
        {
            return 0;
        }
        else
        {

            if(dp[n-1][m-1] != -1)
            {
                return dp[n-1][m-1];
            }

            if(s1.charAt(n-1) == s2.charAt(m-1))
            {
                dp[n-1][m-1]=1 + lcs(s1,s2,n-1,m-1,dp);
                return dp[n-1][m-1];
            }
            else
            {
                dp[n-1][m-1]=Math.max(lcs(s1,s2,n-1,m,dp),lcs(s1,s2,n,m-1,dp));
                return dp[n-1][m-1];
            }

        }


    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();

        int [][]dp=new int[n+1][m+1];

        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }

        int res=lcs(text1,text2,n,m,dp);
        return res;
    }
}*/
