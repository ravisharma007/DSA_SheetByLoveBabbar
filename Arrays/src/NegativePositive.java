
class NegativePositive
{
    public static void main(String[] args) {
        //int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };
        int[] arr = { 12, 13, 5, 6, -7, -5, -3, -11 };

        int p=0,q=arr.length-1;
        while(p < q )
        {
            if(arr[p] < 0)
            {
                p++;
            }

            if(arr[q] >0)
            {
                    q--;
            }

            if(arr[p] > 0 && arr[q] < 0 && p <q)
            {
                int t= arr[p];
                arr[p]=arr[q];
                arr[q]=t;

                p++;
                q--;
            }

        }

        for(int a:  arr)
        {
            System.out.print(a + " ");
        }

    }
}
