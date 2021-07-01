/*
import java.util.*;

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {

        String flag="Yes";
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<n;i++)
        {
            set.add((int)a1[i]);
        }

        for(int i=0; i<m; i++)
        {
            if(!set.contains((int)a2[i]))
            {
               return "No";
            }
        }
        return flag;
    }
}*/
