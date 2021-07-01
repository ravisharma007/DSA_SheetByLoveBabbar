/*
import java.util.*;

class GfG
{
    public static int palinArray(int[] a, int n)
    {
        //add code here.
        for(int i=0;i<n;i++)
        {
            int x=a[i];
            int y=0;

            while (x !=0)
            {
                int t=0;
                t=x%10;
                y=y*10 + t;
                x=x/10;
            }
            if(a[i] != y)
                return 0;
        }
        return 1;
    }
}*/
