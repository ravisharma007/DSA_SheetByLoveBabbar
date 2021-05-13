/*
import java.util.*;
import static java.lang.System.*;
 class Queue
{
    int size;
    int front;
    int rear;
    Node []Q;

    public  Queue()
    {
        this.size=12;
        this.front=this.rear=0;
        this.Q=new Node[this.size];
    }

    public  Queue(int size)
    {
        this.size=size;
        this.front=this.rear=0;
        this.Q=new Node[this.size];
    }

    public void enqueue(Node NodeRef)
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

    public Node dequeue()
    {
        Node x=null;
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

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class BinaryTree
{
   public void preOrder(Node p)
   {
       if(p != null)
       {
           System.out.print(p.data + " ");
           preOrder(p.left);
           preOrder(p.right);
       }
   }

   public void levelOrderLVL(Node root)
   {
       Queue queue=new Queue(root.data);
       queue.enqueue(root);
       queue.enqueue(null);

       while(!(queue.Q[queue.front] == null && queue.Q[queue.front+1] == null))
       {
            Node p = queue.dequeue();

           if(p == null)
           {
               out.println();
               queue.enqueue(null);
           }
          else {
               out.print(p.data + " ");
               if (p.left != null)
                   queue.enqueue(p.left);
               if (p.right != null)
                   queue.enqueue(p.right);
           }


       }

   }


   public List<List<Integer>> levelOrderLevelByLevelByYoutube(Node root)
   {
       List<List<Integer>> result = new ArrayList<>();
       java.util.Queue<Node> queue=new LinkedList<>();

       queue.add(root);

       if(root == null)
       {
           return result;
       }

       while(!queue.isEmpty())
       {
           int size=queue.size();
           List<Integer> currentLevel =new ArrayList<>();

           for(int i=0; i<size; i++)
           {
               Node p= queue.remove();
               currentLevel.add(p.data);

               if(p.left != null)
                    queue.add(p.left);
               if(p.right != null)
                   queue.add(p.right);
           }
           result.add(currentLevel);
       }
       return result;
   }

   public void leftView(Node root)
   {
      List<List<Integer>> list= levelOrderLevelByLevelByYoutube(root);

      for(int i=0 ; i< list.size(); i++)
      {
          out.print(list.get(i).get(0) + " ");
      }

   }

    public void rightView(Node root)
    {
        List<List<Integer>> list= levelOrderLevelByLevelByYoutube(root);

        for(int i=0 ; i< list.size(); i++)
        {
            out.print(list.get(i).get(list.get(i).size()-1) + " ");
        }

    }

}


class LevelOrderLevelByLevel
{

    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(7);
        root.left.left=new Node(9);
        root.left.right=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(3);

        BinaryTree tree=new BinaryTree();
//        tree.preOrder(root);
        tree.levelOrderLVL(root);
        out.println("=============================");
        tree.leftView(root);

        out.println("\n=============================");
        tree.rightView(root);

    }
}*/
