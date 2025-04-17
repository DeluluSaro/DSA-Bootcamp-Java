package StacksandQueues.Custom;


public class CustomQueue{
    protected int  data[];

    private static int  size=10;


    public CustomQueue(){
        this(size);
    }


    public CustomQueue(int num){

        this.data=new int[num];

    }

    private int END=0;


    public boolean isEmpty() {
        if (END == 0) {
            return true;
        }

        return false;
    }

    public boolean isFull() {
        if (END == data.length - 1) {
            return true;
        }

        return false;
    }



    public boolean insert(int num){
        if(isFull()){
    return false;
        }

        data[END]=num;
        END++;

        // we cam also write as data[END++]=num since it chagnes after updating

        return true;
    }

    public boolean remove(){
         if(isEmpty()){
            return false;


         }


        //  shifted to left side by one for removal
        int removed=data[0];


        for(int i=1;i<END;i++){
            data[i-1]=data[i];



        }

        System.out.println("i have removed it bro"+ removed);

        END--;


         return true;
    }


    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
System.out.println("Queue : ");
        for(int i=0;i<END;i++){
            System.out.print(data[i] + " ");
        }
    }

}