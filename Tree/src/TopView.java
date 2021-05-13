//import java.util.*;
//import java.io.*;
//
//class Node {
//    Node left;
//    Node right;
//    int data;
//
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}
//
//class TopView {
//
//    /*
//
//    class Node
//        int data;
//        Node left;
//        Node right;
//    */
//    static class Pair
//    {
//        Node p;
//        int height;
//        public Pair(Node p,int h)
//        {
//            this.p=p;
//            this.height=h;
//        }
//    }
//    public static void topView(Node root) {
//        Queue<Pair> queue=new ArrayDeque<>();
//
//        Map<Integer,Integer> map= new HashMap<>();
//        queue.add(new Pair(root,0));
//
//        while(!queue.isEmpty())
//        {
//            Pair pair=queue.remove();
//
//            if(!map.containsKey(pair.height))
//            {
//                map.put(pair.height, pair.p.data);
//            }
//
//            if(pair.p.left != null)
//                queue.add(new Pair(pair.p.left,pair.height-1));
//
//            if(pair.p.right != null)
//                queue.add(new Pair(pair.p.right,pair.height+1));
//        }
///*
//        Iterator <Integer> it = map.keySet().iterator();
//        while(it.hasNext())
//        {
//            int key=(int)it.next();
//            System.out.println("Roll no:  "+key+"     name:   "+map.get(key));
//        }*/
//
//        TreeMap<Integer,Integer> tm=new  TreeMap<Integer,Integer> (map);
////        Iterator itr=tm.keySet().iterator();
////        while(itr.hasNext())
////        {
////            int key=(int)itr.next();
////            System.out.println(map.get(key) + " ");
////        }
//
//        tm.forEach((x,y) -> System.out.print(y + " "));
//
//        map.forEach((x,y) -> System.out.print(y + " "));
//
//    }
//
//
//
//
//    public static Node insert(Node root, int data) {
//        if(root == null) {
//            return new Node(data);
//        } else {
//            Node cur;
//            if(data <= root.data) {
//                cur = insert(root.left, data);
//                root.left = cur;
//            } else {
//                cur = insert(root.right, data);
//                root.right = cur;
//            }
//            return root;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        Node root = null;
//        while(t-- > 0) {
//            int data = scan.nextInt();
//            root = insert(root, data);
//        }
//        scan.close();
//        topView(root);
//    }
//}