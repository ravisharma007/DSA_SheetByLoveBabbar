/*
import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if(!currVal.equals("N"))
            {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= s.length)
                break;
            currVal = s[i];

            // If the right child is not null
            if(!currVal.equals("N"))
            {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);

            Solution T = new Solution();

            ArrayList <Integer> res = T.printBoundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }


// My Code - Not Working for every test case
//class Solution
//{
//    public void leftMostTraversal(Node root,ArrayList<Integer> list)
//    {
//        if(root == null)
//            return;
//        else {
//            list.add(root.data);
//            leftMostTraversal(root.left,list);
//        }
//
//    }
//
//    public void bottomTraversal(Node root,ArrayList<Integer> list)
//    {
//        if(root == null)
//            return;
//        else {
//            if(root.left != null)
//                bottomTraversal(root.left,list);
//            if(root.right != null)
//                bottomTraversal(root.right,list);
//
//            if(root.left == null && root.right == null)
//            {
//                list.add(root.data);
//            }
//        }
//    }
//
//    public void rightMostTraversal(Node root,ArrayList<Integer> list)
//    {
//        if(root == null)
//            return;
//        else {
//
//        }
//        if(root.right != null) {
//            leftMostTraversal(root.right, list);
//            if(root.right != null)
//                list.add(root.right.data);
//        }
//        }
//
//    ArrayList <Integer> printBoundary(Node node)
//    {
//        ArrayList<Integer> result = new ArrayList<>();
//        ArrayList<Integer> resultFotBottom = new ArrayList<>();
//        ArrayList<Integer> resultFotRight = new ArrayList<>();
//        leftMostTraversal(node,result);
//         bottomTraversal(node,resultFotBottom);
//         rightMostTraversal(node,resultFotRight);
//
//         ArrayList<Integer> temp = resultFotBottom;
//         temp.remove(0);
//         temp.remove(temp.size()-1);
//         result.addAll(temp);
//         result.addAll(resultFotRight);
//
//         return result;
//    }
//}



class Solution
{
    ArrayList<Integer> result = new ArrayList<>();
    public void leftBoundary(Node root)
    {
        if(root != null)
        {
            if(root.left != null)
            {
                result.add(root.data);
                leftBoundary(root.left);
            }
            else if(root.right !=null)
            {
                result.add(root.data);
                leftBoundary(root.right);
            }
        }
    }

    public void leafBoundary(Node root)
    {
        if(root != null)
        {
            leafBoundary(root.left);
            if(root.left == null && root.right == null)
                result.add(root.data);

            leafBoundary(root.right);
        }
    }

    public void rightBoundary(Node root)
    {
        if(root != null)
        {
            if(root.right != null)
            {
                rightBoundary(root.right);
                result.add(root.data);
            }
            else if(root.left != null)
            {
                rightBoundary(root.left);
                result.add(root.data);
            }
        }
    }

    ArrayList <Integer> printBoundary(Node node)
    {
        if(node != null)
        {
            result.add(node.data);

            leftBoundary(node.left);

            leafBoundary(node.left);
            leafBoundary(node.right);

            rightBoundary(node.right);
        }
        return result;
    }
}

*/
