/*
import java.util.*;

class Solution {
    public int countSubstrings(String s) {
        //s = "abccbc"

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
                    count++;
            }
        }
        return count;
    }
}*/
