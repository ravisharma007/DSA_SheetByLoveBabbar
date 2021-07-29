/*
import java.util.*;

class Driver
{
    public static void main(String[] args) {
        int [] arr=new int[]{6, 7, 11, 4, 10, 8};
        Solution obj=new Solution();
        obj.fun(arr);

        for(int x :arr)
            System.out.print(x + ", ");
    }
}

class Solution
{
    //Time Complexity O(n^2)
   */
/* public void fun(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            int max=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                max=Math.max(max,arr[j]);
            }
            arr[i]=max;
        }*//*


    // Time Complexity O(n)
    public void fun(int[] arr)
    {
        for(int i=arr.length-2;i>=0;i--)
        {
            arr[i]=Math.max(arr[i],arr[i+1]);
        }
    }
}*/
