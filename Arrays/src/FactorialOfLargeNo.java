/*
import java.util.*;

class Node
{
    int data;
    Node prev;

    public Node(int data)
    {
        this.data=data;
        prev=null;
    }
}

class Solution {
    static ArrayList<Integer> factorial(int n){
        //code here
        Node tail=new Node(1);

        for(int i=2; i<=n; i++)
        {
            multiply(tail,i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        Node p=tail;
        toArraylist(p,list);
        return list;
    }

    public static void toArraylist(Node p,ArrayList<Integer> list)
    {
        if(p != null)
        {
            toArraylist(p.prev,list);
            list.add(p.data);
        }
    }

    public static void multiply(Node tail,int n)
    {
        Node temp=tail,prevNode=tail;
        int carry=0;

        while(temp != null)
        {
            int data=(temp.data * n) + carry;
            temp.data= data%10;
            carry = data/10;
            prevNode=temp;
            temp=temp.prev;
        }

        while (carry !=0)
        {
            prevNode.prev=new Node(carry%10);
            carry=carry/10;
            prevNode= prevNode.prev;
        }
    }
}
*/
