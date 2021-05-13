/*
import java.util.*;

// My Code: Not Working for every case
*/
/*
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

class BinaryTree
{
    Queue<Node> queue;

    public Node createTree(ArrayList<Integer> list)
    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter The Root Node :-");
        Node root =new Node(list.get(0));
        queue =new LinkedList<>();
        queue.add(root);
        int x;
        while(!queue.isEmpty()) {
            for (int i = 1; i < list.size();)
            {


            Node p = queue.remove();

//            System.out.println("Enter the left child of Node (-1 for no Node)" + p.data);
            x = list.get(i++);
            if (x >= 0) {
                p.left = new Node(x);
                queue.add(p.left);
            }

//            System.out.println("Enter the right child of Node (-1 for no Node)" + p.data);
            x = list.get(i++);
            if (x >= 0) {
                p.right = new Node(x);
                queue.add(p.right);
            }
        }
        }
        return root;
    }

    public void preOrder(Node root)
    {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}

class DiagnolTraversal
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
//        Integer [] arr={8,5,7,2,3,9,12,-1,-1,-1,-1,-1,-1,-1,-1};
        Integer [] arr={8,3,10,1,-1,6,14,-1,-1,4,7,13,-1,-1,-1,-1,-1,-1,-1};
        Collections.addAll(list, arr);


        BinaryTree bt=new BinaryTree();
       Node root= bt.createTree(list);
        bt.preOrder(root);

        Solution obj=new Solution();
        List<List<Integer>> listOfDiagnols =new ArrayList<>();
        listOfDiagnols = obj.traversalDiagnol(root);
        System.out.println("\n=====================================");

        for(int i=0 ; i < listOfDiagnols.size(); i++)
        {
            for(int j=0;j<listOfDiagnols.get(i).size(); j++)
            {
                System.out.print(listOfDiagnols.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class Solution
{
    class Pair
    {
        Node node;
        Integer height;
        Pair(Node node, int height)
        {
            this.node=node;
            this.height=height;
        }
    }

    public List<List<Integer>> traversalDiagnol(Node root)
    {
        int d=0;
        Queue<Pair> queue =new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        queue.add(new Pair(root,0));

        while(!queue.isEmpty())
        {
//            List<Integer> currentList=new ArrayList<>();
            Pair p=queue.remove();
            Integer h=p.height;
            Node node=p.node;

            if(result.size() < h+1)
            {
                List<Integer> currentList=new ArrayList<>();
                result.add(h,currentList);
            }
            result.get(h).add(node.data);

            if(node.left != null)
                queue.add(new Pair(node.left,h+1));

            if(node.right != null)
                queue.add(new Pair(node.right,h));

        }
        return result;
    }
}*//*


// GFG Hint Code:-

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
class GfG {

    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data+" ");

        printInorder(root.right);
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t-- > 0){
            String s = br.readLine();
            Node root = buildTree(s);
            Tree g = new Tree();
            ArrayList<Integer> diagonalNode = g.diagonal(root);
            for(int i = 0 ;i<diagonalNode.size();i++){
                System.out.print(diagonalNode.get(i)+ " ");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

*/
/* Node is defined as
class TreeNode
{
    int data; //node data
    TreeNode left, right; //left and right child's reference

    // Tree node constructor
    public TreeNode(int data)
    {
        this.data = data;
         left = right = null;
    }
}*//*

class Tree
{
    public ArrayList<Integer> diagonal(Node root)
    {
        //add your code here.
        Queue<Node> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node p=queue.remove();
            while(p != null)
            {
                list.add(p.data);
                if(p.left != null)
                    queue.add(p.left);

                p=p.right;
            }
        }
        return list;
    }
}

*/
