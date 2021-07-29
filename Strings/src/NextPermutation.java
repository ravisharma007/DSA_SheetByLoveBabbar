/*
import java.util.*;

class Driver
{
    public static void main(String[] args) {
        int arr[] = new int[]{ 91, 30 ,71 ,51 ,7 ,2};
        List<Integer> list= Solution.nextPermutation(arr.length,arr);
        for(Integer n : list)
            System.out.print(n + ", ");
    }
}

class Solution{
    static List<Integer> nextPermutation(int n, int arr[]){
        // code here
        int idx=-1;

        for(int i=n-1;i>0;i--)
        {
            if(arr[i] > arr[i-1])
            {
                idx=i;
                break;
            }
        }

        if(idx == -1)
        {
            reverse(arr,0,n-1);
            List<Integer> list = new ArrayList<>();
            for(int x : arr)
            {
                list.add(x);
            }
            return list;
        }
        else
        {
            int prev=idx;
            for(int i=prev+1;i<n;i++)
            {
                if(arr[i] >= arr[idx-1] && arr[i] < arr[prev])
                {
                    prev=i;
                }
            }

            //swap
            int temp=arr[idx-1];
            arr[idx-1]=arr[prev];
            arr[prev]=temp;

            reverse(arr,idx,n-1);
            List<Integer> list = new ArrayList<>();
           for(int x : arr)
           {
               list.add(x);
           }
           return list;
        }
    }

    static void reverse(int arr[],int l,int h)
    {
        for(int i=l,j=h;i<j;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
*/
