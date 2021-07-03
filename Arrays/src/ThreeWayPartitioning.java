/*
import java.util.*;

class Solution{
    //Function to partition the array around the range such
    //that array is divided into three parts.

    public void swap(int arr[],int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public void threeWayPartition(int arr[], int a, int b)
    {
        // code here

        int low=0,mid=0,high=arr.length-1;

        while(mid<=high)
        {
            if(arr[mid]<a)
            {
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid] > b)
            {
                swap(arr,mid,high);
                high--;
            }
            else
                mid--;
        }
    }
}

*/
