import java.sql.ClientInfoStatus;
import java.util.*;

//My Code is correct but GFG Compiler says TLE its there problem not mine!
//time = O(n1+n2+n3) && space = O(1)
/*class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        int i=0,j=0,k=0;
        ArrayList<Integer> list = new ArrayList<>();

        while(i<A.length && j < B.length && k < C.length)
        {
            if(A[i] == B[j] && A[i] == C[k])
            {
                list.add(A[i]);
                i++;
                j++;
                k++;
            }
            else if(A[i] < B[j] && A[i] < C[k])
            {
                i++;
            }
            else if(B[j] < A[i] && B[j] < C[k])
            {
                j++;
            }
            else if(C[k] < A[i] && C[k] < B[j])
            {
                k++;
            }

            if(i > 0 && i < n1) {
                int xx = A[i - 1];
                while ((i > 0 && i < n1) && A[i] == xx)
                    i++;
            }

            if(j > 0 && j < n2) {
                int yy = B[j - 1];
                while ((j > 0 && j < n2) && B[j] == yy)
                    j++;
            }

           if(k > 0 && k < n3) {
               int zz = C[k - 1];
               while ((k > 0 && k < n3) && C[k] == zz)
                   k++;
           }
        }

        return list;
    }
}*/

//Hashing Method time = O(n1+n2+n3) && space = O(n1+n2+n3)
/*
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here

        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        HashMap<Integer,Integer> hm3=new HashMap<>();

        for(int i=0; i<A.length; i++)
        {
            hm1.put(A[i],A[i]);
        }

        for(int i=0; i<B.length; i++)
        {
            hm2.put(B[i],B[i]);
        }

        for(int i=0;i<C.length; i++)
        {
            hm3.put(C[i],C[i]);
        }

        for(int i=0; i<n1; i++)
        {
            if(hm1.containsKey(A[i]) && hm2.containsKey(A[i]) && hm3.containsKey(A[i]))
            {
                list.add(A[i]);
                hm1.remove(A[i]);
            }
        }

        return list;

    }
}
*/

