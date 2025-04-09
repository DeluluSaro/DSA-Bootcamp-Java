package OOPS.Properties.Inheritence;

public class Inherited  extends Box{

    float noofItems;

    Inherited(float a,float b,float c ,float d){

        super(a, b, c); //super is used to access the constructor of the parent class 
        // it will access the constructor with 3 arguments
        
        this.noofItems=d;

    }

    public static void main(String[] args) {


        Inherited inh=new Inherited(1,2,3,4);


        System.out.println(inh.h + " " + inh.l+" "+ inh.w+" "+inh.noofItems);
        
    }
    
}



// super 