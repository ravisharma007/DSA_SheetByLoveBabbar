/*
import java.util.*;

class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int n=s.length();
        int m=t.length();

        int res=fun(s,t,n,m);
        return res;
    }

    public int fun(String s1,String s2,int n,int m)
    {
        if(n==0)
            return m;
        if(m==0)
            return n;

        if(s1.charAt(n-1) == s2.charAt(m-1))
        {
            return fun(s1,s2,n-1,m-1);
        }
        else
        {
            return 1 + Math.min(fun(s1,s2,n,m-1),Math.min(fun(s1,s2,n-1,m),fun(s1,s2,n-1,m-1)));
        }
    }
}
*/
