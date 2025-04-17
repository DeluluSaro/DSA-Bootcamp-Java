package StacksandQueues.Custom;

public class CustomStack {

    protected int[] data; // 1.since the stack is interiorly a array we are declaring it.

    private static int SIZE = 10;
    // 2.default size if size not given

    // 5.Make a pointer to -1 and move that pointer to remove and insert element
    // into array

    private int PTR = -1;

    public boolean isEmpty() {
        if (PTR == -1) {
            return true;
        }

        return false;
    }

    public boolean isFull() {
        if (PTR == data.length - 1) {
            return true;
        }

        return false;
    }

    public int pop()  {

        if (isEmpty()) {
            System.out.println("Stack is empty!!!");
            return 0;
        }

        int removed = data[PTR];
        PTR--;

        return removed;

    }

    public int pushed(int n)  {
        if (isFull()) {
            System.out.println("Stack is full.");
            return -1;
        }
        PTR++;

        data[PTR] = n;
        int num = data[PTR];

        return num;
    }

    public int peek()  {
        if (isEmpty()) {
            System.out.println("Stack is Empty can't find peek");
            return -1;
        }

        return data[PTR];
    }

    public CustomStack() {
        this(SIZE);
        // 3.this her will call the constructor of similiar type
    }

    public CustomStack(int size) {
        this.data = new int[size];

        // 4.if the user give size like 10,20,30;
    }

}
