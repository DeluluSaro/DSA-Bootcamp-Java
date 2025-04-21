package Trees;

public class AVLown {


    private class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;


        public Node(int val){
            this.value=val;
        }
    }


    private Node root;

    public void insert(int val){
        root= insert(root,val);
        
    }

    private Node insert(Node node,int val){
        if(node==null){
            node=new Node(val);
            return node;
        }

        if(val>node.value){
            node.right=insert(node.right, val);
        }
        if(val<node.value){
            node.left=insert(node.left, val);
        }


        node.height=Math.max(height(node.left), height(node.right))+1;


        return rotate(node);

        
    }

    public Node rotate(Node node){

        if(height(node.left)-height(node.right) >1){


            if(height(node.left.left)-height(node.left.right)>0){
                return rightRotate(node);
            }


            if(height(node.left.left)-height(node.left.right)<0){
              node.left=leftRotate(node.left);
              return rightRotate(node);
            }


            

        }


        if(height(node.left)-height(node.right) <-1){


            if(height(node.right.left)-height(node.right.right)>0){
                return leftRotate(node);
            }


            if(height(node.right.left)-height(node.right.right)<0){
              node.right=rightRotate(node.right);
              return leftRotate(node);
            }


            

        }
        return node;
    }


    private Node rightRotate(Node p){

        Node c=p.left;
        Node t2=c.right;
        c.right=p;
        p.left=t2;

        p.height=Math.max(height(p.left), height(p.right))+1;
        c.height=Math.max(height(c.left), height(c.right))+1;

        

        return c;
    }

    private Node leftRotate(Node c){

        Node p=c.right;
        Node t2=p.left;
        p.left=c;
        c.right=t2;


        p.height=Math.max(height(p.left), height(p.right))+1;
        c.height=Math.max(height(c.left), height(c.right))+1;

        return p;



        
    }


    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent){

        if(node==null){
            return;
        }

        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public int height(Node node){
        if(node==null){
            return -1;
        }

        return node.height;
    }

    
}
