import java.util.Arrays;

class Solution{
    static int minJumps(int[] arr){
        // your code here
        int[] dp = new int[arr.length];
        int[] path=new int[arr.length];
        path[0]=-1;
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1; i<arr.length; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(dp[j] != Integer.MAX_VALUE && arr[j]+j >= i)
                {
                    if(dp[j]+1 < dp[i])
                    {
                        dp[i]=dp[j]+1;
                        //path[i]=j;
                    }
                }
            }
        }

        if(dp[arr.length-1] != Integer.MAX_VALUE)
        {

            for(int x: path)
            {
                System.out.print(x + " ");
            }
//            int i =dp[arr.length-1];
//            while(i >=0)
//            {
//                System.out.println(path[i]);
//                i=path[i];
//            }
            System.out.println();
            return dp[arr.length-1];
        }
        else
            return -1;
    }
}