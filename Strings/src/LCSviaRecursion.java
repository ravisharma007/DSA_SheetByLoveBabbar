/*
import java.util.*;

class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        if(x==0 || y==0)
        {
            return 0;
        }
        else
        {
            if(s1.charAt(x-1) == s2.charAt(y-1))
            {
                return 1 + lcs(x-1,y-1,s1,s2);
            }
            else
            {
                return Math.max(lcs(x-1,y,s1,s2),lcs(x,y-1,s1,s2));
            }
        }
    }

}*/
