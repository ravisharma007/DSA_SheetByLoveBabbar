/*


//Naive Approach O(n^3)
class Solution
{
    //Function to find if there exists a triplet in the
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int x) {

        // Your code Here

        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int sum= A[i]+A[j]+A[k];
                    if(sum==x)
                        return true;
                }
            }
        }
        return false;
    }
}

//Optimal Approach O(n^2):

import java.util.Arrays;

class Solution
{
    //Function to find if there exists a triplet in the
    //array A[] which sums up to X.
    public static boolean find3Numbers(int arr[], int n, int x) {

        // Your code Here
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum= arr[i]+arr[j]+arr[k];
                if(sum==x)
                {
                    return true;
                }
                else if( sum < x)
                {
                    j++;
                }
                else if(sum > x)
                {
                    k--;
                }
            }
        }
        return false;
    }
}

*/
