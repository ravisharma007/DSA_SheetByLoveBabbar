/*
import java.util.*;

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {
        // add your code here
        Stack<Character> stack =new Stack<>();
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(')
            {
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{' )
                stack.pop();
            else if(!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[' )
                stack.pop();
            else if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(' )
                stack.pop();
            else
                return false;
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}*/
