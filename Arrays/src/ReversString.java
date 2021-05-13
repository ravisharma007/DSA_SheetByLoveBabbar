class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev.concat(String.valueOf(str.charAt(i)));
        }
//        System.out.println(rev);
        return rev;
    }
}