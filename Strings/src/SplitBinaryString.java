/*
class Driver
{
    public static void main(String[] args) {
        String str="0100110101";
        Solution obj=new Solution();
        int res= obj.countBinary(str);
        System.out.println(res);
    }
}

class Solution
{
    public int countBinary(String str)
    {
        int count0=0,count1=0;
        int overAllCount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '0')
            {
                count0++;
            }
            else
                count1++;

            if(count0 == count1)
                overAllCount++;
        }

        return overAllCount;
    }
}*/
