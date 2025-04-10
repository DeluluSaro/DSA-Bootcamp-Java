package OOPS.Interface;

public class Main implements Car,Screen {
    @Override
    public void Screensize() {
        System.out.println("4000x1020");
        
    }
    @Override
    public void acc() {
        System.out.println("25% brake applied");
        
        
    }
    @Override
    public void brake() {
        System.out.println("left side brake");
        
    }
    @Override
    public void location() {
        System.out.println("Show current location");
        
    }
    @Override
    public void music() {
 System.out.println("Play musixcin screen");
    }
    @Override
    public void seats() {
        System.out.println("Good seats");
         
    }



    public static void main(String[] args) {
        Main main=new Main();
        main.Screensize();
    }


}
