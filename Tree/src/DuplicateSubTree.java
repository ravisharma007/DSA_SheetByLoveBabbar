/*
import java.util.*;
import java.util.stream.Collectors;

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

class Solution {
    ArrayList<String> duaList=new ArrayList<>();

    public int level(Node root)
    {
        if(root!=null)
        {
            int x,y;
            x = level(root.left);
            y = level(root.right);

            if(x >y)
                return x+1;
            else
                return y+1;
        }
        else
            return 0;
    }

    public void preOrderTraversal(Node root, ArrayList<Integer> list)
    {
        if(root!=null)
        {
            list.add(root.data);
            preOrderTraversal(root.left,list);
            preOrderTraversal(root.right,list);
        }
    }

    public void postOrder(Node root)
    {
        if(root !=null)
        {
            int x;
            postOrder(root.left);
            postOrder(root.right);
            x=level(root);
            if(x >=2)
            {
                ArrayList<Integer> list1 =new ArrayList<>();
                ArrayList<Integer> list2 =new ArrayList<>();
                preOrderTraversal(root, list1);
                inOrderTraversal(root, list2);
                String list1Str = list1.stream().map(item -> String.valueOf(item)).collect(java.util.stream.Collectors.joining(" "));
                String list2Str = list2.stream().map(item -> String.valueOf(item)).collect(java.util.stream.Collectors.joining(" "));
                duaList.add(list1Str + "|" + list2Str);
            }
        }
    }

    private void inOrderTraversal(Node root, ArrayList<Integer> list) {
        if(root!=null)
        {
            inOrderTraversal(root.left,list);
            list.add(root.data);
            inOrderTraversal(root.right,list);
        }
    }

    int dupSub(Node root) {
        // code here
        postOrder(root);

        */
/*for(int i=0;i<duaList.size();i++)
        {
            System.out.println(duaList.get(i) + ", ");
        }*//*


        int isEqual = 0;
        for(int i = 0; i < duaList.size(); i++){
            for(int j = i + 1; j < duaList.size(); j++){
                if(duaList.get(i).equals(duaList.get(j))){
                    isEqual = 1;
                }
            }
        }
        return isEqual;
    }


}*/
