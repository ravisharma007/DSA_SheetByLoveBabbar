/*
import java.util.*;

class Driver
{
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="ADBC";
        Solution obj=new Solution();
        boolean x= obj.isRotation(str1,str2);
        System.out.println(x);
    }
}

class Solution
{
    public boolean isRotation(String s1,String s2)
    {
        String temp=s1+s1;
        return (s1.length()==s2.length() &&
                temp.contains(s2));
    }
}
*/
