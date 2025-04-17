package StacksandQueues.Custom;

public class Main {
    public static void main(String[] args) {
        // CustomStack stk=new CustomStack(10);
        // stk.pushed(23);
        // System.out.println(stk.peek());
        // System.out.println(stk.pop());;
        // stk.peek();
        // DynamicStack ds=new DynamicStack(2);
        // stk.pushed(0);
        // stk.pushed(1);
        // System.out.println(stk.pushed(23));

        // stk.pushed(2345);

        // System.out.println(stk.peek());
        // System.out.println(stk.pop());
        // System.out.println(stk.peek());



        // CustomQueue cq=new CustomQueue();
        // cq.display();
        // cq.insert(23);
        // cq.insert(75);
        // cq.insert(69);
        // cq.insert(45);
        // cq.remove();
        // cq.display();


        CircularQueue cir=new CircularQueue();

        cir.insert(0);

        cir.insert(3);

        cir.insert(2);

        cir.insert(5);

        cir.insert(25);

        cir.display();



    }
    
}
