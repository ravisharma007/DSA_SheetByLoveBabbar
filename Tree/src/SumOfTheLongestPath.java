/*
import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
};

// your task is to complete this function
class GfG
{
    int sum=0;
    public ArrayList<Integer> level(Node root)
    {
        ArrayList<Integer> list =new ArrayList<>();
        if(root == null) {
            list.add(0);
            list.add(0);
            return list;
        }
        else
        {
//            int x,y;
            ArrayList<Integer> x,y;

            x= level(root.left);
            y= level(root.right);

            if(x.get(0) > y.get(0))
            {
                list.add(x.get(0)+1);
                list.add(x.get(1) + root.data);
                return list;
            }
            else if(y.get(0)>x.get(0))
            {
                list.add(y.get(0)+1);
                list.add(y.get(1) + root.data);
                return list;
            }
            else //if(x.get(0) == y.get(0))
            {
                if(x.get(1) > y.get(1))
                {
                    list.add(x.get(0)+1);
                    list.add(x.get(1) + root.data);
                    return list;
                }
                else
                {
                    list.add(y.get(0)+1);
                    list.add(y.get(1) + root.data);
                    return list;
                }
            }
        }
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        // Code here
        ArrayList<Integer> list = level(root);
        return list.get(1);
    }
}*/
