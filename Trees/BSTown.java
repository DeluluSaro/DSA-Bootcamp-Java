package Trees;

public class BSTown{


    private class Node {
        private Node left;
        private Node right;
        private int val;
        private int height;


        public Node(int val){
            this.val=val;
        }
    }


    private Node root;


    public boolean isEmpty(){
        if(root==null){
            return true;
        }

        return false;
    }


    public void insert(int val){
        root = insert(val,root);
    }

    private Node insert(int val,Node node){
        if(node==null){
            node =new Node(val);
            return node;
        }


        if(val>node.val){
            node.right=insert(val, node.right);
        }

        if(val<node.val){
            node.left=insert(val, node.left);
        }


        node.height=Math.max(height(node.left), height(node.right))+1;

        



        return node;
    }



    public void display(){
        display(root , "");
    }


    private void display(Node node,String indent){
        if(node == null){
            return ;
        }

        System.out.println( indent+node.val);

        display(node.left, indent+ "\t");
        display(node.right, indent + "\t");
    }


    public boolean search(int val){
        return search(val,root);
    }


    private boolean search(int val,Node node){
        if(node==null){
            return false;
        }


        if(node.val==val){
            return true;
        }



        if(val>node.val){
            return search(val, node.right);
        }

        if(val<node.val){
            return search(val, node.left);
        }

        return false;


        
    }


     


    private int height(Node node){


        if(node ==null){
            return -1;
        }

        return node.height; 
    }


    public boolean balanced(Node node){
        if(node==null){
            return true;
        }

        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

}