/*
//
// import java.util.concurrent.atomic.AtomicInteger;


//My Code Failed on some Test Cases -
*/
/*
class Solution{
    java.util.Map<Integer,Integer> map_dp=new java.util.HashMap<>();
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){

        // Your code here
        map_dp.put(arr[arr.length-1],arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--)
        {
            int max = map_dp.get(arr[i+1]);
            int sum = arr[i]+max;
            map_dp.put(arr[i],Math.max(arr[i],sum));
        }

        map_dp.forEach((x,y) -> System.out.println(x +": "+ y));

        java.util.concurrent.atomic.AtomicInteger finalMax= new java.util.concurrent.atomic.AtomicInteger(Integer.MIN_VALUE);

        map_dp.forEach((x,y) -> {if(finalMax.get() <y) finalMax.set(y);});
        return finalMax.get();
    }

}*//*


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){

        // Your code here
        int overallMax=Integer.MIN_VALUE;
        int currentMax=Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            if(currentMax >= 0)
            {
                currentMax = currentMax+arr[i];
            }
            else
            {
                currentMax =arr[i];
            }

            if(currentMax > overallMax)
            {
                overallMax=currentMax;
            }
        }
        return overallMax;
    }

}
*/
