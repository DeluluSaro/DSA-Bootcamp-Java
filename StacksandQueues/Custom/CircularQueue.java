package StacksandQueues.Custom;
// why circular queue ?
// Inorder to have constant time complexity to put the elements.
public class CircularQueue {

    protected int data[];
    private static final int DEFAULT_SIZE = 10;

    protected int end=0;
    protected int start=0;
    private int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }


    public CircularQueue(int num){
        this.data=new int[num];
    }


    public boolean isFull(){
        // the reason why we didnt took end because end will come back again again since we use modulus 
        return size==data.length;
    }


    public boolean isEmpty(){
        return size==0;
    }


    public void insert(int val){
        if(isFull()){
            System.out.println("Full pa");
            return ;
        }
        data[end++]=val;
        end=end%data.length;

        size++;
        return;
    }

    public void remove(){
        if(isEmpty()){
            System.out.println("NO VALUES FOUND");
            return;

            
        }

        int removes=data[start++];
        start=start%data.length;
        size--;
    }

    public void display(){
        if(isEmpty()){
            return;

        }

        int i=start;


        do{
            System.out.println(data[i]);
            i++;
            i=i%data.length;
        }while(i!=end);
    }


}
