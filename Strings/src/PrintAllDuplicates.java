/*
import java.util.*;

class Driver
{
    public static void main(String[] args) {
        String str="aswfsawwra";
        Solution obj=new Solution();
        obj.findDuplicates(str);
    }
}

//Method 1 : Hashing-
class Solution
{
    final int NO_OF_CHARS=256;
    public void fillCountArr(String str,int[] count)
    {
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
    }

    public void findDuplicates(String str)
    {
        int[] count=new int[NO_OF_CHARS];
        fillCountArr(str,count);
        for(int i=0;i<str.length();i++)
        {
            int x=count[str.charAt(i)];
            if(x>1)
            {
                System.out.println(str.charAt(i) + ", Count : " + x);
                count[str.charAt(i)]=0;
            }
        }
    }
}

//Method 2 Map :
*/
