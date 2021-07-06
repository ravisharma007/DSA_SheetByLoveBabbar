/*
import java.util.*;

class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        else
        {
            String str=countAndSay(n-1);
            String t="";
            for(int i=0;i<str.length();)
            {
                int count=1;
                char current= str.charAt(i);
                i++;
                if(i>0 && i<str.length())
                {
                    char cc=str.charAt(i-1);
                    while (i<str.length() && str.charAt(i)==cc)
                    {
                        count++;
                        i++;
                    }
                }

                String st1=String.valueOf(count);
                String st2=String.valueOf(current);
                t=t+st1+st2;

            }
            return t;
        }
    }
}*/
