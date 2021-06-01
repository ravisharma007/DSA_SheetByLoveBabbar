/*
import java.util.*;

class MergeSortClass
{
    public static void main(String[] args) {
//        int[] arr={2,8,5,3,1,12,4,9,17,13,6};
        int[] arr={5,7,2,2,10,6};
        int[] temp=Arrays.copyOf(arr,arr.length);

        Solution obj=new Solution();
        obj.mergeSort(arr,temp,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}

class Solution
{
    public void mergeSort(int []arr,int [] temp,int low,int high)
    {
        if(low < high)
        {
            int mid = (low+high)/2;
            mergeSort(arr,temp,low,mid);
            mergeSort(arr,temp,mid+1,high);
            merging(arr,temp,low,mid,high);
        }
    }

    public void merging(int[] arr,int [] temp, int l,int mid, int h)
    {
        int i=l;
        int j=mid+1;
        int k=l;

        while(i <= mid && j <=h)
        {
            if(arr[i]<arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }

        while(i<= mid)
        {
            temp[k++]=arr[i++];
        }

        for(int x=l;x<=h;x++)
        {
            arr[x]=temp[x];
        }
    }
}
*/
