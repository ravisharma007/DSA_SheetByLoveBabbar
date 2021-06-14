/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Driver
{
    public static void main(String[] args) {
        String str="(1,5),(8,11),(3,6),(10,20)";

        Solution obj=new Solution();
        obj.convertToIntArray(str);
    }
}

class Solution
{
    public void convertToIntArray(String s)
    {
       // Scanner sc= new Scanner(System.in);


        String[] test= s.split("[\\(\\)]");
        //String[] test1= s.split("[\\)]");
        List<String> yourlist= Arrays.asList(test);

        ArrayList<Integer> intList=new ArrayList<>();

        for(int i=1; i< yourlist.size(); i++)
        {



            System.out.println(yourlist.get(i));
        }

        //System.out.println(yourlist.size());
        //System.out.println(yourlist.get(1));
    }
}
*/
