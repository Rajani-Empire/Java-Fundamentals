import java.util.*;


class Pen{

     String colour;
     String type;


     public void write(){
        System.out.println("writing something...\n");
     }

     public void print(){
        System.out.println(this.colour);
        System.out.println(this.type+"\n");
     }


}



class Student{
    String name;
    int age;


    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age+"\n");
    }
}






public class JAVAOOP {

    public static void  main(String args[]){
    
    Pen pen1 = new Pen();
    pen1.colour = "blue";
    pen1.type = "ballpen";

    Pen pen2 = new Pen();
    pen2.colour = "green";
    pen2.type = "gel";

    pen1.write();
    pen1.print();
    pen2.print();



    Student s1 = new Student();
    s1.name = "janu";
    s1.age = 25;

    Student s2 = new Student();
    s2.name = "me";
    s2.age = 21;

    s1.printinfo();
    s2.printinfo();


    

    }
    
}
