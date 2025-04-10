


 class Saravana extends Parent{

    Saravana(String gender){
        super(gender);
    }
    
    
    void name(){
        System.out.println("My Name is Saravana.");
    };


    
    void age(){
        System.out.println("My age is 22");
    };



    public static void main(String[] args) {
        Saravana sro=new Saravana("male");
        sro.name();
        sro.age();
    }

}



