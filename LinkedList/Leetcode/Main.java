package Leetcode;

public class Main {
    public static void main(String[] args) {
        RecursiveInsert rsv=new RecursiveInsert();
        
        rsv.insertValue(23, 0);
        rsv.insertAtFirst(245);
        rsv.insertAtLast(45);
        rsv.insertValue(0, 2);
        rsv.display();
    }
}
