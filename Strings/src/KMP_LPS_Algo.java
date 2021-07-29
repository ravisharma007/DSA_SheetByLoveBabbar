/*
import java.util.*;

class Solution {
    int lps(String s) {
        // code here

        int j=0,i=1;
        int[] aux=new int[s.length()];
        Arrays.fill(aux,0);

        while(j < s.length())
        {
            if(s.charAt(j) == s.charAt(i))
            {
                aux[i]=j+1;
                i++;
                j++;
            }
            else
            {
                if(j == 0)
                {
                    i++;
                }
                else
                {
                    j=aux[j-1];
                }
            }
        }
        return aux[aux.length-1];
    }
}*/
