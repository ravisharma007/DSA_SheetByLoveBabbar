/*
import java.util.*;

class QuickSortClass
{
    public static void main(String[] args) {
        int [] arr=new int[]{2,8,5,3,1,12,4,9,17,Integer.MAX_VALUE};

        Solution obj=new Solution();
        obj.quickSort(arr,0,arr.length-1);

        for(int x : arr)
        {
            System.out.print(x+ " ");
        }

    }
}

class Solution
{
    public int partitionMethod(int [] arr, int low, int high)
    {

        //Finding Random Pivot everytime:-
        Random rand = new Random();
        int num = low + rand.nextInt(high - low);

        swap(arr,low,num);
        int pivot=arr[low];


        int i=low;int j=high;


        while (i < j)
        {
            do{
                i++;
            }while (pivot >= arr[i] );
            do{
                j--;
            }while (pivot < arr[j]);

            if(i<j)
            swap(arr,i,j);

        }

        if(i > j)
        {
            swap(arr,low,j);
        }

        return j;
    }

    public void quickSort(int [] arr, int l, int h)
    {
        int j;
        if(l<h)
        {

            j = partitionMethod(arr,l,h);
            quickSort(arr,l,j);
            quickSort(arr,j+1,h);

        }
    }

    public void swap(int [] arr, int i1, int i2)
    {
        int temp= arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}*/
