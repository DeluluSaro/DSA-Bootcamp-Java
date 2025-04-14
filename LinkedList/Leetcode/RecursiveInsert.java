package Leetcode;

public class RecursiveInsert {
    private int size;
    private Node head;
    private Node tail;

    public RecursiveInsert() {
        size = 0;
    }

    // Find cycle in a linkedList

    public boolean isCycled(RecursiveInsert head1) {

        Node slow = head1.head;
        Node fast = head1.head;

        while (fast != null && fast.next != null)   {

            fast = fast.next.next;
            slow = fast.next;

            if (fast == slow) {
                return true;
            }

        }

        return false;
    }



    // GIve the length of the cycle present
  
    public int lengthOfCycle(RecursiveInsert head1) {

        Node slow = head1.head;
        Node fast = head1.head;
        int count=0;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = fast.next;

            if (fast == slow) {
                Node temp=slow;

                do{
                    temp=temp.next;
                    count++;
                }while(temp!=slow);
            }

        }

        return count;
    }

    public void insertValue(int val, int index) {

        if (index == 0) {
            insertAtFirst(val);
            return;
        }

        if (index == size) {
            insertAtLast(val);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;

    }

    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.num + "-->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void recursiveInsert(int val, int index, Node node) {

        if (index == 0) {

            Node acc = new Node(val, node);
            node.next = acc;

            return;
        }

        recursiveInsert(val, index--, node.next);

    }

    private class Node {
        private int num;
        private Node next;

        public Node(int val) {

            this.num = val;

        }

        public Node(int val, Node next) {
            this.num = val;
            this.next = next;
        }
    }

}
