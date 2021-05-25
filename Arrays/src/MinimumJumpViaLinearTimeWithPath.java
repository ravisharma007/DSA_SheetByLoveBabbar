/*
import java.util.ArrayList;

class Solution{
    static java.util.ArrayList<Integer> list =new java.util.ArrayList<>();
    public static void printPath(java.util.ArrayList<Integer> list)
    {
        System.out.println("Minimum jump path : ");
        list.forEach(x -> System.out.println(x + " -> "));
        System.out.println();
    }


    static int minJumps(int[] arr){
        // your code here
        int maxRange= arr[0];
        int stepCanTakeForParticularJump= arr[0];
        int jump=1;




        if(arr[0]==0)
            return -1;
        if(arr.length <=1)
            return 0;

        list.add(0);

        for(int i=1; i<arr.length; i++)
        {
            if(i == arr.length-1)
            {
                list.add(arr.length-1);
                printPath(list);
                return jump;
            }

            maxRange = Math.max(maxRange,i+arr[i]);
            stepCanTakeForParticularJump --;

            if(stepCanTakeForParticularJump == 0)
            {
                jump++;
                list.add(i);
                if(i >= maxRange)
                {
                    return -1;
                }
                stepCanTakeForParticularJump = maxRange-i;
            }
        }

        return -1;
    }
}
*/
