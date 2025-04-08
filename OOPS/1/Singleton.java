package OOPS.1;
// Only one instance of the class is allowded like only we can create only one object
public class Singleton {

    // so we cant use the constructor as constructor with  a new keyword create object hence private it

    private Singleton(){}


    private static Singleton obj;


    public static Singleton GetInstance(){

        if(obj==null){
            obj=new Singleton();
        }


        return obj;

    }
    
}




// GO to USe singleton program to use Single ton code
