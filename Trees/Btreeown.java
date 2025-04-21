package Trees;

import java.util.Scanner;

public class Btreeown {
    


    private class Node{
        private int value;
        private Node left;
        private Node  right;


        public Node(int val){
            this.value=val;
        }
    }

    private Node root;

    
    public boolean isEmpty(){
        if(root==null){
            return true;
        }


        return false;
    }


    public void insert(Scanner scanner){
        System.out.println("Enter the root node value :");
        int val=scanner.nextInt();
        root=new Node(val);

        insert(scanner , root);
    }


    private void insert(Scanner scanner,Node  node){

        System.out.println("Do you want to add a value to left of the " + node.value + " : ");
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value for the left tree : ");
            int val=scanner.nextInt();

            node.left=new Node(val);
            insert(scanner , node.left);
        }


        System.out.println("Do you want to add a value to right of the " + node.value + " : ");
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value for the right tree : ");
            int val=scanner.nextInt();

            node.right=new Node(val);
            insert(scanner , node.right);
        }

     


    }



    public void display(){
        display(root," root node : ");
    }

    private void display(Node node,String indent){
        if(node==null){
            return ;
        }


        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
}
