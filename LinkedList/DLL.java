public class DLL {

    Node head;


    // Insert at front

    public void insertAtFront(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    // Insert At Last

    public void insertAtLast(int num){

        // since we have [null]--->[67]---->54 we need to start from head
        Node node=new Node(num);
        if(head==null){
            insertAtFront(num);
            return;
        }

        Node last=head;

        while(last.next!=null ){
            last=last.next;
            
        }
        
        last.next=node;
        if(node.prev != null){
            node.prev=last;
        }
        last=node;

        last.next=null;



    }

    public void placeAfter(int val ,int place){

        Node node=new Node(76);

        Node temp=head;

        while(temp.next!=null){
            if(temp.val!=val){
                temp=temp.next;
            }

            
        }
        
        temp.next=node;
        node.prev=temp;
        if(node.next==null){
            node.next=null;
        }
        


    }



    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.val + "-->");
            temp=temp.next;
        }
        System.out.print("Start");
        System.out.println();
    }

    public void dispReverse(){
        Node temp=head;
        Node last=null;

        while(temp!=null){
            last=temp;
            temp=temp.next;

        }

        while(last!=null){
            System.out.print(last.val + "-->");
            last=last.prev;
        }
        System.out.print("End");
    }
    

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node (int val){
            this.val=val;
        }

        public Node (int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
