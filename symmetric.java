/*
Given the root of a binary tree, check whether it is symmetric, i.e., whether the tree is a mirror image of itself.
    */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left = right = null;
    }

}
public class symmetric {
        public static boolean issymmetric(Node root) {
            if (root == null) {
            return true;
            }
            return ismirror(root.left,root.right);
        }
        public static boolean ismirror(Node left, Node right){
            if(left==null && right ==null){
                return true;
            }
            if(left== null || right == null){
                return false;
            }
            return(left.data==right.data)
                   && ismirror(left.left, right.right)
                    && ismirror(left.right, right.left);
        }
        public static Node buildtree(Scanner ob){
            System.out.println("enter root value");
            int data =ob.nextInt();
            if(data==-1){
                return null;
            }
            Node root=new Node(data);
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node current =q.poll();
                System.out.println("Enter left of "+current.data+":");
                int leftData=ob.nextInt();
                if(leftData != -1){
                    current.left=new Node(leftData);
                    q.add(current.left);
                }
            }
            return root;
        }
        public static void main(String[] args){
            Scanner ob=new Scanner(System.in);
            Node root= buildtree(ob);
            if(issymmetric(root)){
                System.out.println("Tree is symmetric");
            }
            else{
                System.out.println("Tree is not symmetric");
            }
        }
}
