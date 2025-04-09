package OOPS.Properties.Inheritence;

//  this is the code for hierarchical inheritence  

// single inheritenceis also allowded

// multiple inheritence and hybrid inheritence is not allowded as multiple inheritence will collapse java to which entity to select and hybrid inhertene is a combination of hierarchical and multiple inheritence
 
public class Box {

// length,height,width  of the box
    float l;
    float h;
    float w;


    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

// cube
    Box(float size){
        this.l=size;
        this.h=size;
        this.w=size;

    }


    Box(float a ,float b,float c){
        this.l=a;
        this.h=b;
        this.w=c;
    }


  void Printer(){
    System.out.println("Hello Guys");
  }


  public static void main(String[] args) {

    Cube sk =new Cube(25);


    System.out.println(sk.cost);
    System.out.println(sk.h);

    Cuboid cub=new Cuboid(1.3f,6);

    System.out.println(cub.sides);
    System.out.println(cub.l);
    
  }
    
}


class Cube extends Box{

    int cost ;
    Cube(int cost){
     super();

     this.cost=cost;


    }
}

class Cuboid extends Box{
    int sides;
    Cuboid(float num,int sides){
        super(num);
        this.sides=sides;
    }
}


