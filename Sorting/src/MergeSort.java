import java.util.*;

class MergeSortClass
{
    public static void main(String[] args) {
//        int [] arr = {2,8,5,3,1,12,4,9,17,13,6};
//        int [] arr = {2,8,5,3,1,12,4};
        int [] arr = {5,7,2,2,10,6};

        Solution obj=new Solution();
        obj.iterativeMergeSort(arr,arr.length);

        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println("\n__________");

    }
}
class Solution
{
    public void iterativeMergeSort(int []arr,int n)
    {
       int low=0;
       int high=n-1;

       //Temp array from given array:
        int []temp=Arrays.copyOf(arr,arr.length);

       for(int m=1; m<high-low; m=m*2)
       {
           for(int i=low; i<high; i= i+(m*2))
           {
                int l=i;
                int mid=i+m-1;
                int h=Math.min(i+(m*2)-1,high);
                merging(arr,temp,l,mid,h);
           }
       }
    }

    public void merging(int [] arr,int[] temp,int l,int mid,int h)
    {
        int i=l,j=mid+1,k=l;

        while(i <= mid && j<=h)
        {
            if(arr[i] < arr[j])
                temp[k++]=arr[i++];

            else
                temp[k++] = arr[j++];
        }

       for(; i<= mid; i++)
            temp[k++]=arr[i];

        for(; j<= h; j++)
            temp[k++]=arr[j];

        for(int x=l; x<=h; x++)
        {
            arr[x]=temp[x];
        }
    }


}
