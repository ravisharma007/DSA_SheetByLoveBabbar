/*
import java.util.*;

class Driver
{
    public static void main(String[] args) {

        String str="abc";
        Solution obj=new Solution();
        HashSet<String> set= obj.allSequence(str);

        set.forEach(item -> System.out.print(item + ", "));
    }
}

class Solution
{
    public HashSet<String> allSequence(String str)
    {
        HashSet<String> set=new HashSet<>();
        for(int i=0; i<str.length();i++)
        {
            for(int j=i; j<str.length();j++)
            {
                if(i==j)
                {
                    set.add(String.valueOf(str.charAt(i)));
                }
                else
                {
                    String x= str;
                    x=x.substring(i,j+1);
                    set.add(x);
                }
            }
        }
        return set;
    }
}*/
