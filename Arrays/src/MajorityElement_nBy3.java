class Driver
{
    public static void main(String[] args) {
        int [] arr={1,2,2,1,1,3,2};
        Solution obj=new Solution();
        int x[]= obj.majorityElement(arr,arr.length);
        System.out.println("Majority element: [" + x[0] + "," + x[1] +"]");
    }
}

class Solution {
    public int[] majorityElement(int[] arr, int n) {
        //Majority element or find the element count more than n/3
        //here Moore's Voting algorithm will be used to do this task.

        int maj1=Integer.MAX_VALUE;
        int maj2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;

        int []t=new int[2];

        for(int i=0; i<n;i++)
        {

            if(arr[i]==maj1)
            {
                count1++;
            }
            else if(arr[i]==maj2)
            {
                count2++;
            }
            else if(count1==0)
            {
                maj1=arr[i];
                count1++;
            }
            else if(count2 == 0)
            {
                maj2=arr[i];
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        //step 2:
        count1=0;
        count2=0;

        for(int i=0; i<n; i++)
        {
            if(maj1 == arr[i])
                count1++;

            if(maj2 == arr[i])
                count2++;
        }

        if(count1 > n/4)
        {
            t[0]=maj1;
        }
        else
            t[0]=-1;

        if(count2 > n/4)
        {
            t[1]=maj2;
        }
        else
            t[1]=-1;

        return t;
    }
}