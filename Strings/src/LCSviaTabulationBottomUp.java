/*
import java.util.*;

class Driver{
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";

        Solution obj=new Solution();
        obj.longestCommonSubsequence(s1,s2);
    }
}

class Solution
{
    public int longestCommonSubsequence(String text1, String text2)
    {
        int n=text1.length(),m=text2.length();
        int [][] dp=new int[n+1][m+1];


        Arrays.fill(dp[0],0);
        for(int i=1;i< dp.length;i++)
        {
            dp[i][0]=0;
        }

        for(int i=1; i< dp.length; i++)
        {
            for(int j=1; j<dp[i].length; j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }


       */
/* for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                System.out.print(dp[i][j] + ", ");
            }
            System.out.println();
        }*//*

        return dp[n][m];
    }
}*/
