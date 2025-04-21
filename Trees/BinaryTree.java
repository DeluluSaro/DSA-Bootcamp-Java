package Trees;

import java.util.Scanner;

public class BinaryTree{

    private class Node{
        private int val;
        private Node left;
        private Node right;


        public Node(int val){
            this.val=val;
        }
        
    }

    private Node root;

    public void insert(Scanner scanner){

        System.out.println("Enter the root node value :");
        int val=scanner.nextInt();
        this.root=new Node(val);
        insert(scanner,root);


        
    }

    private void insert(Scanner scanner,Node node){
        // for inserting value into the left node  
        System.out.println("Do you need to add an left node to " + node.val + " ?");
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left node :");
            int val=scanner.nextInt();
            node.left=new Node(val);
            insert(scanner ,node.left);

        }


        // for inserting into right
        System.out.println("Do you need to add an right node to " + node.val + " ?");
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right node :");
            int val=scanner.nextInt();
            node.right=new Node(val);
            insert(scanner ,node.right);

        }
    }


    public void display(){
        display(root,"");
        // indentation is increased at each recursion to make the tree visible to the user 
    }


    private void display(Node node,String indent){

        if(node==null){
            return;
        }



        System.out.print(indent + node.val);

        display(node.left, indent + "\t");
        display(node.right,indent + "\t");




    }

    public void preorder(){
        preorder(root);
        
    }

    private void preorder(Node node){
        if(node==null){
            return;
        }

        // preorder means node-left-right;
        System.out.print(node.val + " "); //node
        preorder(node.left); //left
        preorder(node.right); //right
    }

    public void Inorder(){
        Inorder(root);
        
    }

    private void Inorder(Node node){
        if(node==null){
            return;
        }

        // preorder means left-node-right;
        
        Inorder(node.left); //left
        System.out.print(node.val + " "); //node
        Inorder(node.right); //right
    }



    public void postOrder(){
        postOrder(root);
        
    }

    private void postOrder(Node node){
        if(node==null){
            return;
        }

        // preorder means left-right-node;
        
        postOrder(node.left); //left
      
        postOrder(node.right);//right

        System.out.println(node.val + " "); //node
    }




    


}