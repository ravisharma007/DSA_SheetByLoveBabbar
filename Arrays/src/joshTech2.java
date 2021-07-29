/*
import java.util.*;

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class Driver
{
    public static void main(String[] args) {
        Node head=new Node(9);
        head.next=new Node(9);
        head.next.next=new Node(9);

        int num=15;

        Solution obj=new Solution();
        obj.display(head);
        System.out.println("\n-------------------");
         head= obj.add(head,num);

        System.out.println("\n-------------------");
        obj.display(head);
    }
}

class Solution
{
    public Node reverse(Node head)
    {
        Node p,q,r;
        p=head;
        q=head.next;
        if(head.next!=null)
            r=head.next.next;
        else
            r=null;

        while(q!=null)
        {
            q.next=p;
            p=q;
            q=r;
            if(r!=null)
                r=r.next;
        }
        head.next=null;
        head=p;
        return head;
    }

    public void display(Node head)
    {
        Node p=head;
        while(p!=null)
        {
            System.out.print(p.data + ", ");
            p=p.next;
        }
    }
    public Node add(Node head,int num)
    {
        head=reverse(head);
//        display(head);

        Node temp=head,prevNode=head;
        int carry=0;
        while(temp!=null)
        {
            int x=num%10;
            num=num/10;
            int data= (temp.data+x) + carry;
            temp.data=data%10;
            carry = data /10;
            prevNode=temp;
            temp=temp.next;
        }

        while (carry !=0 || num != 0)
        {
            int x=num%10;
            num=num/10;
            int data = carry % 10 + x;
            prevNode.next = new Node(data);
            carry=data/10;
            prevNode=prevNode.next;
        }

        head=reverse(head);
        return head;
    }
}*/
