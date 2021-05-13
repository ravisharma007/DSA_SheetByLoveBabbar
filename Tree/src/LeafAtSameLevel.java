/*
//User function Template for Java


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Solution
{
    public void preOrder(Node root,ArrayList<Integer> list)
    {
        if(root!=null)
        {
            if(root.left == null && root.right == null)
            {
                list.add(root.data);
            }
            preOrder(root.left,list);
            preOrder(root.right,list);

        }
    }

    public ArrayList<ArrayList<Integer>> levelOrder(Node root)
    {
        if(root == null)
            return null;

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        while(!queue.isEmpty())
        {
            ArrayList<Integer> currentList = new ArrayList<>();
            int size= queue.size();

            for(int i=0;i<size;i++)
            {
                Node p=queue.remove();
                currentList.add(p.data);

                if(p.left!=null)
                    queue.add(p.left);

                if(p.right!=null)
                    queue.add(p.right);
            }
            result.add(currentList);
        }
        return result;
    }

    boolean check(Node root)
    {
        // Your code here
        ArrayList<ArrayList<Integer>> levelOrederResult= levelOrder(root);

        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root,list);

        //levelOrederResult.forEach(x -> System.out.print( x.get(x.size()-1)));

        // for(int i=0 ; i< levelOrederResult.get(levelOrederResult.size()-1).size();i++)
        // {
        //     System.out.print(levelOrederResult.get(levelOrederResult.size()-1).get(i) + " ");
        // }

        // System.out.println("\n---------------------------" + levelOrederResult.get(levelOrederResult.size()-1).size());
        // list.forEach(x -> System.out.print(x + " "));

        // System.out.println("\n---------------------------" + list.size() );

        for(int i=0; i<list.size();i++)
        {
            if(list.size() != levelOrederResult.get(levelOrederResult.size()-1).size() ||
                    !list.get(i).equals(levelOrederResult.get(levelOrederResult.size()-1).get(i)))
            {
                return false;
            }
        }
        return true;
    }

}*/
