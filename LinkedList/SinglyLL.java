public class SinglyLL {

    private int size;
    private Node head;
    private Node tail;

    // insert At First of the linked List

    public void insertAtFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;


        if(tail==null){
            tail=head;
        }

        size++;
    }

    // INsert at LAst

    public void insertAtLast(int val){
        if(head==null){
            insertAtFirst(val);
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;


        size++; 
    }

    // insert at particular point

    public void insertAtParticular(int  val,int index){
        if(index==0){
            insertAtFirst(val);
            return;
        }
        if(index==size){
            insertAtLast(val);
        }


        Node temp=head;

        for(int i=1;i<index;i++){
            temp=temp.next;

        }
        Node after=temp.next;
        Node node=new Node(val);

        temp.next=node;

        node.next=after;

        size++;
    }

    // Delete First Element

    public void deleteFirst(){
      int num=head.val;

      head=head.next;

      System.out.println(num);
      
      
      size--;


    }

    public void deleteLast(){

        if(size<=1){
            deleteFirst();
        }

        Node temp=head;

        for(int i=1;i<size-1;i++){
            temp=temp.next;

        }
        System.out.println(temp.val);

        temp.next=null;

        tail=temp;

        size--;

    }


    public void deleteIndex(int val){

        if(val==0){
deleteFirst();
return;
        }

        if(val==size){
            deleteLast();
            return;
        }



        Node temp=head;

        for( int i=1;i<val;i++){
            temp=temp.next;
        }
        System.out.println(temp.val);


        Node afterDelete=temp.next.next;


        System.out.println(afterDelete.val);

        temp.next=afterDelete;

        return ;

  
    }



    // display Elements
    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.print("end");
    }



    public int size(){
        System.out.println(size);
        return size;
    }

    public void displayHead(){
        System.out.println(head.val);

    }

    public void displayTail(){
        System.out.println(tail.val);

    }
    private class Node{
        private int val;
        private Node next;


        public Node(int val){
            this.val=val;

        }
        public Node(int val,Node next){
            this.next=next;
            this.val=val;
        }
    }
}
