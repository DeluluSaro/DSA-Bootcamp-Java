package StacksandQueues.Custom;
// for creating extra spaces dynamically;
public class DynamicQueue extends CircularQueue {

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int num){
        super(num);
    }

    @Override
    public void insert(int val) {
        if(isFull()){
            int[] temp=new int[data.length*2];

            for(int i=0;i<data.length;i++){

                // since ith item from the front  
                temp[i]=data[(start+i) % data.length];
            }


            start=0;
            end=data.length;


            data=temp;
        }
        super.insert(val);
    }
    
}
