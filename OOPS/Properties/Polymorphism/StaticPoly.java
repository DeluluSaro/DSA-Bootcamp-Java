package OOPS.Properties.Polymorphism;

public class StaticPoly {
    int height;
    int width;

    


    public static void main(String[] args) {
        Areas are=new Areas();
        are.Area();
        are.Area(10,20);
        are.Area(10,20,30);
        // The compiler decide which methoud to release the output not in run time
        // hence it is static polymorphism     
    }



}


class Areas{
    void Area(){
        System.out.println("No idea bro");
    }

    void Area(int a,int b){
        System.out.println(a*b);
    }

    void Area(int a,int b,int c){
        System.out.println(a*b*c);
    }
}
