import com.sun.source.doctree.SeeTree;

import java.util.*;

class Solution{

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        int[] arr2 = arr;

        Set<Integer> set =new TreeSet<>();

        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }

        Integer[] iar= set.toArray(new Integer[]{});
        return iar[k-1];
       /* Object[] a = set.toArray();
        int x = (int) a[k-1];
        return x;*/
    }
}
