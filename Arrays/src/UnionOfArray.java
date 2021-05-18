/*

class Solution{

    static int maxMeth(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] > max)
                max=arr[i];
        }
        return max;
    }

    static void createHash(int[] arr,int[] hastTable)
    {

        for(int i=0;i<arr.length;i++)
        {
            hastTable[arr[i]]=hastTable[arr[i]]+1;
        }

    }

    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        int aMax=maxMeth(a);
        int bMax=maxMeth(b);
        int finalMax = Math.max(aMax,bMax);
        int[] hasTable1=new int[finalMax+1];


        createHash(a,hasTable1);
        createHash(b,hasTable1);

        int count=0;
        for(int i=0;i<hasTable1.length;i++)
        {
            if(hasTable1[i]>0)
                count++;
        }

        return count;
    }
}

*/
