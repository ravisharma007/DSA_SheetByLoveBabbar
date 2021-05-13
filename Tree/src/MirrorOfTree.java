/*
import java.util.*;
import static java.lang.System.*;

class MirrorOfTree
{
    static class Queue
    {
        int size;
        int front;
        int rear;
        BinaryTreeNode []Q;

        public  Queue()
        {
            this.size=12;
            this.front=this.rear=0;
            this.Q=new BinaryTreeNode[this.size];
        }

        public  Queue(int size)
        {
            this.size=size;
            this.front=this.rear=0;
            this.Q=new BinaryTreeNode[this.size];
        }

        public void enqueue(BinaryTreeNode NodeRef)
        {
            if((this.rear+1)%this.size == this.front)
            {
                out.println("Queue is Full");
            }
            else
            {
                this.rear=(this.rear+1)%this.size;
                this.Q[this.rear]=NodeRef;
            }
        }

        public BinaryTreeNode dequeue()
        {
            BinaryTreeNode x=null;
            if(this.front == this.rear)
            {
                out.println("Queue is Empty");
            }
            else
            {
                this.front=(this.front+1)%this.size;
                x=this.Q[this.front];
            }
            return x;
        }

        public boolean isQueueEmpty()
        {
            if(this.front == this.rear)
            {
                out.println("Queue is Empty");
                return true;
            }
            else
                return false;
        }
    }

    static class BinaryTreeNode
    {
        BinaryTreeNode left;
        int data;
        BinaryTreeNode right;

        public BinaryTreeNode(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    static class BinaryTree
    {
        public int data;
        Queue queue;
        BinaryTreeNode root;
        public BinaryTree()
        {
            //empty constructor
        }

        public BinaryTree(int data)
        {
            this.data=data;
            root=new BinaryTreeNode(this.data);
            queue = new Queue(12);
            queue.enqueue(root);
        }

        public BinaryTreeNode creatingTree(int x)
        {
            BinaryTreeNode p;
            Scanner sc=new Scanner(System.in);
            int inputLeft;
            int inputRight;
            BinaryTree obj=new BinaryTree(x);
            while(!obj.queue.isQueueEmpty())
            {
                p=obj.queue.dequeue();
                out.println("Enter the input for left child (-1 if no left child) of - " + p.data);
                inputLeft=sc.nextInt();
                if(inputLeft != -1)
                {
                    BinaryTreeNode temp = new BinaryTreeNode(inputLeft);
                    p.left=temp;
                    obj.queue.enqueue(temp);
                }

                out.println("Enter the input for Right child (-1 if no Right child) of - " + p.data);
                inputRight=sc.nextInt();
                if(inputRight != -1)
                {
                    BinaryTreeNode temp = new BinaryTreeNode(inputRight);
                    p.right=temp;
                    obj.queue.enqueue(temp);
                }
            }
            return obj.root;
        }

        //Inorder Traversal:
        public void inOrderTraversal(BinaryTreeNode p)
        {
            if(p != null)
            {
                inOrderTraversal(p.left);
                out.print(p.data + " ");
                inOrderTraversal(p.right);
            }
        }

        }

    static class CreateMirror
    {
        public BinaryTreeNode MirrorMethod(BinaryTreeNode root,BinaryTreeNode rootMirror)
        {
            if(root == null)
                return null;
            else
            {
                if(root.left != null)
                  MirrorMethod(root.left,rootMirror.right = new BinaryTreeNode(root.left.data));
                if(root.right != null)
                 MirrorMethod(root.right,rootMirror.left = new BinaryTreeNode(root.right.data));

                return rootMirror;
            }

        }
    }


    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        out.println("Enter the root node :-");
        int data=sc.nextInt();

        BinaryTree bt=new BinaryTree();
        BinaryTreeNode root = bt.creatingTree(data);

        CreateMirror cm=new CreateMirror();
        BinaryTreeNode mirrorRoot = new BinaryTreeNode(root.data);
        mirrorRoot =  cm.MirrorMethod(root,mirrorRoot);
        bt.inOrderTraversal(mirrorRoot);

    }

}*/
