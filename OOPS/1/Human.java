


    package OOPS.a;


     
    






class Main{
    
    public static class Human{



        int age;
        String name;
        boolean marriageStatus ;
        int salary;

        // static keyword is used to suppose a particular property is common to all and it should be give to all the object as common example
        // eg. if i declare more new objects of human ,each of the object will have a new age,name,marriageStatus,salary but population is common for all humans 
        // hence if it is kept as Static then even the new object is createad it is upadted together 
        // Try to run this code to see it    
        static  long population;


        Human(int age,String name, boolean marriageStatus,int salary){
            this.age=age;
            this.name=name;
            this.marriageStatus=marriageStatus;
            this.salary=salary;


            // try to print the population 
            Human.population+=1;
        }







    
    
}
    public static void main(String[] args) {
        Human hum=new Human(24, "Saravana", false, 10000);
        
        Human hum1=new Human(24, "Saravana", false, 10000);


        // Static variables should be accessed by the class Name ,U can do it with this or normal object name to print population 
        // BUt recommeded to print or update using class Name alone.
        System.out.println(Human.population);


    }
}


// Why Public static void main ?
// static is used if we want to make our methoud or function to be independent on running without creating an object of class  
// We have a class Main under that only we write pubic static void main ----> if we want to run the class Main we need to create and object or Construtor for running but to make a independent function that runs in independently without objects we use static keyword    


// BONUS POINTS


// 1. Into an static methoud an non static methouds cant run hence the methoud that is  created  should be static if it needs to run inside static methoud

// Example:

//  void messgae(){(only object can make it run)
//     Sytem.out.println("Hello");
//  }

//  public static void main(){
//     // message(); this wont run because static methoud will approve only static methoud
//  }

// 2.Since the static is independent of class this keyword does not work inside it.

// 3. Outermost class cannot be static  only inner class 