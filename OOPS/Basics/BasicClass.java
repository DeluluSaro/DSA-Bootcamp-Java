class BasicClass {
    public static void main(String[] args) {
        
        // for 1
        Student stu=new Student();

         stu.cgpa=9.38f;

         stu.name="Saravana";


         System.out.println(stu.name);
         System.out.println(stu.rollno);
         System.out.println(stu.cgpa);


        //  For 2.

        Student stu2=new Student(13,"Akshitta",9.23f);

        System.out.println(stu2.rollno);
        System.out.println(stu2.name);
        System.out.println(stu2.cgpa);

        // for 3.

        ObjectPassing obj=new ObjectPassing(5,4);


        
        


    }

    // 1.Basic Declaration of classn Student
   static class Student {
        int rollno;
        String name;
        float cgpa;


    // 2. Making an Constructor

    Student(){
        System.out.println("Hello da punda");
    }


    // Passing Arguments to Constructor and constructor overloading 


    Student(int rollno,String name,float cgpa){
        // this keyword is use to specify that that instance variable is refering to this particular object
        this.rollno=rollno;
        this.name=name;
        this.cgpa=cgpa;
    }


    



    }


    static class ObjectPassing{

        int a;
        int b;


        ObjectPassing(){
          this( 4,  5);
        }

        ObjectPassing(int a,int b){
            System.out.println(a+b);
        }
    } 
}