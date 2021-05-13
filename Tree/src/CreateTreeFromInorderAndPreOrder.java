/*
import java.util.*;
import java.io.*;
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
                inorder[i] = sc.nextInt();

            for(int i = 0; i < n; i++)
                preorder[i] = sc.nextInt();

            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }

    public static void postOrdrer(Node root)
    {
        if(root == null)
            return;

        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}// } Driver Code Ends


class Solution
{
    int index=0;
    Map<Integer,Integer> map;
    public Node preOrderCreation(int inorder[],int preorder[],int lb, int ub)
    {
        if(lb > ub)
            return null;

        Node root=new Node(preorder[index++]);
        if(lb == ub)
            return root;

        int mid = map.get(root.data);

        root.left = preOrderCreation(inorder,preorder,lb,mid-1);
        root.right = preOrderCreation(inorder,preorder,mid+1,ub);
        return root;
    }
    public Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here
        index=0;
        map.clear();
        for(int i=0;i<n;i++)
        {
            map.put(inorder[i],i);
        }
        Node root = preOrderCreation(inorder,preorder,0,n-1);
        return root;
    }
}*/
