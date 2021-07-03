/*
import java.util.*;

class Driver
{
    public static void main(String[] args) {
        String str1="xy";
        String str2="12";
        String result="1x2y";
        Solution obj=new Solution();
        boolean x= obj.isShuffle(str1,str2,result);
        System.out.println(x);
    }
}

class Solution
{
    public String stringSort(String str)
    {
        char[] c=str.toCharArray();
        Arrays.sort(c);
        String s=String.valueOf(c);
        return s;
    }
    public boolean isShuffle(String s1,String s2,String result)
    {
        s1=stringSort(s1);
        s2=stringSort(s2);
        result=stringSort(result);

        if(s1.length()+s2.length() != result.length())
            return false;

        int i=0,j=0,k=0;

        while (k<result.length())
        {
            if(i<s1.length() && s1.charAt(i) == result.charAt(k))
            {
                i++;
                k++;
            }
            else if(j<s2.length() && s2.charAt(j) == result.charAt(k))
            {
                j++;
                k++;
            }
            else return false;
        }

        if(i<s1.length() || j<s2.length())
            return false;
        else
            return true;
    }
}
*/
