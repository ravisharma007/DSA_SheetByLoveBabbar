/*

//My Code with TLE error:-
*/
/*
class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int current=0;
        int last = 0;

        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i] > arr2[0])
            {
                current=arr1[i];
                last=arr1[n-1];

                for(int w=arr1.length-2; w>=i; w--)
                {
                    arr1[w+1]=arr1[w];
                }

                arr1[i]=arr2[0];

                int k=0;
                while( k< arr2.length &&last > arr2[k] )
                {
                    k++;
                }

                for(int w =1 ; w<k; w++)
                {
                    arr2[w-1]=arr2[w];
                }
                arr2[k-1]=last;

            }
        }

    }
}*//*



import java.util.Arrays;

class Solution {


    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here

        int i=0,j=0,k=n-1;

        while(i <= k && j<m)
        {
            if(arr1[i] < arr2[j])
                i++;
            else
            {
                int temp=arr2[j];
                arr2[j]=arr1[k];
                arr1[k]=temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }
}*/
