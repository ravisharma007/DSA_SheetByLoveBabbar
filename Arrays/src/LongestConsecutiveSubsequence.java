/*
import java.util.HashSet;

class Solution
{
    // arr[] : the input array
    // N : size of the array arr[]

    //Function to return length of longest subsequence of consecutive integers.
    static int findLongestConseqSubseq(int arr[], int n)
    {
        // add your code here
        HashSet<Integer> hashset=new HashSet<>();
        int res=0;
        for(int i=0;i<n;i++)
        {
            hashset.add(arr[i]);
        }

        for(int i=0;i<n;i++)
        {
            if(!hashset.contains(arr[i]-1))
            {
                int j=arr[i]+1;
                while(hashset.contains(j))
                {
                    j++;
                }
                res= Math.max(res,j-arr[i]);
            }
        }
        return res;
    }
}*/
