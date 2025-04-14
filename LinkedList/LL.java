// public class LL{
//     // LL is kind of --> that will connect all node to the input 

//     private Node head;
//     private Node tail;
//     private int size;

//     public LL(){
//         this.size=0;
//     }

//     void display(){
//         Node temp=head;

//         while(temp!=null){
//             System.out.print(temp.val + "-->");
//             temp=temp.next;
//         }

//         System.out.print("end");


//     }

//     public void insertAtFirst(int val){
//         Node node=new Node(val);
//         node.next=head;
//         head=node;


//         if(tail==null){
//             tail=head;
//         }

//         size+=1;
//     }

//     public void insertAtLast(int val){
//         Node node=new Node(val);
//         tail.next=node; // attack next to tail 
//         tail=node;//change the tail


//         if(head==null){
//             head=tail;
//         }


//         size+=1;
//     }


//     public int size(){
//         return size;
//     }



//     private class Node{

//         //  this the main class wher it []
//         // each of the element is of the same class 

//         // class Node gives this [] and class LL connects ---> with []

//         private int val;  //saves value or data
//         private Node next; //saves the  the address of the next as the next value will also be the same type of this 
//         // all the LL is the type of class
//         public Node(int val){
//             this.val=val;
//         } 

//         public Node(int val,Node next){
//             this.val=val;
//             this.next=next;
//         }
//     }
// }


public class LL{

    private int size;
    private Node head;
    private Node tail;
    // Head and Tail are reference to the main LL


    LL(){
        size=0;
    }

    public void insertAtFirst(int val){
        Node node=new Node(val);

        node.next=head;
        head=node;


        size++;

        if(tail==null){
            tail=head;
        }
    }

    public void insertAtLast(int val){

        if(head==null){
            insertAtFirst(val);
            return;
        }

        Node node=new Node(val);

        tail.next=node;
        tail=node;

        size++;

        

    }


    public void insertAtIndex(int val,int index){
        if(index==0){
            insertAtFirst(val);
            return;
        }

        if(index==size){
            insertAtLast(val);
            return;
        }


        Node temp=head;
        // since 0 is already taken by head temp we can start from 1

        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + " --> ");
            temp=temp.next;
        }

        System.out.print("End");
    }

    public int showHead(){
        return head.val;
    }

    public int showTail(){
        return tail.val;
    }
    public int size(){
        return size;
    }

    
    


    private class Node{
        private Node next;
        private int val;

        // To save the  value and its next object reference
        public Node(int val){
            this.val=val;

        } 
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
}