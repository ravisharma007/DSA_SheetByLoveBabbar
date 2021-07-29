/*
import java.util.*;

class Driver
{
    public static void main(String[] args)
    {
        String str="GEEKSFORGEEKS";
        String phone[] = {"2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
        };

        Solution obj=new Solution();
        StringBuilder sb= obj.convert(str,phone);

        System.out.println(sb.toString());

    }
}

class Solution
{
    public StringBuilder convert(String s,String[] phone)
    {
        StringBuilder output=new StringBuilder("");

        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                output.append(0);
            }
            else
            {
                int position = s.charAt(i) - 'A';
                output.append(phone[position]);
            }
        }
        return output;
    }

}*/
