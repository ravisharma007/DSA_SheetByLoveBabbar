import java.util.*;
// GFG Practice TLE - Its Compiler is noob :

/*class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here

        HashSet<String> hs = new HashSet<>(B);

        int [] dp=new int[A.length()];

        for(int i=0;i<A.length();i++)
        {
            for(int j=0; j<=i; j++)
            {
                String t=A.substring(j,i+1);

                    if(hs.contains(t) )
                    {
                        if(j>0)
                        {
                            dp[i]=dp[i]+dp[j-1];
                        }
                        else
                        {
                            dp[i]=dp[i]+1;
                        }
                    }
            }
        }

        for(int x : dp)
        {
            System.out.print(x+ ", ");
        }
        return dp[dp.length-1] > 0 ? 1: 0;

    }
}*/


// leet Code Practice - Accepted Successfully

/*
class Solution
{
    public boolean wordBreak(String A, List<String> B)
    {
        //code here

        HashSet<String> hs = new HashSet<>(B);

        int [] dp=new int[A.length()];

        for(int i=0;i<A.length();i++)
        {
            for(int j=0; j<=i; j++)
            {
                String t=A.substring(j,i+1);

                if(hs.contains(t) )
                {
                    if(j>0)
                    {
                        dp[i]=dp[i]+dp[j-1];
                    }
                    else
                    {
                        dp[i]=dp[i]+1;
                    }
                }
            }
        }

        */
/*for(int x : dp)
        {
            System.out.print(x+ ", ");
        }*//*

        return dp[dp.length-1] > 0;

    }
}*/
