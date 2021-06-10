/*
import java.util.Arrays;

class MergeSortClass
{
    public static void main(String[] args) {
//        int[] arr={2,8,5,3,1,12,4,9,17,13,6};
//        long[] arr={5,7,2,2,10,6};
        long[] arr={2, 4, 1, 3, 5};
//        long[] arr={10,10,10,10};
//        long[] temp=Arrays.copyOf(arr,arr.length);
        long [] temp = Arrays.copyOf(arr,arr.length);
       long x =Solution.mergeSort(arr,temp,0, arr.length-1);

        System.out.println(Arrays.toString(arr));
        System.out.println("\n" + x);
    }
}

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long [] temp = Arrays.copyOf(arr,arr.length);
       long count= mergeSort(arr,temp,0,arr.length-1);
        return count;
    }

    public static long mergeSort(long []arr,long[] temp,int low,int high)
    {
        if(low == high)
            return 0;
        long count=0;

        if(low < high)
        {
            int mid = (low+high)/2;
            count = count + mergeSort(arr,temp,low,mid);
            count = count + mergeSort(arr,temp,mid+1,high);
            count = count + merging(arr,temp,low,mid,high);
        }

        return count;
    }

    public static long merging(long [] arr,long[] temp,int l,int mid,int h)
    {
        int count =0;
        int i=l,j=mid+1,k=l;

        while(i <= mid && j<=h)
        {
            if(arr[i] <= arr[j])
                temp[k++]=arr[i++];

            else {
                temp[k++] = arr[j++];
                count= count + (mid - i + 1) ;
            }
        }

        for(; i<= mid; i++)
            temp[k++]=arr[i];

        for(; j<= h; j++)
            temp[k++]=arr[j];

        for(int x=l; x<=h; x++)
        {
            arr[x]=temp[x];
        }

        return count;
    }
}*/
