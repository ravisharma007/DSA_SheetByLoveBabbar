/*
import java.util.*;

class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        //m=5
        a.sort((o1,o2) -> Long.compare(o1,o2));

        a.sort(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                if(o1<o2)
                    return -1;
                else if(o1==o2)
                    return 0;
                else
                    return 1;
            }
        });

        long minDiff=Integer.MAX_VALUE;
        long i=0;
        long j=m-1;

        while(i<n && j<n)
        {
            long res=a.get((int)j)-a.get((int)i);
            minDiff=Math.min(minDiff,res);
            i++;
            j++;
        }
        return minDiff;

    }
}*/
