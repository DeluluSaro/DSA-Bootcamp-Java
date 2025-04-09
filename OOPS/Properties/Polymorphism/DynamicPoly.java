package OOPS.Properties.Polymorphism;

// Points to Remember:
// Polymorphism means many forms.  
// is like hierachical clustering   
// eg shape is a main class and Circle is form of shape and Square is a form of shape ---> Shape takes many forms
//  carefully see it it is like a hierarchical custering 

// Explain about the @Override explained

public class DynamicPoly {

    // main function from  Parent class 

     void Area(){
        System.out.println("This is a Area of Main Class");
    }

    public static void main(String[] args) {


        DynamicPoly circle=new Circle();
        // Note her i have called the Parentclass obj=new Childclass()
        // this  invokes the overide with the methoud inside the Circle not the Area() methoud inside main DynamicPoly
        circle.Area();
        
    }
    
}

class Circle extends DynamicPoly{

    // Here i have overrided the methoud from the Parent class
    // In order to check whether i have override we can check using @Override
    // @Override -is just annotation that check whether the user has overridded that the function or not 
    // to check @Override change the Function name of Area to Areaaa this will make @Override shows error in runtime

    @Override
    void Area(){
        System.out.println("This is from Circle");
    }


    

}

class Square extends DynamicPoly{
    @Override
    void Area(){
        System.out.println("This is a square.");
    }
}
