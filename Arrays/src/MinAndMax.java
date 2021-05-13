
class Pair
{
    int min;
    int max;
}

class MinAndMaxInArray
{
    public static void main(String[] args) {
        int[] arr={2,354,34,123,4,23,56,12,45,23,657,45,3,1,3344};
        Pair obj=new Pair();
         obj=findMeth(arr);

        System.out.println("Min - " + obj.min + ", Max - " + obj.max);
    }

    public static Pair findMeth(int[] arr)
    {
        int Min=Integer.MAX_VALUE;
        int Max=Integer.MIN_VALUE;

        Pair obj=new Pair();

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] < Min)
                Min = arr[i];

            if( arr[i] > Max)
                Max = arr[i];

        }

        obj.min=Min;
        obj.max=Max;
        return obj;
    }
}