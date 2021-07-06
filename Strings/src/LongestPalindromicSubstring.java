/*
import java.util.*;

class Solution {
    static String longestPalin(String s){
        //s = "abccbc"
        int maxSubString=Integer.MIN_VALUE;
        StringBuilder t=new StringBuilder("");

        boolean[][] dp=new boolean[s.length()][s.length()];
        int count=0;
        for(int g=0;g<s.length();g++)
        {
            for(int i=0,j=g;i<s.length()-g;i++,j++)
            {
                if(g==0)
                {
                    dp[i][j]=true;
                }
                else if(g==1)
                {
                    dp[i][j]= (s.charAt(i)==s.charAt(j));
                }
                else
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        if(dp[i + 1][j - 1])
                        {
                            dp[i][j]=true;
                        }
                        else
                            dp[i][j]=false;
                    }
                    else
                    {
                        dp[i][j]=false;
                    }
                }
                if(dp[i][j])
                {
                    //count++;
                    String x=s;
                    x=x.substring(i,j+1);

                    if(x.length() > maxSubString)
                    {
                        maxSubString=x.length();
                        t=new StringBuilder(x);
                    }
                }
            }
        }
        return t.toString();
    }
}*/
