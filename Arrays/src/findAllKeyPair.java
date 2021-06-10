/*
import java.util.*;

class Driver
{
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        Solution obj=new Solution();
        int total= obj.getPairsCount(arr,arr.length,2);
        System.out.println("total : " + total);

    }
}
//My code failed on some test cases:
*/
/*
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here

        Map<Integer,List<Integer>> map=new HashMap<>();
        List<Integer> list;

        int count=0;

        for(int i=0; i<n; i++)
        {
            int temp=k-arr[i];
            if(map.containsKey(temp))
            {
                for(int j=0;j<map.get(temp).size();j++)
                {
                    count++;
                }

                if(temp == arr[i]) {
                    list = map.get(temp);
                    list.add(arr[temp]);
                }
                else
                {
                    list =new ArrayList<>();
                    map.put(arr[i],list);
                    list.add(arr[i]);
                }
            }
            else
            {
                if(!map.containsKey(arr[i])) {
                    list = new ArrayList<>();
                    map.put(arr[i], list);
                    list.add(arr[i]);
                }
                else
                {
                    list = map.get(arr[i]);
                    list.add(arr[i]);
                }
            }
        }
        return count;
    }
}*//*


//Code by others YT:

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;

        for(int i=0; i< arr.length; i++)
        {
            //element should be less than the sum of pairs or k
            if(arr[i] < k)
            {
                int element=k-arr[i];
                if(map.containsKey(element))
                {
                    //increase count with the frequency of map's key
                    count= count + map.get(element);
                }
                if(!map.containsKey(arr[i]))
                {
                    map.put(arr[i],0);
                }
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return count;
    }
}
*/
