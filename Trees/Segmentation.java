package Trees;
public class Segmentation {
    private class Node{
        private Node left;
        private Node right;
        private int data;
        int startRange;
        int endRange;



        public Node (int start,int end){
            
            this.startRange=start;
            this.endRange=end;
        }

    }




    Node root;
    public Segmentation(int[] arr){

    this.root=constructTree(arr,0,arr.length-1);
    }


    private Node constructTree(int arr[],int start,int end){
        if(start==end){
            Node leaf=new Node(start, end);
            leaf.data=arr[start];
            return leaf;
        }


        // create node index we are at
        Node node=new Node(start, end);
        int mid=(start+end)/2;


        node.left=constructTree(arr, start, mid);
        node.right=constructTree(arr, mid+1, end);


        node.data=node.left.data+node.right.data;

        return node;


    }


    public void  display(){

        display(root);

    }

    private void display(Node node){

        String str="";


        if(node.left!=null){
            str=str+"Interval=["+node.left.startRange+","+node.left.endRange+"] and data = " + node.left.data;
        }else{
            str=str+"No left child";
        }


        // for current node 
        str=str+"Interval=["+node.startRange+","+node.endRange+"] and data = " + node.data +" <= ";


        // for right
         if(node.right!=null){
            str=str+"Interval=["+node.right.startRange+","+node.right.endRange+"] and data = " + node.right.data;
        }else{
            str=str+"No right child";
        }


        System.out.println(str);

    
        // recursion


        if(node.left!=null){
            display(node.left);
        }


        if(node.right!=null){
            display(node.right);
        }


        
    }





    public static void main(String[] args) {

        int arr[]={2,3,4,5,-1,9,8,7,3};
        Segmentation tree=new Segmentation(arr);
    }
}
