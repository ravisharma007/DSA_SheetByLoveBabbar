/*

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int zero,one,two;
        zero=one=two=0;

        for(int i=0; i<n;i++)
        {
            if(a[i] == 0)
                zero++;
            if(a[i]== 1)
                one++;
            if(a[i] == 2)
                two++;
        }

        int i=0;
        while (zero > 0)
        {
            a[i]=0;
            zero--;
            i++;
        }

        while (one > 0)
        {
            a[i] =1;
            one--;
            i++;
        }

        while (two > 0)
        {
            a[i]=2;
            two--;
            i++;
        }


    }
}*/
