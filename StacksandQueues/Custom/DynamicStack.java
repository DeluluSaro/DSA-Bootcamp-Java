package StacksandQueues.Custom;

public class DynamicStack extends CustomStack{
    // Stack that never has a memory limit if the partiular array 
    // is full create a new array copy its element and extend till the doublt size of the stack

    // here  peek isFull isEmpt  are same only no changes
    // while pushing if Full make new Array thats all
    

    public DynamicStack(){
        super();
    }

    public DynamicStack(int n){
        super(n);
    }

     @Override
     public int pushed(int nu) {
         // TODO Auto-generated method stub

         if(super.isFull()){
            int[] temp=new int[data.length*2];




            for(int i=0;i<temp.length;i++){
                temp[i]=data[i];
            }


            data=temp;
         }

        //  At this point the stack is filled hence we can call the super class ispush itself

         return super.pushed(nu);
     }

}
