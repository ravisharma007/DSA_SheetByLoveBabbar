/*
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Solution
{
    int start=0;
    public Node treeCheck(String str)
    {
        if(str.length() == 0 || str == null)
            return null;

        return createTree(str);
    }

    public Node createTree(String s)
    {
        if(start >= s.length())
            return null;


        boolean neg=false;
        if(s.charAt(start) == '-')
        {
            neg=true;
            start++;
        }

        int num=0;
        while (start < s.length() && Character.isDigit(s.charAt(start)))
        {
            int digit = Character.getNumericValue(s.charAt(start));
            num= num * 10 + digit;
            start++;
        }

        if(neg == true)
            num = -num;

        Node root=new Node(num);


        if(start >= s.length())
            return root;

        if(start < s.length() && s.charAt(start) == '(')
        {
            start++;
            root.left = createTree(s);
        }

        if(start < s.length() && s.charAt(start) == ')')
        {
            start++;
            return root;
        }

        if(start <s.length() && s.charAt(start) == '(')
        {
            start++;
            root.right= createTree(s);
        }

        if(start <s.length() && s.charAt(start) == ')')
        {
            start++;
            return root;
        }
        return root;
    }

    public void preOrder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}

class ConstructTreeFromString
{
    public static void main(String[] args) {
        //String Input:
        String input="4(2(3)(1))(6(5))";

        Solution obj = new Solution();
        Node root =obj.treeCheck(input);

        obj.preOrder(root);

    }
}*/
