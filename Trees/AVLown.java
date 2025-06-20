package Trees;
class AVLown{
  
  private class Node{
    private Node left;
    private Node right;
    private int val;
    private int height;


    public Node(int val){
      this.val=val;
    }
  }


  Node root;


  public void insert(int val){
    root=insert(val,root);
  }


  private int height(Node node){
    if(node==null){
      return -1;
    }


    return node.height;



  }

  private Node insert(int val,Node node){
    if(node==null){
      node=new Node(val);
      return node;
    }


    if(val>node.val){
      node.right=insert(val, node.right);
    }

    if(val<node.val){
      node.left=insert(val, node.left);
    }



    node.height=Math.max(height(node.left), height(node.right))+1;



    return rotate(node);

  }


  private Node rotate(Node node){

    if(height(node.left)-height(node.right) > 1){
      // left heavy

      if(height(node.left.left)-height(node.left.right)>0){
          return rightrotate(node);
      }

      if(height(node.left.left)-height(node.left.right)<0){

        node.left=leftrotate(node.left);
        return rightrotate(node);

      }

      
    }



     if(height(node.left)-height(node.right) < -1){
      // right heavy

      if(height(node.right.left)-height(node.right.right)<0){
          return leftrotate(node);
      }

      if(height(node.right.left)-height(node.right.right)>0){

        node.right=rightrotate(node.right);
        return leftrotate(node);

      }

      
    }



    return node;
  }


  private Node leftrotate(Node child){


    Node parent=child.right;
    Node t2=parent.left;
    parent.left=child;
    child.right=t2;


    parent.height=Math.max(height(parent.left), height(parent.right))+1;
    child.height=Math.max(height(child.left), height(child.right))+1;

    return parent;
  }

  

  private Node rightrotate(Node parent){


    Node child=parent.left;
    Node t2=child.right;
    child.right=parent;
    parent.left=t2;


    parent.height=Math.max(height(parent.left), height(parent.right))+1;
    child.height=Math.max(height(child.left), height(child.right))+1;

    return child;
  }

 


  public void display(){
    display(root,"");
  }


  private void display(Node node,String indent){
    if(node==null){
      return;
    }


    System.out.println(node.val + indent);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }



  public boolean isBalanced(){
    return isBalanced(root);
  }


  private boolean isBalanced(Node node){

    if(node==null){
      return true;
    }


    return Math.abs(height(node.left)-height(node.right))<=1 && isBalanced(node.left) && isBalanced(node.right);
  }




}