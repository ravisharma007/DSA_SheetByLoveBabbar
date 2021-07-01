import java.util.*;

/*class Driver
{
    public static void main(String[] args) {
        int arr[]={3,1,2,2,1,2,3,3};
//        int arr[]={1,1,1,1};
        Solution obj=new Solution();
        int c=obj.countOccurence(arr,arr.length,4);
        System.out.println(c);


    }
}*/

//Using BruteForce Time: O(n) and Space: O(1)
/*class Solution
{
    public int countOccurence(int[] arr, int n, int k)
    {
        //Your code here
        int x=n/k;
        int overallCount=0;
        for(int i=0;i<n-1;i++)
        {
            int count=1;
            if(arr[i] == -1)
                continue;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    arr[j]=-1;
                }
            }
            if(count>x)
                overallCount++;
        }
        return overallCount;
    }
}*/

// Using HashMap Time: O(n) and  space: O(n)
/*class Solution
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k)
    {
        // your code here,return the answer
        int x=n/k;
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }
        }

        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]) && hm.get(arr[i]) > x)
            {
                count++;
                hm.remove(arr[i]);
            }
        }
        return count;
    }
}*/

//Using tetris game type algo

/*
class elementCount
{
    int element;
    int count;
}

class Solution
{
    public int countOccurence(int[] arr, int n, int k)
    {
        int x=n/k;
        int overallCount=0;

        //step 1:
        elementCount [] arrOfElementCount= new elementCount[k-1];
        for(int i=0; i<arrOfElementCount.length; i++)
        {
            arrOfElementCount[i]=new elementCount();
            arrOfElementCount[i].count=0;
        }

        //step 2:
        for(int i=0; i<n; i++)
        {
            int j;

            //If arr[i] is already present in
           //the element count array,
           //then increment its count

            for(j=0; j< arrOfElementCount.length; j++)
            {
               if(arr[i] == arrOfElementCount[j].element)
               {
                   arrOfElementCount[j].count += 1;
                   break;
               }
            }

            // If arr[i] is not present in arrOfElementCount[]
            if(j == arrOfElementCount.length)
            {
                int l;

//                 If there is position available
//              in arrOfElementCount[], then place arr[i] in
//              the first available position and
//              set count as 1

                for(l=0; l<arrOfElementCount.length; l++)
                {
                    if(arrOfElementCount[l].count == 0)
                    {
                        arrOfElementCount[l].element=arr[i];
                        arrOfElementCount[l].count=1;
                        break;
                    }
                }

                //If all the position in the
                //temp[] are filled, then decrease
                //count of every element by 1
                if(l==arrOfElementCount.length)
                {
                    for(l=0; l< arrOfElementCount.length; l++)
                    {
                        arrOfElementCount[l].count -= 1;
                    }
                }
            }
        }

        //Step 3: Check actual counts of
        //potential candidates in arrOfElementCount[]

        for(int i=0; i< arrOfElementCount.length; i++)
        {
            int actualCount=0;
            for(int j=0; j<n; j++)
            {
                if(arrOfElementCount[i].element == arr[j])
                {
                    actualCount++;
                }
                if(actualCount > x)
                {
                    overallCount++;
                    break;
                }
            }
        }
        return overallCount;
    }


}*/
